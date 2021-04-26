package controller;

import java.util.ArrayList;

public interface Crud<T> {
	
	public boolean cadastrar(ArrayList<T> object, T param);

	public String listar(ArrayList<T> object, T param);

	public String listarTudo(ArrayList<T> object);

	public boolean delete(ArrayList<T> object, T param);
	
	public void atualizar(ArrayList<T> object, T param, T paramAntigo);
	
}
