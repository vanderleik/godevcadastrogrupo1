package model;

import enums.EMDadosGeograficos.Cidades;
import enums.EMDadosGeograficos.Pais;
import enums.EMDadosGeograficos.UF;

/**
 * Classe que engloba e abstrai as informações de endereco de um
 * Colaborador/Empresa. Esta classe será instanciada nas classes Colaborador e
 * Empresa.
 * 
 * Deve ser instanciada utilizando o EnderecoBuilder.
 * 
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Guilherme Ezequiel <guilhermeezequieldasilva@gmail>
 * 
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com>
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Vitor <vitornathang@gmail.com>
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gonçalves.
 *
 */
public class Endereco {
	private Integer paisId;
	private Integer estadoId;
	private Integer cidadeId;
	private Integer bairroId;
	private String logradouro;
	private String numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String cidade;
	private String uf;
	private String pais;
//
//	public Endereco(String logradouro, Integer numero, String bairro, Cidades cidade, UF uf,
//			String complemento, String cep, Pais pais) {
//		super();
//		this.logradouro = logradouro;
//		this.numero = numero;
//		this.bairro = bairro;
//		this.cidade = cidade;
//		this.uf = uf;
//		this.complemento = complemento;
//		this.cep = cep;
//		this.pais = pais;
//	}
//
//	public Endereco() {
//		super();
//	}

	/**
	 * Cria Endereco.
	 *
	 * É utilizado para criar um objeto da classe Endereco.
	 * 
	 * Exemplo de uso: Endereco endereco = new
	 * Endereco.EnderecoBuilder().logradouro("Rua 7 de Setembro").
	 * numero(461).bairro("Caldas
	 * Novas").cidade(Cidades.BLUMENAU).uf(UF.SC).....criarEndereco() Colocar
	 * quantos atributos forem necessários.
	 * 
	 */
	public static class EnderecoBuilder {
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

		public UF getUf() {
			return uf;
		}

		public void setUf(UF uf) {
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

		public Pais getPais() {
			return pais;
		}

		public void setPais(Pais pais) {
			this.pais = pais;
		}

		private String logradouro;
		private Integer numero;
		private String bairro;
		private Cidades cidade;
		private UF uf;
		private String complemento;
		private String cep;
		private Pais pais;

		public EnderecoBuilder logradouro(String logradouro) {
			this.logradouro = logradouro;
			return this;
		}

		public EnderecoBuilder numero(Integer numero) {
			this.numero = numero;
			return this;
		}

		public EnderecoBuilder bairro(String bairro) {
			this.bairro = bairro;
			return this;
		}

		public EnderecoBuilder cidade(Cidades cidade) {
			this.cidade = cidade;
			return this;
		}

		public EnderecoBuilder uf(UF uf) {
			this.uf = uf;
			return this;
		}

		public EnderecoBuilder complemento(String complemento) {
			this.complemento = complemento;
			return this;
		}

		public EnderecoBuilder cep(String cep) {
			this.cep = cep;
			return this;
		}

		public EnderecoBuilder pais(Pais pais) {
			this.pais = pais;
			return this;
		}
//
//		public Endereco criarEndereco() {
//			return new Endereco(logradouro, numero, bairro, cidade, uf, complemento, cep, pais);
//		}
	}

	@Override
	public String toString() {
		return "Endereco [paisId=" + paisId + ", estadoId=" + estadoId + ", cidadeId=" + cidadeId + ", bairroId="
				+ bairroId + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento
				+ ", cep=" + cep + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", pais=" + pais + "]";
	}
}
