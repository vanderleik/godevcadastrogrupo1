package br.com.prowaysenior.godevcadastro.cadastro;

import java.util.Date;

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
	private Date dataInicioContrato;
	private String cnpj;
	
	/**
	 * Construtor Empresa
	 * 
	 * @param empresaId
	 * @param nomeEmpresa Nome da Empresa
	 * @param dataInicioContrato Data do início do contrato (DD/MM/YYYY).
	 * @param cnpj Cnpj da Empresa
	 */
	public Empresa(long empresaId, String nomeEmpresa, Date dataInicioContrato, String cnpj) {
		super();
		this.empresaId = empresaId;
		this.nomeEmpresa = nomeEmpresa;
		this.dataInicioContrato = dataInicioContrato;
		this.cnpj = cnpj;
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
	public Date getDataInicioContrato() {
		return dataInicioContrato;
	}
	public void setDataInicioContrato(Date dataInicioContrato) {
		this.dataInicioContrato = dataInicioContrato;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return "Empresa [empresaId=" + empresaId + ", nomeEmpresa=" + nomeEmpresa + ", dataInicioContrato="
				+ dataInicioContrato + ", cnpj=" + cnpj + "]";
	}
	
}
