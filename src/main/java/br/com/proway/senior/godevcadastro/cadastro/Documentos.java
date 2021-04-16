package br.com.proway.senior.godevcadastro.cadastro;

import java.util.Date;

/**
 * Classe que engloba e abstrai os documentos necessários para o Colaborador.
 * 
 * É instanciada na classe Colaborador.
 * 
 * @author Vitor Nathan Gonçalves
 *
 */
public class Documentos {

	/**
	 * Número da carteira de trabalho do colaborador
	 */
	private int ctpsNumero;
	
	/**
	 * Série da carteira de trabalho do colaborador
	 */
	private int ctpsSerie;
	
	/**
	 * Data de emissão da carteira de trabalho
	 */
	private Date dataEmissaoCTPS;
	
	/**
	 * Nome do banco para pagamento do salário do colaborador
	 */
	private String bancoNome;
	
	/**
	 * Número da agência do banco 
	 */
	private int bancoAgencia;
	
	/**
	 * Número da conta da pessoa
	 */
	private int bancoNumeroConta;
	
	/**
	 * Número do título de eleitor da pessoa
	 */
	private long tituloNumero;
	
	/**
	 * Número da zona eleitoral da pessoa
	 */
	private int tituloZona;
	
	/**
	 * Número da seção eleitoral da pessoa
	 */
	private int tituloSecao;
	
	/**
	 * Número do registro de alistamento da pessoa
	 */
	private long raNumero;
	
	/**
	 * Número do RG da pessoa
	 */
	private long rgNumero;
	
	/**
	 * Órgão emissor do RG da pessoa
	 */
	private String orgaoEmissorRG;
	
	/**
	 * Data de emissão do RG da pessoa
	 */
	private Date dataEmissaoRG;

	/**
	 * Construtor padrão da classe.
	 * 
	 * Inclui o registro de alistamento.
	 * 
	 * @param ctpsNumero
	 * @param ctpsSerie
	 * @param dataEmissao
	 * @param bancoNome
	 * @param bancoAgencia
	 * @param bancoNumeroConta
	 * @param tituloNumero
	 * @param tituloZona
	 * @param tituloSecao
	 * @param raNumero
	 * @param rgNumero
	 * @param orgaoEmissorRG
	 * @param dataEmissaoRG
	 */
	public Documentos(int ctpsNumero, int ctpsSerie, Date dataEmissao, String bancoNome, int bancoAgencia,
			int bancoNumeroConta, long tituloNumero, int tituloZona, int tituloSecao, long raNumero, long rgNumero,
			String orgaoEmissorRG, Date dataEmissaoRG) {
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
	 * NÃO inclui o registro de alistamento.
	 * 
	 * @param ctpsNumero
	 * @param ctpsSerie
	 * @param dataEmissao
	 * @param bancoNome
	 * @param bancoAgencia
	 * @param bancoNumeroConta
	 * @param tituloNumero
	 * @param tituloZona
	 * @param tituloSecao
	 * @param raNumero
	 * @param rgNumero
	 * @param orgaoEmissorRG
	 * @param dataEmissaoRG
	 */
	public Documentos(int ctpsNumero, int ctpsSerie, Date dataEmissaoCTPS, String bancoNome, int bancoAgencia,
			int bancoNumeroConta, long tituloNumero, int tituloZona, int tituloSecao, long rgNumero,
			String orgaoEmissorRG, Date dataEmissaoRG) {
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

	public Date getDataEmissaoCTPS() {
		return dataEmissaoCTPS;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissaoCTPS = dataEmissao;
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

	public Date getDataEmissaoRG() {
		return dataEmissaoRG;
	}

	public void setDataEmissaoRG(Date dataEmissaoRG) {
		this.dataEmissaoRG = dataEmissaoRG;
	}
}
