package controller;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import model.Pessoa;

public class ValidacaoDeDatasTest {

	@Test
	public void validarDataNascimento() {

		Pessoa p = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();

		PessoaController pessoaController = new PessoaController();
		PessoaController pessoaController2 = new PessoaController();
		PessoaController pessoaController3 = new PessoaController();

		p.setDataDeNascimento(LocalDate.of(2002, 01, 28));
		p2.setDataDeNascimento(LocalDate.of(2020, 02, 28));
		p3.setDataDeNascimento(LocalDate.of(1500, 01, 28));

		assertTrue(pessoaController.validaDataDeNascimento(p));
		assert(pessoaController.validaDataDeNascimento(p2));
		assertFalse(pessoaController.validaDataDeNascimento(p3));

	}

	@Test
	public void testValidaDataDeNascimentoColaborador() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidaDataAdmissao() {
		fail("Not yet implemented");
	}

}
