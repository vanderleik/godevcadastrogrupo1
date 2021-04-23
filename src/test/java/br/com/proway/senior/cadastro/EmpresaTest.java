package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import enums.Cidades;
import enums.Paises;
import enums.UnidadesFederativas;
import model.Contatos;
import model.Empresa;
import model.Endereco;

public class EmpresaTest {
	Contatos contato = new Contatos("47 00000-0000", "47 11111-1111", "exemplos@gmail.com");
	Endereco endereco = new Endereco("Rua XV", 51, "Centro", Cidades.BLUMENAU, UnidadesFederativas.SC, "12312312312",
			Paises.BRASIl);
	Empresa empresa = new Empresa(1000001L, "Empresa Teste", LocalDate.of(2021, 04, 17), "88.888.888/0001-88", endereco,
			contato);
	Contatos contato2 = new Contatos("49 99990-0000", "49 19999-1111", "exemplos@gmail.com");
	Endereco endereco2 = new Endereco("Rua 99", 52, "Sul", Cidades.BLUMENAU, UnidadesFederativas.RS, "8989898989898",
			Paises.BRASIl);
	Empresa novaEmpresa = new Empresa(1000009L, "Empresa Nova", LocalDate.of(2020, 04, 17), "55.888.777/0001-88",
			endereco, contato);

	@Test
	public void testConstrutorEmpresa() {
		assertEquals(LocalDate.of(2021, 04, 17), empresa.getDataInicioContrato());
		assertEquals("88.888.888/0001-88", empresa.getCnpj());
		assertEquals(1000001L, empresa.getEmpresaId());
		assertEquals("Empresa Teste", empresa.getNomeEmpresa());
		assertNotEquals("Rua XX", empresa.getEndereco().getLogradouro());
		assertEquals("47111111111", empresa.getContato().getTelefoneSecundario());
		assertEquals(Cidades.BLUMENAU, empresa.getEndereco().getCidade());
	}
	
	@Test
	public void testCadastrarEmpresa() {
		ArrayList<Empresa> listaEmpresas = new ArrayList<Empresa>();
		Empresa.cadastrarEmpresa(listaEmpresas, empresa);
		assertEquals(listaEmpresas.get(0), empresa);
	}

	@Test
	public void testeAtualizarEmpresa() {
		ArrayList<Empresa> listaEmpresas = new ArrayList<Empresa>();
		listaEmpresas.add(empresa);
		Empresa.atualizarEmpresa(listaEmpresas, novaEmpresa, empresa);
		assertEquals(listaEmpresas.get(0), novaEmpresa);
		assertFalse(listaEmpresas.get(0) == empresa);
	}

	@Test
	public void testeDeletarEmpresa() {
		ArrayList<Empresa> listaEmpresas = new ArrayList<Empresa>();
		listaEmpresas.add(empresa);
		Empresa.deletarEmpresa(listaEmpresas, empresa);
		assertEquals(listaEmpresas.size(), 0);
	}

	@Test
	public void testeFormataCNPJ() {
		assertEquals(Empresa.formataCNPJ("14.572.457.0001-85:/"), "14572457000185");
	}

	@Test
	public void testeValidaCNPJ() {
		assertTrue(Empresa.validaCNPJ("14.572.457.0001-85"));
		assertFalse(Empresa.validaCNPJ("14.572.457.0001-84"));
	}
}
