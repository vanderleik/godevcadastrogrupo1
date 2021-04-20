package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.contatos.Contatos;
import br.com.proway.senior.godevcadastro.cadastro.enums.Nacionalidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.SexoPessoa;
import br.com.proway.senior.godevcadastro.cadastro.examemedico.ExameMedico;
import br.com.proway.senior.godevcadastro.cadastro.prestadorservico.PrestadorServico;

public class PrestadorServicoTest {
	
	String nome1 = "Maria";
	String sobrenome1 = "Silva";
	LocalDate dataDeNascimento1 = LocalDate.of(1994, 05, 9);
	String nomeSocial1 = "";
	String genero1 = "Cisgênero";
	SexoPessoa sexo1 = SexoPessoa.FEMININO;
	String nomeDaMae1 = "Dulce";
	String cpf1 = "99599988826";
	Nacionalidades nacionalidade1 = Nacionalidades.BRASILEIRA;
	boolean pcd1 = true;
	Integer idPrestador1 = 36;
	LocalDate dataInicio1 = LocalDate.of(2016, 04, 15);
	Integer idEmpresa1 = 10;
	Integer idSetor1 = 15;
	Contatos contatos1 = new Contatos("4799885533", "4777889955", "maria@gmail.com");
	
	String nome2 = "Joao";
	String sobrenome2 = "Souza";
	LocalDate dataDeNascimento2 = LocalDate.of(1996, 06, 11);
	String nomeSocial2 = "";
	String genero2 = "Transgênero";
	SexoPessoa sexo2 = SexoPessoa.FEMININO;
	String nomeDaMae2 = "Carla Souza";
	String cpf2 = "88899955525";
	Nacionalidades nacionalidade2 = Nacionalidades.BRASILEIRA;
	boolean pcd2 = false;
	Integer idPrestador2 = 37;
	LocalDate dataInicio2 = LocalDate.of(2018, 12, 25);
	Integer idEmpresa2 = 9;
	Integer idSetor2 = 42;
	Contatos contatos2 = new Contatos("4799775533", "499223366", "joao@gmail.com");
	
	PrestadorServico prestador1 = new PrestadorServico(nome1, sobrenome1, dataDeNascimento1, nomeSocial1, genero1, sexo2, nomeDaMae1, cpf1, 
			nacionalidade1, pcd1, idPrestador1, dataInicio1, idEmpresa1, idSetor1, contatos1);

	PrestadorServico prestador2 = new PrestadorServico(nome2, sobrenome2, dataDeNascimento2, nomeSocial2, genero2, sexo2, nomeDaMae2, cpf2, 
			nacionalidade2, pcd2, idPrestador2, dataInicio2, idEmpresa2, idSetor2, contatos2);
	
	Contatos contatos = new Contatos("4798653726", "4799887766", "steven@gmail.com");
	
	PrestadorServico prestServicoCompleto = new PrestadorServico("Steven", "Jobs", LocalDate.of(1955, 2, 24),
			"Steal", "Bissexual", SexoPessoa.MASCULINO, "Reed Jobs", "18287498007", Nacionalidades.BRASILEIRA, false, 123456,
			LocalDate.of(2018, 7, 9), 5, 7,	contatos);
	
	ArrayList<PrestadorServico> prestadores = new ArrayList<PrestadorServico>();
	
	@Test
	public void testPrestadorDeServicosCompleto() {
		assertEquals("Steven", prestServicoCompleto.getNome());
		assertEquals("Jobs", prestServicoCompleto.getSobrenome());
		assertEquals(LocalDate.of(1955, 2, 24), prestServicoCompleto.getDataDeNascimento());
		assertEquals("Steal", prestServicoCompleto.getNomeSocial());
		assertEquals("Bissexual", prestServicoCompleto.getGenero());
		assertEquals(SexoPessoa.MASCULINO, prestServicoCompleto.getSexo());
		assertEquals("Reed Jobs", prestServicoCompleto.getNomeDaMae());
		assertEquals("18287498007", prestServicoCompleto.getCpf());
		assertEquals(Nacionalidades.BRASILEIRA, prestServicoCompleto.getNacionalidade());
		assertEquals(123456, prestServicoCompleto.getIdPrestadorServico());
		assertEquals(LocalDate.of(2018, 7, 9), prestServicoCompleto.getDataInicioContrato());
		assertEquals(5, prestServicoCompleto.getIdEmpresa());
		assertEquals(7, prestServicoCompleto.getIdSetor());
		assertEquals("4798653726", prestServicoCompleto.getContatos().getTelefonePrincipal());
		assertEquals("4799887766", prestServicoCompleto.getContatos().getTelefoneSecundario());
		assertEquals("steven@gmail.com", prestServicoCompleto.getContatos().getEmail());
	}
	
	@Test
	public void testCadastrarPrestadorServico() {
		PrestadorServico.cadastrarPrestadorServico(prestadores, prestador1);
		PrestadorServico.cadastrarPrestadorServico(prestadores, prestador2);
		assertTrue(prestadores.indexOf(prestador1) == 0);
		assertTrue(prestadores.indexOf(prestador2) == 1);
	}
	
	@Test
	public void testAtualizarPrestador() {
		PrestadorServico.cadastrarPrestadorServico(prestadores, prestador1);
		PrestadorServico.atualizarPrestadorServico(prestadores, prestador1, prestador2);
		assertEquals("PrestadorServico [idPrestadorServico=37, dataInicioContrato=2018-12-25, idEmpresa=9, idSetor=42, "
				+ "contatos=Contatos [telefonePrincipal=null, telefoneSecundario=499223366, email=joao@gmail.com]]", 
				prestadores.get(0).toString());
	}
	
	@Test
	public void testDeletarPrestador() {
		PrestadorServico.cadastrarPrestadorServico(prestadores, prestador1);
		PrestadorServico.deletarPrestadorServico(prestadores, prestador1);
		assertTrue(prestadores.size() == 0);
	}
	
	
	
}
