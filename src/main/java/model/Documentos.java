package model;

import java.time.LocalDate;

/**
 * Classe que engloba e abstrai os documentos necess�rios para o Colaborador.
 * 
 * � instanciada na classe Colaborador. 
 * Deve ser instanciada usando o ColaboradorBuilder.
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago Luiz Barbieri e Vitor Nathan Gon�alves.
 *
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com> 
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Vitor <vitornathang@gmail.com>
 */

public class Documentos{

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

	public Documentos(int ctpsNumero, int ctpsSerie, LocalDate dataEmissaoCTPS, String bancoNome, int bancoAgencia,
			int bancoNumeroConta, long tituloNumero, int tituloZona, int tituloSecao, long raNumero, long rgNumero,
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
		this.raNumero = raNumero;
		this.rgNumero = rgNumero;
		this.orgaoEmissorRG = orgaoEmissorRG;
		this.dataEmissaoRG = dataEmissaoRG;
	}

	public Documentos() {}

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

	/**
	 * Cria Documentos.
	 *
	 * � utilizado para criar um objeto da classe Documentos.
	 * 
	 * Exemplo de uso:
	 * Documentos documento = new Documentos.DocumentosBuilder().ctpsNumero(123456789).
	 			ctpsSerie(123456).dataEmissaoCTPS(LocalDate.of(2009, 02, 21)).....criarDocumentos() //Colocar quantos atributos
				forem necess�rios
	 * 
	 * @author Bruna <sh4323202@gmail.com>
	 * @author Enzo <enzomm.bodyandmind@gmail.com> 
	 * @author Sabrina <sabrinaschmidt335@gmail.com>
	 * @author Vanderlei <vanderleik@yahoo.com.br>
	 * @author Vitor <vitornathang@gmail.com>
	 */
	public static class DocumentosBuilder {

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

		public DocumentosBuilder ctpsNumero(int ctpsNumero) {
			this.ctpsNumero = ctpsNumero;
			return this;
		}

		public DocumentosBuilder ctpsSerie(int ctpsSerie) {
			this.ctpsSerie = ctpsSerie;
			return this;
		}

		public DocumentosBuilder dataEmissaoCTPS(LocalDate dataEmissaoCTPS) {
			this.dataEmissaoCTPS = dataEmissaoCTPS;
			return this;
		}

		public DocumentosBuilder bancoNome(String bancoNome) {
			this.bancoNome = bancoNome;
			return this;
		}

		public DocumentosBuilder bancoAgencia(int bancoAgencia) {
			this.bancoAgencia = bancoAgencia;
			return this;
		}	

		public DocumentosBuilder bancoNumeroConta(int bancoNumeroConta) {
			this.bancoNumeroConta = bancoNumeroConta;
			return this;
		}

		public DocumentosBuilder tituloNumero(long tituloNumero) {
			this.tituloNumero = tituloNumero;
			return this;
		}

		public DocumentosBuilder tituloZona(int tituloZona) {
			this.tituloZona = tituloZona;
			return this;
		}

		public DocumentosBuilder tituloSecao(int tituloSecao) {
			this.tituloSecao = tituloSecao;
			return this;
		}

		public DocumentosBuilder raNumero(long raNumero) {
			this.raNumero = raNumero;
			return this;
		}
		public DocumentosBuilder rgNumero(long rgNumero) {
			this.rgNumero = rgNumero;
			return this;
		}

		public DocumentosBuilder orgaoEmissorRG(String orgaoEmissorRG) {
			this.orgaoEmissorRG = orgaoEmissorRG;
			return this;
		}

		public DocumentosBuilder dataEmissaoRG( LocalDate dataEmissaoRG) {
			this.dataEmissaoRG = dataEmissaoRG;
			return this;
		}

		public Documentos criarDocumentos() {
			return new Documentos( ctpsNumero,  ctpsSerie,  dataEmissaoCTPS,  bancoNome,  bancoAgencia,
					bancoNumeroConta,  tituloNumero,  tituloZona, tituloSecao,  raNumero,  rgNumero,
					orgaoEmissorRG,  dataEmissaoRG);
		}
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
