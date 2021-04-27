package dao;

import java.util.ArrayList;

import model.Pessoa;

public class PessoaDAO extends DaoFactory<Pessoa>{

	/**
	 * Verifica se há um objeto pessoa no ArrayList com o nome indicado,
	 * retorna o objeto Pessoa correspondente caso exista.
	 * @param name
	 * @return Pessoa
	 */
	public Pessoa getByName(String name) {
		for(Pessoa pessoa : this.itens) {
			if(pessoa.getNome() == name) {
				return pessoa;
			}
		}
		return null;
	}

}
