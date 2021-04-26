package controller;

import java.util.ArrayList;

import model.Pessoa;

/*GenericCrudController*/
public class PessoaCrudController implements Crud<Model> {
	
	ArrayList pessoas

	/**
	 * Cadastra um objeto no ArrayList.
	 * 
	 * @param object
	 * @param parameter
	 */
	public boolean cadastrar(ArrayList<Model> object, Model param) {
		object.add(param);
		return true;

	}

	/**
	 * Verifica se o objeto esta contido no ArrayList
	 * e lista-o
	 * 
	 * @param object
	 * @param parameter
	 */
	public String listar(ArrayList<Model> object, Model param) {

		if (object.contains(param)) {
			if (object.contains(param)) {
				return param.toString();
			} else {
				return null;
			}
		}
		return null;
	}

	/**
	 * 
	 * Lista todos os objetos do ArrayList.
	 * 
	 * @param object
	 * @param param
	 * @return
	 */
	public String listarTudo(ArrayList<Model> object) {
		if (!object.isEmpty()) {
			return object.toString();

		} else {
			return null;
		}

	}

	/**
	 * Deleta um objeto do ArrayList 
	 * 
	 * @param object
	 * @param param
	 */
	public boolean delete(ArrayList<Model> object, Model param) {
		if (object.contains(param)) {
			object.remove(param);
			return true;
		} else {
			// Aqui vai entrar exceção
			System.out.println("Erro ao remover");
			return false; 
		}
	}

	/**
	 * 
	 * 
	 * 
	 * @param object
	 * @param param
	 * @param paramAntigo
	 */
	public void atualizar(ArrayList<Model> object, Model param, Model paramAntigo) {
		if (object.contains(paramAntigo)) {
			object.set(object.indexOf(paramAntigo), param);
		} else {
			// Aqui vai entrar exceção
			System.out.println("Erro ao atualizar");
		}

	}
}

