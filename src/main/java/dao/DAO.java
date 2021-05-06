package dao;

import java.util.ArrayList;

/**
 * Interface gerenciamento de dados.
 * Interface responsável por definir quais serão os
 * métodos que serão utilizados no gerenciamento de dados.
 * 
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com> 
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Vitor <vitornathang@gmail.com>
 *
 * @param <T>
 */
public interface DAO<T> {
	
	public boolean cadastrar(T item);

	public T listar(int id);

	public ArrayList<T> listarTudo();

	public boolean delete(int id);
	
	public boolean atualizar(int id, T itemNovo);
	
}
