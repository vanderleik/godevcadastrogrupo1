package model;

import java.time.LocalDate;

/**
 * Classe que abstrai as informações de uma Empresa contratada. Esta Classe será
 * instanciada na Classe PrestadorServico, e instanciará as classes Endereco e
 * Contato.
 * 
 * Deve ser instanciada utilizando o EmpresaBuilder.
 *
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gonçalves.
 *         
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com> 
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Vitor <vitornathang@gmail.com>
 *
 */
public class Empresa{
	private Integer enderecoId;
	private Integer telefoneId;

	private Integer empresaId;
	
	private String empresaNome;
	private LocalDate contratoDataInicio;
	private String cnpj;
	private Endereco endereco;
	private Contatos contato;

//	public Empresa(long empresaId, String nomeEmpresa, LocalDate dataInicioContrato, String cnpj, Endereco endereco,
//			Contatos contato) {
//		super();
//		this.empresaId = empresaId;
//		this.cnpj = cnpj;
//		this.endereco = endereco;
//		this.contato = contato;
//	}

	
	
	/**
	 * Cria Empresa.
	 *
	 * É utilizado para criar um objeto da classe Empresa.
	 * 
	 * Exemplo de uso:
	 * Empresa empresa = new Empresa.EmpresaBuilder().empresaId(56).nomeEmpresa("Nome Ilustrativo").
				dataInicioContrato(LocalDate.of(2004, 6, 26)).cnpj("567895463214").....criarEmpresa() //Colocar quantos atributos
				forem necessários
	 * 
	 * @author Bruna <sh4323202@gmail.com>
	 * @author Enzo <enzomm.bodyandmind@gmail.com> 
	 * @author Sabrina <sabrinaschmidt335@gmail.com>
	 * @author Vanderlei <vanderleik@yahoo.com.br>
	 * @author Vitor <vitornathang@gmail.com>
	 */
	
	public static class EmpresaBuilder {
		public long getEmpresaId() {
			return empresaId;
		}

		public void setEmpresaId(long empresaId) {
			this.empresaId = empresaId;
		}

		public String getNomeEmpresa() {
			return nomeEmpresa;
		}

		public void setNomeEmpresa(String nomeEmpresa) {
			this.nomeEmpresa = nomeEmpresa;
		}

		public LocalDate getDataInicioContrato() {
			return dataInicioContrato;
		}

		public void setDataInicioContrato(LocalDate dataInicioContrato) {
			this.dataInicioContrato = dataInicioContrato;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}

		public Contatos getContato() {
			return contato;
		}

		public void setContato(Contatos contato) {
			this.contato = contato;
		}

		private long empresaId;
		private String nomeEmpresa;
		private LocalDate dataInicioContrato;
		private String cnpj;
		private Endereco endereco;
		private Contatos contato;
	
		public EmpresaBuilder empresaId(long empresaId) {
			this.empresaId = empresaId;
			return this;
		}
		
		public EmpresaBuilder nomeEmpresa(String nomeEmpresa) {
			this.nomeEmpresa = nomeEmpresa;
			return this;
		}
		
		public EmpresaBuilder dataInicioContrato(LocalDate dataInicioContrato) {
			this.dataInicioContrato = dataInicioContrato;
			return this;
		}
		
		public EmpresaBuilder cnpj(String cnpj) {
			this.cnpj = cnpj;
			return this;
		}
		
		public EmpresaBuilder endereco(Endereco endereco) {
			this.endereco = endereco;
			return this;
		}
		
		public EmpresaBuilder contato(Contatos contato) {
			this.contato = contato;
			return this;
		}

		@Override
		public String toString() {
			return "EmpresaBuilder [empresaId=" + empresaId + ", nomeEmpresa=" + nomeEmpresa + ", dataInicioContrato="
					+ dataInicioContrato + ", cnpj=" + cnpj + ", endereco=" + endereco + ", contato=" + contato + "]";
		}
		
//		public Empresa criarEmpresa() {
//			return new Empresa(empresaId, nomeEmpresa, dataInicioContrato, cnpj, endereco, contato);
//		}
	}
}
