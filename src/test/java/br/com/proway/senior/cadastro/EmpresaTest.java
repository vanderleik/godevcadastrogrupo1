package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDate;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.contatos.Contatos;
import br.com.proway.senior.godevcadastro.cadastro.empresa.Empresa;
import br.com.proway.senior.godevcadastro.cadastro.endereco.Endereco;

public class EmpresaTest {
	Contatos contato = new Contatos("47 00000-0000", "47 11111-1111", "exemplos@gmail.com");
	Endereco endereco = new Endereco("Rua XV", 51, "Centro", "blumenau", "SC", "12312312312", "brasil");
	Empresa empresa = new Empresa(1000001L, "Empresa Teste", LocalDate.of(2021, 04, 17), "88.888.888/0001-88", endereco, contato);
	
	@Test
	public void testConstrutorEmpresa() {
		assertEquals(LocalDate.of(2021, 04, 17), empresa.getDataInicioContrato());
		assertEquals("88.888.888/0001-88", empresa.getCnpj());
		assertEquals(1000001L, empresa.getEmpresaId());
		assertEquals("Empresa Teste", empresa.getNomeEmpresa());
		assertNotEquals("Rua XX", empresa.getEndereco().getLogradouro());
		assertEquals("47 11111-1111", empresa.getContato().getTelefoneSecundario());
	}
	
}
