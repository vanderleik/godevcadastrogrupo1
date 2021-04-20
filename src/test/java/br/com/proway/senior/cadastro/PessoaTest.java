package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.enums.Nacionalidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.SexoPessoa;
import br.com.proway.senior.godevcadastro.cadastro.pessoa.Pessoa;

public class PessoaTest {
	
	SexoPessoa sexoTeste1 = SexoPessoa.FEMININO;
	SexoPessoa sexoTeste2 = SexoPessoa.MASCULINO;
	Nacionalidades nacionalidadeTeste1 = Nacionalidades.BRASILEIRA;
	Nacionalidades nacionalidadeTeste2 = Nacionalidades.CHILENA;
	Nacionalidades nacionalidadeTeste3 = Nacionalidades.ARGENTINA;
	
	Pessoa pessoaTesteConstrutorPrincipal = new Pessoa("Marcos", "Antônio", LocalDate.of(2010, 8, 24), "Muriel", "Não-Binário", sexoTeste2, "Josilene Aparecida Santos", "01231545678", nacionalidadeTeste1, true);
	Pessoa pessoaTesteConstrutorSecundario = new Pessoa("Marco", "Antunes", LocalDate.of(2009, 4, 21), "Masculino", sexoTeste2, "Jucerléia Aparecida Santos", "87654321021", nacionalidadeTeste2);
	
	@Test
	public void test() {
		assertEquals(pessoaTesteConstrutorPrincipal.getNome(), "Marcos");
		assertEquals(pessoaTesteConstrutorPrincipal.getSobrenome(), "Antônio");
		assertEquals(pessoaTesteConstrutorPrincipal.getDataDeNascimento(), LocalDate.of(2010, 8, 24));
		assertEquals(pessoaTesteConstrutorPrincipal.getNomeSocial(), "Muriel");
		assertEquals(pessoaTesteConstrutorPrincipal.getGenero(), "Não-Binário");
		assertEquals(pessoaTesteConstrutorPrincipal.getSexo(), sexoTeste2);
		assertEquals(pessoaTesteConstrutorPrincipal.getNomeDaMae(), "Josilene Aparecida Santos");
		assertEquals(pessoaTesteConstrutorPrincipal.getCpf(), "01231545678");
		assertEquals(pessoaTesteConstrutorPrincipal.getNacionalidade(), nacionalidadeTeste1);
		assertEquals(pessoaTesteConstrutorPrincipal.isPcd(), true);
		
		assertEquals(pessoaTesteConstrutorSecundario.getNome(), "Marco");
		assertEquals(pessoaTesteConstrutorSecundario.getSobrenome(), "Antunes");
		assertEquals(pessoaTesteConstrutorSecundario.getDataDeNascimento(), LocalDate.of(2009, 4, 21));
		assertEquals(pessoaTesteConstrutorSecundario.getGenero(), "Masculino");
		assertEquals(pessoaTesteConstrutorSecundario.getSexo(), sexoTeste2);
		assertEquals(pessoaTesteConstrutorSecundario.getNomeDaMae(), "Jucerléia Aparecida Santos");
		assertEquals(pessoaTesteConstrutorSecundario.getCpf(), "87654321021");
		assertEquals(pessoaTesteConstrutorSecundario.getNacionalidade(), nacionalidadeTeste2);
		assertEquals(pessoaTesteConstrutorSecundario.isPcd(), false);
		
		pessoaTesteConstrutorPrincipal.setNome("Joana");
		pessoaTesteConstrutorPrincipal.setSobrenome("Marques");
		pessoaTesteConstrutorPrincipal.setDataDeNascimento(LocalDate.of(2002, 3, 11));
		pessoaTesteConstrutorPrincipal.setNomeSocial("Antoni");
		pessoaTesteConstrutorPrincipal.setGenero("Transsexual");
		pessoaTesteConstrutorPrincipal.setSexo(sexoTeste1);
		pessoaTesteConstrutorPrincipal.setNomeDaMae("Marcela Trindade Pereira");
		pessoaTesteConstrutorPrincipal.setCpf("124512644762");
		pessoaTesteConstrutorPrincipal.setNacionalidade(nacionalidadeTeste3);
		pessoaTesteConstrutorPrincipal.setPcd(false);
		
		assertEquals(pessoaTesteConstrutorPrincipal.getNome(), "Joana");
		assertEquals(pessoaTesteConstrutorPrincipal.getSobrenome(), "Marques");
		assertEquals(pessoaTesteConstrutorPrincipal.getDataDeNascimento(), LocalDate.of(2002, 3, 11));
		assertEquals(pessoaTesteConstrutorPrincipal.getNomeSocial(), "Antoni");
		assertEquals(pessoaTesteConstrutorPrincipal.getGenero(), "Transsexual");
		assertEquals(pessoaTesteConstrutorPrincipal.getSexo(), sexoTeste1);
		assertEquals(pessoaTesteConstrutorPrincipal.getNomeDaMae(), "Marcela Trindade Pereira");
		assertEquals(pessoaTesteConstrutorPrincipal.getCpf(), "124512644762");
		assertEquals(pessoaTesteConstrutorPrincipal.getNacionalidade(), nacionalidadeTeste3);
		assertEquals(pessoaTesteConstrutorPrincipal.isPcd(), false);
		
	}
	
	@Test
	public void testValidarCpf() {
		System.out.println(Pessoa.validarCPF(""));
	}
}
