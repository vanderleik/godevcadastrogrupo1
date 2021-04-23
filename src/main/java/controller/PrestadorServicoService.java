package controller;

import java.util.ArrayList;

import model.PrestadorServico;

public class PrestadorServicoService {


	/**
	 * Cadastrar prestador de serviço
	 * 
	 * Realiza cadastro de um prestador de serviço
	 * 
	 * @param ArrayList<PrestadorServico> listaPrestadorServico
	 * @param PrestadorServico            prestador
	 * @return void
	 */
	public void cadastrarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico,
			PrestadorServico prestador) {
		listaPrestadorServico.add(prestador);
	}

	/**
	 * Listar todos os prestadores de serviços
	 * 
	 * Realiza a leitura dos prestadores de serviços cadastrados e apresenta na
	 * tela.
	 * 
	 * @param PrestadorServico prestador
	 * @param ArrayList        listaPrestadorServico
	 * @return ArrayList
	 */
	public ArrayList<PrestadorServico> listarTodosPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico) {
		for (PrestadorServico prestador2 : listaPrestadorServico) {
			System.out.println(prestador2);
		}
		return listaPrestadorServico;
	}

	/**
	 * Listar o prestador de serviço conforme parâmetro
	 * 
	 * Realiza a leitura do prestador de serviço informado via parâmetro e apresenta
	 * na tela.
	 * 
	 * @param PrestadorServico prestador
	 * @param ArrayList        listaPrestadorServico
	 * @return ArrayList
	 */
	public ArrayList<PrestadorServico> listarPrestadorCodigo(ArrayList<PrestadorServico> listaPrestadorServico,
			PrestadorServico prestador) {
		for (PrestadorServico prestador2 : listaPrestadorServico) {
			if (listaPrestadorServico.contains(prestador)) {
				System.out.println(prestador2);
			}
		}
		return listaPrestadorServico;
	}

	/**
	 * Atualizar prestador de serviços
	 * 
	 * Realiza a atualização dos dados do prestador de serviços através dos dados
	 * informados (prestadorNovo)
	 * 
	 * @param listaPrestadorServico
	 * @param prestadorAntigo
	 * @param prestadorNovo
	 * @return void
	 */
	public void atualizarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico,
			PrestadorServico prestadorAntigo, PrestadorServico prestadorNovo) {
		listaPrestadorServico.set(listaPrestadorServico.indexOf(prestadorAntigo), prestadorNovo);
	}

	/**
	 * Deletar prestador de serviço
	 * 
	 * Realiza a exclusão do prestador de serviço conforme parâmetro passado
	 * (PrestadorServico prestador).
	 * 
	 * @param ArrayList<PrestadorServico> listaPrestadorServico
	 * @param PrestadorServico            prestador
	 * @return void
	 */
	public void deletarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico, PrestadorServico prestador) {
		listaPrestadorServico.remove(prestador);
	}
	
}
