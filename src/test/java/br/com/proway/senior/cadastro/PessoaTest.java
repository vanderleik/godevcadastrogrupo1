package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.Pessoa;

public class PessoaTest {
	
	Pessoa pessoaTesteConstrutorPrincipal = new Pessoa("Marcos", "Antônio", LocalDate.of(2010, 8, 24), "Muriel", "Não-Binário", 'M', "Josilene Aparecida Santos", "01231545678", "Brasil", true);
	Pessoa pessoaTesteConstrutorSecundario = new Pessoa("Marco", "Antunes", LocalDate.of(2009, 4, 21), "Masculino", 'M', "Jucerléia Aparecida Santos", "87654321021", "Moçambique");
	
	@Test
	public void test() {
		assertEquals(pessoaTesteConstrutorPrincipal.getNome(), "Marcos");
		assertEquals(pessoaTesteConstrutorPrincipal.getSobrenome(), "Antônio");
		assertEquals(pessoaTesteConstrutorPrincipal.getDataDeNascimento(), LocalDate.of(2010, 8, 24));
		assertEquals(pessoaTesteConstrutorPrincipal.getNomeSocial(), "Muriel");
		assertEquals(pessoaTesteConstrutorPrincipal.getGenero(), "Não-Binário");
		assertEquals(pessoaTesteConstrutorPrincipal.getSexo(), 'M');
		assertEquals(pessoaTesteConstrutorPrincipal.getNomeDaMae(), "Josilene Aparecida Santos");
		assertEquals(pessoaTesteConstrutorPrincipal.getCpf(), "01231545678");
		assertEquals(pessoaTesteConstrutorPrincipal.getNacionalidade(), "Brasil");
		assertEquals(pessoaTesteConstrutorPrincipal.isPcd(), true);
		
		assertEquals(pessoaTesteConstrutorSecundario.getNome(), "Marco");
		assertEquals(pessoaTesteConstrutorSecundario.getSobrenome(), "Antunes");
		assertEquals(pessoaTesteConstrutorSecundario.getDataDeNascimento(), LocalDate.of(2009, 4, 21));
		assertEquals(pessoaTesteConstrutorSecundario.getGenero(), "Masculino");
		assertEquals(pessoaTesteConstrutorSecundario.getSexo(), 'M');
		assertEquals(pessoaTesteConstrutorSecundario.getNomeDaMae(), "Jucerléia Aparecida Santos");
		assertEquals(pessoaTesteConstrutorSecundario.getCpf(), "87654321021");
		assertEquals(pessoaTesteConstrutorSecundario.getNacionalidade(), "Moçambique");
		assertEquals(pessoaTesteConstrutorSecundario.isPcd(), false);
		
		pessoaTesteConstrutorPrincipal.setNome("Joana");
		pessoaTesteConstrutorPrincipal.setSobrenome("Marques");
		pessoaTesteConstrutorPrincipal.setDataDeNascimento(LocalDate.of(2002, 3, 11));
		pessoaTesteConstrutorPrincipal.setNomeSocial("Antoni");
		pessoaTesteConstrutorPrincipal.setGenero("Transsexual");
		pessoaTesteConstrutorPrincipal.setSexo('F');
		pessoaTesteConstrutorPrincipal.setNomeDaMae("Marcela Trindade Pereira");
		pessoaTesteConstrutorPrincipal.setCpf("124512644762");
		pessoaTesteConstrutorPrincipal.setNacionalidade("Mônaco");
		pessoaTesteConstrutorPrincipal.setPcd(false);
		
		assertEquals(pessoaTesteConstrutorPrincipal.getNome(), "Joana");
		assertEquals(pessoaTesteConstrutorPrincipal.getSobrenome(), "Marques");
		assertEquals(pessoaTesteConstrutorPrincipal.getDataDeNascimento(), LocalDate.of(2002, 3, 11));
		assertEquals(pessoaTesteConstrutorPrincipal.getNomeSocial(), "Antoni");
		assertEquals(pessoaTesteConstrutorPrincipal.getGenero(), "Transsexual");
		assertEquals(pessoaTesteConstrutorPrincipal.getSexo(), 'F');
		assertEquals(pessoaTesteConstrutorPrincipal.getNomeDaMae(), "Marcela Trindade Pereira");
		assertEquals(pessoaTesteConstrutorPrincipal.getCpf(), "124512644762");
		assertEquals(pessoaTesteConstrutorPrincipal.getNacionalidade(), "Mônaco");
		assertEquals(pessoaTesteConstrutorPrincipal.isPcd(), false);
		
	}
}
