package dao;

import java.util.ArrayList;

import model.Pessoa;

public class PessoaDAO extends DaoFactory<Pessoa>{

	public Pessoa getByName(String name) {
		for(Pessoa pessoa : this.itens) {
			if(pessoa.getNome() == name) {
				return pessoa;
			}
		}
		return null;
	}

}
