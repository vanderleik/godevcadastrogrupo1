package model;

import java.util.ArrayList;

import controller.Model;
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
public class Endereco implements Model{

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
	
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + ", complemento=" + complemento + ", cep=" + cep + ", pais=" + pais + "]";
	}

}
