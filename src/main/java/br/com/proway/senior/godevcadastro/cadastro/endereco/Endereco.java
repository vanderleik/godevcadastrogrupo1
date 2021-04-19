package br.com.proway.senior.godevcadastro.cadastro.endereco;

import br.com.proway.senior.godevcadastro.cadastro.enums.Cidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.Paises;
import br.com.proway.senior.godevcadastro.cadastro.enums.UnidadesFederativas;

/**
 * Classe que engloba e abstrai as informações de endereco de um Colaborador/Empresa
 * Esta classe será instanciada nas classes Colaborador e Empresa
 * 
 * @author Thiago Barbieri
 *
 */
public class Endereco {

	/**
	 * Atributos da classe
	 * 
	 * @param logradouro Ruas, avenidas, praças, viadutos.
	 * @param numero Número do endereço.
	 * @param bairro Bairro do endereço.
	 * @param cidade Cidade do endereço.
	 * @param uf Estado do endereço. Deve-sepreencher a sigla do Estado.
	 * @param complemento Complemento do endereço (Ex: loja 1; Bloco A, Box. 100).
	 * @param cep  Código de Endereçamento Postal do endereço.
	 * @param pais Pais do endereço.
	 */
	private String logradouro;
	private Integer numero;
	private String bairro;
	private Cidades cidade;
	private UnidadesFederativas uf;
	private String complemento;
	private String cep;
	private Paises pais;
	
	
	/**
	 * Construtor de Endereço com todos os atributos
	 * 
	 * @param logradouro
	 * @param numero
	 * @param bairro
	 * @param cidade
	 * @param uf
	 * @param complemento
	 * @param cep
	 * @param pais
	 */
	public Endereco(String logradouro, int numero, String bairro, Cidades cidade, UnidadesFederativas uf, String complemento,
			String cep, Paises pais) {
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
	 * Construtor de Endereco
	 * Não inclui o complemento.
	 * 
	 * @param logradouro
	 * @param numero
	 * @param bairro
	 * @param cidade
	 * @param uf
	 * @param cep
	 * @param pais
	 */
	public Endereco(String logradouro, int numero, String bairro, Cidades cidade, UnidadesFederativas uf, String cep, Paises pais) {
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
