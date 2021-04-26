package controller;

import java.util.ArrayList;

import model.Pessoa;

public class PessoaDAO extends DaoFactory<Pessoa>{
	
	Pessoa getByName(String name) {
		for(Pessoa pessoa : this.items) {
			if(pessoa.getNome() == name) {
				return pessoa;
			}
		}
		return null;
	}

}
