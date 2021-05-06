package model;
/**
 * Armazena os dados bancários do colaborador, como: código e nome do banco e agencia.
 * 
 * 
 * @author Guilherme Ezequiel <guilhermeezequieldasilva@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 *
 */
public class DadosBancarios {
	private Integer colaboradorId;
	
	
	private String bancoCodigo;
	private String bancoNome;
	
	
	private String agenciaId;
	private String agenciaNumero;
	private String agenciaDigitoVerficador;
	
	
	
	private String contaNumero;
	private String contaDigitoVerficador;
	public Integer getColaboradorId() {
		return colaboradorId;
	}
	
	public void setColaboradorId(Integer colaboradorId) {
		this.colaboradorId = colaboradorId;
	}
	public String getBancoCodigo() {
		return bancoCodigo;
	}
	public void setBancoCodigo(String bancoCodigo) {
		this.bancoCodigo = bancoCodigo;
	}
	public String getBancoNome() {
		return bancoNome;
	}
	public void setBancoNome(String bancoNome) {
		this.bancoNome = bancoNome;
	}
	public String getAgenciaId() {
		return agenciaId;
	}
	public void setAgenciaId(String agenciaId) {
		this.agenciaId = agenciaId;
	}
	public String getAgenciaNumero() {
		return agenciaNumero;
	}
	public void setAgenciaNumero(String agenciaNumero) {
		this.agenciaNumero = agenciaNumero;
	}
	public String getAgenciaDigitoVerficador() {
		return agenciaDigitoVerficador;
	}
	public void setAgenciaDigitoVerficador(String agenciaDigitoVerficador) {
		this.agenciaDigitoVerficador = agenciaDigitoVerficador;
	}
	public String getContaNumero() {
		return contaNumero;
	}
	public void setContaNumero(String contaNumero) {
		this.contaNumero = contaNumero;
	}
	public String getContaDigitoVerficador() {
		return contaDigitoVerficador;
	}
	public void setContaDigitoVerficador(String contaDigitoVerficador) {
		this.contaDigitoVerficador = contaDigitoVerficador;
	}
	@Override
	public String toString() {
		return "DadosBancarios [colaboradorId=" + colaboradorId + ", bancoCodigo=" + bancoCodigo + ", bancoNome="
				+ bancoNome + ", agenciaId=" + agenciaId + ", agenciaNumero=" + agenciaNumero
				+ ", agenciaDigitoVerficador=" + agenciaDigitoVerficador + ", contaNumero=" + contaNumero
				+ ", contaDigitoVerficador=" + contaDigitoVerficador + "]";
	}
	//TODO builder

}
