package controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import model.Colaborador;
import model.Pessoa;

public class ColaboradorController {
	

	/**
	 * Cadastrar colaborador
	 * 
	 * Realiza cadastro do colaborador no ArrayList.
	 * 
	 * @param ArrayList<Colaborador> listaColaboradores
	 * @param Colaborador            colaborador
	 * @return void
	 */
	public void cadastrarColaborador(ArrayList<Colaborador> listaColaboradores, Colaborador colaborador) {
		listaColaboradores.add(colaborador);
	}

	/**
	 * Listar todos os colaboradores
	 * 
	 * Realiza a leitura de todos os colaboradores cadastrados e apresenta na tela.
	 * 
	 * @param listaColaboradores
	 * @return ArrayList listaColaboradores
	 */
	public ArrayList<Colaborador> listarTodosColaboradores(ArrayList<Colaborador> listaColaboradores) {
		for (Colaborador colaborador2 : listaColaboradores) {
			System.out.println(colaborador2);
		}
		return listaColaboradores;
	}

	/**
	 * Listar colaboradores por código
	 * 
	 * Realiza a leitura dos dados do colaboradore conforme parâmetro.
	 * 
	 * @param listaColaboradores
	 * @return ArrayList listaColaboradores
	 */
	public ArrayList<Colaborador> listarColaboradorCodigo(ArrayList<Colaborador> listaColaboradores,
			Colaborador colaborador) {
		for (Colaborador colaborador2 : listaColaboradores) {
			if (listaColaboradores.contains(colaborador)) {
				System.out.println(colaborador2);
			}
		}
		return listaColaboradores;
	}

	/**
	 * Atualizar colaborador
	 * 
	 * Realiza a atualização dos dados do colaborador através dos dados informados
	 * (colaboradorNovo)
	 * 
	 * @param listaColaboradores
	 * @param colaboradorNovo
	 * @param colaboradorAntigo
	 */
	public void atualizarColaborador(ArrayList<Colaborador> listaColaboradores, Colaborador colaboradorNovo,
			Colaborador colaboradorAntigo) {
		listaColaboradores.set(listaColaboradores.indexOf(colaboradorAntigo), colaboradorNovo);
	}

	/**
	 * Deletar colaborador
	 * 
	 * Realiza a exclusão do colaborador conforme parâmetro passado (Colaborador
	 * colaborador).
	 * 
	 * @param listaColaboradores
	 * @param colaborador
	 */
	public void deletarColaborador(ArrayList<Colaborador> listaColaboradores, Colaborador colaborador) {
		listaColaboradores.remove(colaborador);
	}

	
	
	
}
