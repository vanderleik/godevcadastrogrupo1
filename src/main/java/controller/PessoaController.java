package controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import dao.PessoaDAO;
import model.Pessoa;

public class PessoaController {

	public void verPessoas() {
		PessoaDAO dao = new PessoaDAO();
		ArrayList<Pessoa> pessoas = dao.listarTudo();
		Pessoa pessoa = dao.getByName("Ricardo");
	}
}
