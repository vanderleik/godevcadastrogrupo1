package controller;

import java.util.ArrayList;

import dao.DaoFactory;
import model.Dependente;

public class DependenteController {


	/**
	 * Adiciona um dependente ao ArrayList<Dependente>
	 * 
	 * @param listaDependentes
	 * @param dependente
	 */
	public void cadastrarDependente(Dependente dependente) {
		DaoFactory<Dependente> dao = new DaoFactory<Dependente>();
		dao.cadastrar(dependente);
	}

	/**
	 * Mostra as informações dos dependentes no console
	 * 
	 * @param listaDependentes
	 */
	public void listarDependentes(ArrayList<Dependente> listaDependentes) {
		for (Dependente dependente : listaDependentes) {
			System.out.println(dependente.toString());
		}
	}
	
	public ArrayList<Dependente> buscarDependentes() {
		DaoFactory<Dependente> dao = new DaoFactory<Dependente>();
		return dao.listarTudo();
	}

	/**
	 * Realizar a atualização dos dados.
	 * 
	 * Altera um dependente do ArrayList para o novo dependente informado.
	 * 
	 * @param listaDependentes
	 * @param dependenteAntigo
	 * @param dependenteNovo
	 */
	public void atualizarDependente(ArrayList<Dependente> listaDependentes, Dependente dependenteAntigo,
			Dependente dependenteNovo) {
		int indice = listaDependentes.indexOf(dependenteAntigo);
		listaDependentes.set(indice, dependenteNovo);
	}

	/**
	 * Deletar um dependente do ArrayList.
	 * 
	 * Deleta o dependente selecionado do ArrayList.
	 * 
	 * @param listaDependentes
	 * @param dependente
	 */
	public void deletarDependente(ArrayList<Dependente> listaDependentes, Dependente dependente) {
		listaDependentes.remove(dependente);
	}
	
}
