
package controller;

import java.util.ArrayList;

import model.ExameMedico;

public class ExameMedicoController {


	/**
	 * Cadastrar exame médico
	 * 
	 * Realiza cadastro de um exame médico
	 * 
	 * @param ArrayList<ExameMedico> listaExames
	 * @param ExameMedico            exame
	 * @return void
	 */
	public void cadastrarExameMedico(ArrayList<ExameMedico> listaExames, ExameMedico exame) {
		listaExames.add(exame);
		for (ExameMedico exame2 : listaExames) {
			System.out.println(exame2);
		}
	}

	/**
	 * Listar todos os exames médicos
	 * 
	 * Realiza a leitura de todos os exames médicos cadastrados e apresenta na tela.
	 * 
	 * @param ExameMedico exame
	 * @param ArrayList   listaExames
	 * @return ArrayList
	 */
	public ArrayList<ExameMedico> listarTodosExames(ArrayList<ExameMedico> listaExames) {
		for (ExameMedico exame2 : listaExames) {
			System.out.println(exame2);
		}
		return listaExames;
	}

	/**
	 * Listar o exame médico conforme parâmetro
	 * 
	 * Realiza a leitura do exame médico informado via parâmetro e apresenta na
	 * tela.
	 * 
	 * @param ExameMedico exame
	 * @param ArrayList   listaExame
	 * @return ArrayList
	 */
	public ArrayList<ExameMedico> listarExameCodigo(ArrayList<ExameMedico> listaExames, ExameMedico exame) {
		for (ExameMedico exame2 : listaExames) {
			if (listaExames.contains(exame)) {
				System.out.println(exame2);
			}
		}
		return listaExames;
	}

	/**
	 * Atualizar exame médico
	 * 
	 * Realiza a atualização dos dados do exame médico através dos dados informados
	 * (exameNovo)
	 * 
	 * @param listaExames
	 * @param exameAntigo
	 * @param exameNovo
	 * @return void
	 */
	public void atualizarExameMedico(ArrayList<ExameMedico> listaExames, ExameMedico exameAntigo,
			ExameMedico exameNovo) {
		listaExames.set(listaExames.indexOf(exameAntigo), exameNovo);
	}

	/**
	 * Deletar exame médico
	 * 
	 * Realiza a exclusão do exame médico conforme parâmetro passado (ExameMedico
	 * exame).
	 * 
	 * @param ArrayList<ExameMedico> listaExames
	 * @param ExameMedico            exame
	 * @return void
	 */
	public void deletarExameMedico(ArrayList<ExameMedico> listaExames, ExameMedico exame) {
		listaExames.remove(exame);
	}

	
}
