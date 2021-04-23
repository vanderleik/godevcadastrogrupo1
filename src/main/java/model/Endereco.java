package model;

import java.util.ArrayList;

import enums.Cidades;
import enums.Paises;
import enums.UnidadesFederativas;

	/**
	 * Classe que engloba e abstrai as informações de endereco de um
	 * Colaborador/Empresa Esta classe será instanciada nas classes Colaborador e
	 * Empresa
	 * 
	 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago Luiz Barbieri e Vitor Nathan Gonçalves.
	 *
	 */
public class Endereco {

	private String logradouro;
	private Integer numero;
	private String bairro;
	private Cidades cidade;
	private UnidadesFederativas uf;
	private String complemento;
	private String cep;
	private Paises pais;

	public Endereco(String logradouro, Integer numero, String bairro, Cidades cidade, UnidadesFederativas uf,
			String complemento, String cep, Paises pais) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.complemento = complemento;
		this.cep = cep;
		this.pais = pais;
	}

	/**
	 * Construtor de Endereco Não inclui o complemento.
	 */
	public Endereco(String logradouro, Integer numero, String bairro, Cidades cidade, UnidadesFederativas uf,
			String cep, Paises pais) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.pais = pais;
	}

	public Endereco() {
		super();
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cidades getCidade() {
		return cidade;
	}

	public void setCidade(Cidades cidade) {
		this.cidade = cidade;
	}

	public UnidadesFederativas getUf() {
		return uf;
	}

	public void setUf(UnidadesFederativas uf) {
		this.uf = uf;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Paises getPais() {
		return pais;
	}

	public void setPais(Paises pais) {
		this.pais = pais;
	}

	/**
	 * Adiciona um novo objeto Endereco ao ArrayList enderecos
	 * 
	 * @param Endereco endereco
	 * @param ArrayList<Endereco> enderecos
	 * @return
	 */
	public static void cadastrarEndereco(Endereco endereco, ArrayList<Endereco> listaEnderecos) {
		listaEnderecos.add(endereco);
	}
	
	/**
	 * Lista todos os elementos do ArrayList<Endereco>
	 * @param listaEnderecos
	 */
	public static void listarTodosEnderecos(ArrayList<Endereco> listaEnderecos) {
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
	public static String listarEnderecoCodigo(ArrayList<Endereco> listaEnderecos, Endereco endereco) {
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
	public static void atualizarEndereco(ArrayList<Endereco> listaEnderecos, Endereco enderecoNovo, Endereco enderecoAntigo) {
		int index = listaEnderecos.indexOf(enderecoAntigo);
		listaEnderecos.set(index, enderecoNovo);
	}
	
	/**
	 * Apaga um endereco de um ArrayList<Endereco>
	 * @param listarEnderecos
	 * @param endereco
	 */
	public static void deletarEndereco(ArrayList<Endereco> listarEnderecos, Endereco endereco) {
		listarEnderecos.remove(listarEnderecos.indexOf(endereco));		
	}
	
	/**
	 * Remove todos os caracteres que não são os algarismos numéricos da String de CEP
	 * @param cep
	 * @return
	 */
	public static String formatarCEP(String cep) {
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
	public static boolean validarCEP(String cep) {
		if(Endereco.formatarCEP(cep).length() != 8) {
			return false;
		} 
		return true;
	}
	
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + ", complemento=" + complemento + ", cep=" + cep + ", pais=" + pais + "]";
	}

}
