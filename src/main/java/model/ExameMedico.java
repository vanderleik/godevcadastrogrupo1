package model;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.TiposExame;

/**
 * Classe ExameMedico
 * 
 * Classe recebe informações para cadastro dos exames médicos que será
 * instanciada na classe Colaborador para o cadastramento do mesmo
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gonçalves.
 */
public class ExameMedico {

	TiposExame tipoExame;
	private LocalDate dataExame;
	private boolean apto;
	
	public ExameMedico(TiposExame tipoExame, LocalDate dataExame, boolean apto) {
		this.tipoExame = tipoExame;
		this.dataExame = dataExame;
		this.apto = apto;
	}

	/**
	 * Selecionar o tipo de exame.
	 * 
	 * O método realiza o check do tipo do exame a partir do seu ID (de 0 à 2) para
	 * retornar o nome do referido exame.
	 * 
	 * @param int tipo Valor númerico que representa o exame.
	 * @return resultado
	 */
	@Deprecated
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

	@Override
	public String toString() {
		return "ExameMedico [tipoExame=" + tipoExame + ", dataExame=" + dataExame + ", apto=" + apto + ", escolha=]";
	}

}
