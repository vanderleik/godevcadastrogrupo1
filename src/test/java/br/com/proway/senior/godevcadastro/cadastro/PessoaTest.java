package br.com.proway.senior.godevcadastro.cadastro;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

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
	}
}
