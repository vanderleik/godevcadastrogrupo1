package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import controller.Model;

	/**
	 * Classe que engloba e abstrai os documentos necessários para o Colaborador.
	 * 
	 * É instanciada na classe Colaborador.
	 * 
	 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago Luiz Barbieri e Vitor Nathan Gonçalves.
	 */

public class Documentos implements Model{

	private int ctpsNumero;
	private int ctpsSerie;
	private LocalDate dataEmissaoCTPS;
	private String bancoNome;
	private int bancoAgencia;
	private int bancoNumeroConta;
	private long tituloNumero;
	private int tituloZona;
	private int tituloSecao;
	private long raNumero;
	private long rgNumero;
	private String orgaoEmissorRG;
	private LocalDate dataEmissaoRG;
	
	public Documentos(int ctpsNumero, int ctpsSerie, LocalDate dataEmissao, String bancoNome, int bancoAgencia,
			int bancoNumeroConta, long tituloNumero, int tituloZona, int tituloSecao, long raNumero, long rgNumero,
			String orgaoEmissorRG, LocalDate dataEmissaoRG) {
		this.ctpsNumero = ctpsNumero;
		this.ctpsSerie = ctpsSerie;
		this.dataEmissaoCTPS = dataEmissao;
		this.bancoNome = bancoNome;
		this.bancoAgencia = bancoAgencia;
		this.bancoNumeroConta = bancoNumeroConta;
		this.tituloNumero = tituloNumero;
		this.tituloZona = tituloZona;
		this.tituloSecao = tituloSecao;
		this.raNumero = raNumero;
		this.rgNumero = rgNumero;
		this.orgaoEmissorRG = orgaoEmissorRG;
		this.dataEmissaoRG = dataEmissaoRG;
	}

	/**
	 * Construtor secundário da classe.
	 * 
	 * NÃO inclui o registro de alistamento (RA).
	 * 
	 */
	public Documentos(int ctpsNumero, int ctpsSerie, LocalDate dataEmissaoCTPS, String bancoNome, int bancoAgencia,
			int bancoNumeroConta, long tituloNumero, int tituloZona, int tituloSecao, long rgNumero,
			String orgaoEmissorRG, LocalDate dataEmissaoRG) {
		this.ctpsNumero = ctpsNumero;
		this.ctpsSerie = ctpsSerie;
		this.dataEmissaoCTPS = dataEmissaoCTPS;
		this.bancoNome = bancoNome;
		this.bancoAgencia = bancoAgencia;
		this.bancoNumeroConta = bancoNumeroConta;
		this.tituloNumero = tituloNumero;
		this.tituloZona = tituloZona;
		this.tituloSecao = tituloSecao;
		this.rgNumero = rgNumero;
		this.raNumero = 0;
		this.orgaoEmissorRG = orgaoEmissorRG;
		this.dataEmissaoRG = dataEmissaoRG;
	}

	public int getCtpsNumero() {
		return ctpsNumero;
	}

	public void setCtpsNumero(int ctpsNumero) {
		this.ctpsNumero = ctpsNumero;
	}

	public int getCtpsSerie() {
		return ctpsSerie;
	}

	public void setCtpsSerie(int ctpsSerie) {
		this.ctpsSerie = ctpsSerie;
	}

	public LocalDate getDataEmissaoCTPS() {
		return dataEmissaoCTPS;
	}

	public void setDataEmissaoCTPS(LocalDate dataEmissaoCTPS) {
		this.dataEmissaoCTPS = dataEmissaoCTPS;
	}

	public String getBancoNome() {
		return bancoNome;
	}

	public void setBancoNome(String bancoNome) {
		this.bancoNome = bancoNome;
	}

	public int getBancoAgencia() {
		return bancoAgencia;
	}

	public void setBancoAgencia(int bancoAgencia) {
		this.bancoAgencia = bancoAgencia;
	}

	public int getBancoNumeroConta() {
		return bancoNumeroConta;
	}

	public void setBancoNumeroConta(int bancoNumeroConta) {
		this.bancoNumeroConta = bancoNumeroConta;
	}

	public long getTituloNumero() {
		return tituloNumero;
	}

	public void setTituloNumero(long tituloNumero) {
		this.tituloNumero = tituloNumero;
	}

	public int getTituloZona() {
		return tituloZona;
	}

	public void setTituloZona(int tituloZona) {
		this.tituloZona = tituloZona;
	}

	public int getTituloSecao() {
		return tituloSecao;
	}

	public void setTituloSecao(int tituloSecao) {
		this.tituloSecao = tituloSecao;
	}

	public long getRaNumero() {
		return raNumero;
	}

	public void setRaNumero(long raNumero) {
		this.raNumero = raNumero;
	}

	public long getRgNumero() {
		return rgNumero;
	}

	public void setRgNumero(long rgNumero) {
		this.rgNumero = rgNumero;
	}

	public String getOrgaoEmissorRG() {
		return orgaoEmissorRG;
	}

	public void setOrgaoEmissorRG(String orgaoEmissorRG) {
		this.orgaoEmissorRG = orgaoEmissorRG;
	}

	public LocalDate getDataEmissaoRG() {
		return dataEmissaoRG;
	}

	public void setDataEmissaoRG(LocalDate dataEmissaoRG) {
		this.dataEmissaoRG = dataEmissaoRG;
	}
	
	@Override
	public String toString() {
		return "Documentos [ctpsNumero=" + ctpsNumero + ", ctpsSerie=" + ctpsSerie + ", dataEmissaoCTPS="
				+ dataEmissaoCTPS + ", bancoNome=" + bancoNome + ", bancoAgencia=" + bancoAgencia
				+ ", bancoNumeroConta=" + bancoNumeroConta + ", tituloNumero=" + tituloNumero + ", tituloZona="
				+ tituloZona + ", tituloSecao=" + tituloSecao + ", raNumero=" + raNumero + ", rgNumero=" + rgNumero
				+ ", orgaoEmissorRG=" + orgaoEmissorRG + ", dataEmissaoRG=" + dataEmissaoRG + "]";
	}

}
