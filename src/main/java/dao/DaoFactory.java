package dao;

import java.util.ArrayList;

public class DaoFactory<T> implements DAO<T>{
	
	public ArrayList<T> itens = new ArrayList<T>();
	
	public boolean cadastrar(T item) {
		itens.add(item);
		return true;
	}

	public T listar(T item) {
		if (itens.contains(item)) {
			return (item);
		} else {
			return null;
		}
	}

	public ArrayList<T> listarTudo() {
		return itens;
	}

	public boolean delete(T item) {
		itens.remove(item);
		return true;
	}

	public boolean atualizar(T item, T itemAntigo) {
		int indice = itens.indexOf(itemAntigo);
		itens.set(indice, item);
		return true;
	}


}
