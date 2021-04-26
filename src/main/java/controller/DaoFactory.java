package controller;

import java.util.ArrayList;

public class DaoFactory<T> implements DAO<T>{
	
	ArrayList<T> items = new ArrayList<T>();
	
	public boolean cadastrar(T item) {
		items.add(item);
		return true;
	}

	public T listar(T item) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<T> listarTudo() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean atualizar(T item, T itemAntigo) {
		return false;
		// TODO Auto-generated method stub
		
	}


}
