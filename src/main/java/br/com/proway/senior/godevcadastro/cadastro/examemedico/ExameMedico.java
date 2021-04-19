package br.com.proway.senior.godevcadastro.cadastro.examemedico;

import java.time.LocalDate;
import java.util.Date;

public class ExameMedico {

	/**
	 * Classe ExameMedico
	 * 
	 * Classe recebe informações para cadastro dos exames médicos que será
	 * instanciada na classe Colaborador para o cadastramento do mesmo
	 */

	/**
	 * @param TiposExame tipoExame
	 * @param private    Date dataExame
	 * @param private    boolean apto
	 */
	TiposExame tipoExame;
	private LocalDate dataExame;
	private boolean apto;

	int escolha;

	/**
	 * Selecionar o tipo de exame.
	 * 
	 * O método realiza o check do tipo do exame a partir do seu ID (de 0 à 2) para
	 * retornar o nome do referido exame.
	 * 
	 * @param int tipo Valor númerico que representa o exame.
	 * @return resultado
	 */
	public String selecionarTipoExame(int tipo) {
		String resultadoExame = null;
		switch (tipo) {
		case 0:
			resultadoExame = tipoExame.EXAME_ADMISSIONAL.toString();
			break;
		case 1:
			resultadoExame = tipoExame.EXAME_PERIODICO.toString();
			break;
		case 2:
			resultadoExame = tipoExame.EXAME_DEMISSIONAL.toString();
			break;
		default:
			System.out.println("Insira uma opção válida.");
		}

		return resultadoExame;
	}

	public TiposExame getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(TiposExame tipoExame) {
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

	public ExameMedico() {

	}

	/**
	 * Construtor para o cadastro do exame. Recebe os dados referente ao tipo do
	 * exame, a data de realização e o resultado.
	 * 
	 * @param tipoExame Tipo do exame conoforme parâmetros: EXAME_ADMISSIONAL (0),
	 *                  EXAME_PERIODICO (1), EXAME_DEMISSIONAL (2).
	 * @param LocalDate dataExame Data d realização do exame.
	 * @param boolean   apto Para a definição se apto (true) ou inapto (falso).
	 */
	public ExameMedico(TiposExame tipoExame, LocalDate dataExame, boolean apto) {
		this.tipoExame = tipoExame;
		this.dataExame = dataExame;
		this.apto = apto;
	}

	public ExameMedico(int tipoExame, String descricaoExame, LocalDate dataExame, boolean apto) {
		ExameMedico exameMedico = null;
		descricaoExame = exameMedico.selecionarTipoExame(tipoExame);
		this.dataExame = dataExame;
		this.apto = apto;
	}

	@Override
	public String toString() {
		return "ExameMedico [tipoExame=" + tipoExame + ", dataExame=" + dataExame + ", apto=" + apto + ", escolha="
				+ escolha + "]";
	}

}
