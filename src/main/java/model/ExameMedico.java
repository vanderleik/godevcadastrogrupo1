package model;

import java.time.LocalDate;
import enums.EMOutros.TiposExames;

/**
 * Classe ExameMedico.
 * 
 * Classe recebe informa��es para cadastro dos exames m�dicos que ser�o
 * instanciados na classe Colaborador para cadastramento.
 * 
 * Deve ser instanciada utilizando o ExameMedicoBuilder. *
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
 *         Luiz Barbieri e Vitor Nathan Gon�alves.
 */
public class ExameMedico {
	private Integer colaboradorId;

	private Integer tipoExameId; //TODO: verificar se necessario
	private int tipoExame;

	private LocalDate dataExame;
	private boolean apto;

//	public ExameMedico(TiposExames tipoExame, LocalDate dataExame, boolean apto) {
//		this.tipoExame = tipoExame;
//		this.dataExame = dataExame;
//		this.apto = apto;
//	}
//
//	public ExameMedico() {
//
//	}

	public Integer getColaboradorId() {
		return colaboradorId;
	}

	public void setColaboradorId(Integer colaboradorId) {
		this.colaboradorId = colaboradorId;
	}

	public Integer getTipoExameId() {
		return tipoExameId;
	}

	public void setTipoExameId(Integer tipoExameId) {
		this.tipoExameId = tipoExameId;
	}

	public int getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(int tipoExame) {
		this.tipoExame = tipoExame;
	}

	public LocalDate getDataExame() {
		return dataExame;
	}

	public void setDataExame(LocalDate dataExame) {
		this.dataExame = dataExame;
	}

	public boolean isApto() {
		return apto;
	}

	public void setApto(boolean apto) {
		this.apto = apto;
	}


	/**
	 * Cria ExameMedico.
	 *
	 * � utilizado para criar um objeto da classe ExameMedico.
	 * 
	 * Exemplo de uso: ExameMedico exameMedico = new
	 * ExameMedico.ExameMedicoBuilder().
	 * tipoExame(TiposExames.ADMISSIONAL).dataExame(LocalDate.of(2016, 11, 5)).
	 * apto(true).criarExameMedico();
	 * 
	 */

	public static class ExameMedicoBuilder {

		public TiposExames getTipoExame() {
			return tipoExame;
		}

		public void setTipoExame(TiposExames tipoExame) {
			this.tipoExame = tipoExame;
		}

		public LocalDate getDataExame() {
			return dataExame;
		}

		public void setDataExame(LocalDate dataExame) {
			this.dataExame = dataExame;
		}

		public boolean isApto() {
			return apto;
		}

		public void setApto(boolean apto) {
			this.apto = apto;
		}

		TiposExames tipoExame;
		private LocalDate dataExame;
		private boolean apto;

		public ExameMedicoBuilder tipoExame(TiposExames tipoExame) {
			this.tipoExame = tipoExame;
			return this;
		}

		public ExameMedicoBuilder dataExame(LocalDate dataExame) {
			this.dataExame = dataExame;
			return this;
		}

		public ExameMedicoBuilder apto(boolean apto) {
			this.apto = apto;
			return this;
		}

//		public ExameMedico criarExameMedico() {
//			return new ExameMedico(tipoExame, dataExame, apto);
//		}
	}

	@Override
	public String toString() {
		return "ExameMedico [colaboradorId=" + colaboradorId + ", tipoExameId=" + tipoExameId + ", tipoExame="
				+ tipoExame + ", dataExame=" + dataExame + ", apto=" + apto + "]";
	}
}