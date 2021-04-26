package controller;

import java.util.ArrayList;

/*GenericCrudController*/
public class GenericCrudController<T> {

	/**
	 * Cadastra um objeto no ArrayList.
	 * 
	 * @param object
	 * @param parameter
	 */
	public void cadastrar(ArrayList<T> object, T param) {
		object.add(param);

	}

	/**
	 * Verifica se o objeto esta contido no ArrayList
	 * e lista-o
	 * 
	 * @param object
	 * @param parameter
	 */
	public String listar(ArrayList<T> object, T param) {
		
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
	public String listarTudo(ArrayList<T> object) {
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
	public void delete(ArrayList<T> object, T param) {
		if (object.contains(param)) {
			object.remove(param);
		} else {
			// Aqui vai entrar exceção
			System.out.println("Erro ao remover");
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
	public void atualizar(ArrayList<T> object, T param, T paramAntigo) {
		if (object.contains(paramAntigo)) {
			object.set(object.indexOf(paramAntigo), param);
		} else {
			// Aqui vai entrar exceção
			System.out.println("Erro ao atualizar");
		}

	}
}

