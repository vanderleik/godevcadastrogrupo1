package model;
import java.time.LocalDate;

/**
 * Classe que engloba e abstrai os documentos necessários para o Colaborador.
 * 
 * É instanciada na classe Colaborador. 
 * Deve ser instanciada usando o ColaboradorBuilder.
 * 
 * @author Guilherme Ezequiel <guilhermeezequieldasilva@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * 
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago Luiz Barbieri e Vitor Nathan Gonçalves.
 *
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com> 
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vitor <vitornathang@gmail.com>
 */

public class Documentos{

	private int colaboradorId;
	
	private String ctpsNumero;
	private String ctpsSerie;
	private LocalDate dataEmissaoCTPS;
	

	private String tituloNumero;
	private String tituloZona;
	private String tituloSecao;
	
	
	private String raNumero;
	private String raSerie;
	
	private String rgNumero;
	private String rgOrgaoEmissor;
	private LocalDate dataEmissaoRG;
	
//	public Documentos(int ctpsNumero, int ctpsSerie, Date dataEmissaoCTPS, String bancoNome, int bancoAgencia,
//			int bancoNumeroConta, long tituloNumero, int tituloZona, int tituloSecao, long raNumero, long rgNumero,
//			String orgaoEmissorRG, Date dataEmissaoRG) {
//		this.ctpsNumero = ctpsNumero;
//		this.ctpsSerie = ctpsSerie;
//		this.dataEmissaoCTPS = dataEmissaoCTPS;
//		this.bancoNome = bancoNome;
//		this.bancoAgencia = bancoAgencia;
//		this.bancoNumeroConta = bancoNumeroConta;
//		this.tituloNumero = tituloNumero;
//		this.tituloZona = tituloZona;
//		this.tituloSecao = tituloSecao;
//		this.raNumero = raNumero;
//		this.rgNumero = rgNumero;
//		this.orgaoEmissorRG = orgaoEmissorRG;
//		this.dataEmissaoRG = dataEmissaoRG;
//	}

	public Documentos() {}


	public String getCtpsNumero() {
		return ctpsNumero;
	}


	public void setCtpsNumero(String ctpsNumero) {
		this.ctpsNumero = ctpsNumero;
	}


	public String getCtpsSerie() {
		return ctpsSerie;
	}


	public void setCtpsSerie(String ctpsSerie) {
		this.ctpsSerie = ctpsSerie;
	}


	public LocalDate getDataEmissaoCTPS() {
		return dataEmissaoCTPS;
	}


	public void setDataEmissaoCTPS(LocalDate dataEmissaoCTPS) {
		this.dataEmissaoCTPS = dataEmissaoCTPS;
	}

	public String getTituloNumero() {
		return tituloNumero;
	}


	public void setTituloNumero(String tituloNumero) {
		this.tituloNumero = tituloNumero;
	}


	public String getTituloZona() {
		return tituloZona;
	}


	public void setTituloZona(String tituloZona) {
		this.tituloZona = tituloZona;
	}


	public String getTituloSecao() {
		return tituloSecao;
	}


	public void setTituloSecao(String tituloSecao) {
		this.tituloSecao = tituloSecao;
	}


	public String getRaNumero() {
		return raNumero;
	}


	public void setRaNumero(String raNumero) {
		this.raNumero = raNumero;
	}


	public String getRgNumero() {
		return rgNumero;
	}


	public void setRgNumero(String rgNumero) {
		this.rgNumero = rgNumero;
	}


	public String getOrgaoEmissorRG() {
		return this.rgOrgaoEmissor;
	}


	public void setOrgaoEmissorRG(String orgaoEmissorRG) {
		this.rgOrgaoEmissor = orgaoEmissorRG;
	}


	public LocalDate getDataEmissaoRG() {
		return dataEmissaoRG;
	}


	public void setDataEmissaoRG(LocalDate dataEmissaoRG) {
		this.dataEmissaoRG = dataEmissaoRG;
	}


	public int getColaboradorId() {
		return colaboradorId;
	}


	public void setColaboradorId(int colaboradorId) {
		this.colaboradorId = colaboradorId;
	}


	public String getRaSerie() {
		return raSerie;
	}


	public void setRaSerie(String raSerie) {
		this.raSerie = raSerie;
	}


