package br.com.proway.senior.godevcadastro.cadastro;

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
	private int numero;
	private String bairro;
	private String cidade;
	private String uf;
	private String complemento;
	private String cep;
	private String pais;
	
	
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
	public Endereco(String logradouro, int numero, String bairro, String cidade, String uf, String complemento,
			String cep, String pais) {
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
	public Endereco(String logradouro, int numero, String bairro, String cidade, String uf, String cep, String pais) {
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + ", complemento=" + complemento + ", cep=" + cep + ", pais=" + pais + "]";
	}

}
