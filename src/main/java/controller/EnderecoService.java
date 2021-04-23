package controller;

import java.util.ArrayList;

import model.Endereco;

public class EnderecoService {


	/**
	 * Adiciona um novo objeto Endereco ao ArrayList enderecos
	 * 
	 * @param Endereco endereco
	 * @param ArrayList<Endereco> enderecos
	 * @return
	 */
	public void cadastrarEndereco(Endereco endereco, ArrayList<Endereco> listaEnderecos) {
		listaEnderecos.add(endereco);
	}
	
	/**
	 * Lista todos os elementos do ArrayList<Endereco>
	 * @param listaEnderecos
	 */
	public void listarTodosEnderecos(ArrayList<Endereco> listaEnderecos) {
		for (Endereco endereco : listaEnderecos) {
			System.out.println(endereco.toString());
		}
	}
	
	/**
	 * Lista apenas 1 elemento contido no ArrayList de enderecos.
	 * 
	 * Verifica se o endereco já está no banco de dados.
	 * @param listaEnderecos
	 * @param endereco
	 * @return
	 */
	public String listarEnderecoCodigo(ArrayList<Endereco> listaEnderecos, Endereco endereco) {
		if (listaEnderecos.contains(endereco)) {
			return (endereco.toString());
		} else {
			return ("O endereço não consta na base de dados");
		}
	}
	
	/**
	 * Muda um elemento do ArrayList<Endereco> para um novo elemento
	 * @param listaEnderecos
	 * @param enderecoNovo
	 * @param enderecoAntigo
	 */
	public void atualizarEndereco(ArrayList<Endereco> listaEnderecos, Endereco enderecoNovo, Endereco enderecoAntigo) {
		int index = listaEnderecos.indexOf(enderecoAntigo);
		listaEnderecos.set(index, enderecoNovo);
	}
	
	/**
	 * Apaga um endereco de um ArrayList<Endereco>
	 * @param listarEnderecos
	 * @param endereco
	 */
	public void deletarEndereco(ArrayList<Endereco> listarEnderecos, Endereco endereco) {
		listarEnderecos.remove(listarEnderecos.indexOf(endereco));		
	}
	
	/**
	 * Remove todos os caracteres que não são os algarismos numéricos da String de CEP
	 * @param cep
	 * @return
	 */
	public String formatarCEP(String cep) {
		String output = "";
		for (byte code : cep.getBytes()) {
			if (code-48 < 10 && code - 48 >= 0) {
				output += Character.toString((char) code);
			}
		}
		return output;
	}
	
	/**
	 * Verifica se CEP contém 8 dígitos
	 * @param cep
	 * @return
	 */
	public boolean validarCEP(String cep) {
		if(this.formatarCEP(cep).length() != 8) {
			return false;
		} 
		return true;
	}
	
}