	@Override
	public String toString() {
		return "Documentos [colaboradorId=" + colaboradorId + ", ctpsNumero=" + ctpsNumero + ", ctpsSerie=" + ctpsSerie
				+ ", dataEmissaoCTPS=" + dataEmissaoCTPS + ", tituloNumero=" + tituloNumero + ", tituloZona="
				+ tituloZona + ", tituloSecao=" + tituloSecao + ", raNumero=" + raNumero + ", raSerie=" + raSerie
				+ ", rgNumero=" + rgNumero + ", rgOrgaoEmissor=" + rgOrgaoEmissor + ", dataEmissaoRG=" + dataEmissaoRG
				+ "]";
	}
	

//	/**
//	 * Cria Documentos.
//	 *
//	 * É utilizado para criar um objeto da classe Documentos.
//	 * 
//	 * Exemplo de uso:
//	 * Documentos documento = new Documentos.DocumentosBuilder().ctpsNumero(123456789).
//	 			ctpsSerie(123456).dataEmissaoCTPS(Date.of(2009, 02, 21)).....criarDocumentos() //Colocar quantos atributos
//				forem necessários
//	 */
//	public static class DocumentosBuilder {
//		
//		private int colaboradorId;
//		
//		private String ctpsNumero;
//		private String ctpsSerie;
//		private Date dataEmissaoCTPS;
//		
//
//		private String tituloNumero;
//		private String tituloZona;
//		private String tituloSecao;
//		
//		
//		private String raNumero;
//		private String raSerie;
//		
//		private String rgNumero;
//		private String rgOrgaoEmissor;
//		private Date dataEmissaoRG;
//		
//		public int getCtpsNumero() {
//			return ctpsNumero;
//		}
//
//		public void setCtpsNumero(int ctpsNumero) {
//			this.ctpsNumero = ctpsNumero;
//		}
//
//		public int getCtpsSerie() {
//			return ctpsSerie;
//		}
//
//		public void setCtpsSerie(int ctpsSerie) {
//			this.ctpsSerie = ctpsSerie;
//		}
//
//		public Date getDataEmissaoCTPS() {
//			return dataEmissaoCTPS;
//		}
//
//		public void setDataEmissaoCTPS(Date dataEmissaoCTPS) {
//			this.dataEmissaoCTPS = dataEmissaoCTPS;
//		}
//
//		public String getBancoNome() {
//			return bancoNome;
//		}
//
//		public void setBancoNome(String bancoNome) {
//			this.bancoNome = bancoNome;
//		}
//
//		public int getBancoAgencia() {
//			return bancoAgencia;
//		}
//
//		public void setBancoAgencia(int bancoAgencia) {
//			this.bancoAgencia = bancoAgencia;
//		}
//
//		public int getBancoNumeroConta() {
//			return bancoNumeroConta;
//		}
//
//		public void setBancoNumeroConta(int bancoNumeroConta) {
//			this.bancoNumeroConta = bancoNumeroConta;
//		}
//
//		public long getTituloNumero() {
//			return tituloNumero;
//		}
//
//		public void setTituloNumero(long tituloNumero) {
//			this.tituloNumero = tituloNumero;
//		}
//
//		public int getTituloZona() {
//			return tituloZona;
//		}
//
//		public void setTituloZona(int tituloZona) {
//			this.tituloZona = tituloZona;
//		}
//
//		public int getTituloSecao() {
//			return tituloSecao;
//		}
//
//		public void setTituloSecao(int tituloSecao) {
//			this.tituloSecao = tituloSecao;
//		}
//
//		public long getRaNumero() {
//			return raNumero;
//		}
//
//		public void setRaNumero(long raNumero) {
//			this.raNumero = raNumero;
//		}
//
//		public long getRgNumero() {
//			return rgNumero;
//		}
//
//		public void setRgNumero(long rgNumero) {
//			this.rgNumero = rgNumero;
//		}
//
//		public String getOrgaoEmissorRG() {
//			return orgaoEmissorRG;
//		}
//
//		public void setOrgaoEmissorRG(String orgaoEmissorRG) {
//			this.orgaoEmissorRG = orgaoEmissorRG;
//		}
//
//		public Date getDataEmissaoRG() {
//			return dataEmissaoRG;
//		}
//
//		public void setDataEmissaoRG(Date dataEmissaoRG) {
//			this.dataEmissaoRG = dataEmissaoRG;
//		}
//
//		public DocumentosBuilder dataEmissaoRG(Date dataEmissaoRG) {
//			this.dataEmissaoRG = dataEmissaoRG;
//			return this;
//		}
//
////		public Documentos criarDocumentos() {
////			return new Documentos( ctpsNumero,  ctpsSerie,  dataEmissaoCTPS,  bancoNome,  bancoAgencia,
////					bancoNumeroConta,  tituloNumero,  tituloZona, tituloSecao,  raNumero,  rgNumero,
////					orgaoEmissorRG,  dataEmissaoRG);
////		}
//	}

}
