package controller;

import java.util.ArrayList;

public interface DAO<T> {
	
	public boolean cadastrar(T item);

	public T listar(T item);

	public ArrayList<T> listarTudo();

	public boolean delete(T item);
	
	public boolean atualizar(T item, T itemAntigo);
	
}
