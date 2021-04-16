package br.com.proway.senior.godevcadastro.cadastro;

import java.time.LocalDate;

/**
 * Classe que abstrai as informações de uma Empresa contratada.
 * Esta Classe será instanciada na Classe PrestadorServico, e instanciará as classes Endereco e Contato
 *
 * @author Thiago Barbieri
 *
 */
public class Empresa {
	
	private long empresaId;
	private String nomeEmpresa;
	private LocalDate dataInicioContrato;
	private String cnpj;
	private Endereco endereco;
	

	/**
	 * Construtor Empresa com todos os atributos.
	 * 
	 * @param empresaId
	 * @param nomeEmpresa Nome da Empresa
	 * @param dataInicioContrato Data do início do contrato (DD/MM/YYYY).
	 * @param cnpj Cnpj da Empresa
	 */
	public Empresa(long empresaId, String nomeEmpresa, LocalDate dataInicioContrato, String cnpj, Endereco endereco, Contatos contato) {
		super();
		this.empresaId = empresaId;
		this.nomeEmpresa = nomeEmpresa;
		this.dataInicioContrato = dataInicioContrato;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.contato = contato;
	}
	
	public Empresa() {
		super();
	}

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
	
	private Contatos contato;

	@Override
	public String toString() {
		return "Empresa [empresaId=" + empresaId + ", nomeEmpresa=" + nomeEmpresa + ", dataInicioContrato="
				+ dataInicioContrato + ", cnpj=" + cnpj + ", endereco=" + endereco + ", contato= " + contato + "]";
	}
	

	
}
