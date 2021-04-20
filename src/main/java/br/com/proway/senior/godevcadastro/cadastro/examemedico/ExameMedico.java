package br.com.proway.senior.godevcadastro.cadastro.examemedico;

import java.time.LocalDate;
import java.util.ArrayList;

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

	public ExameMedico() {

	}

	public ExameMedico(TiposExame tipoExame, LocalDate dataExame, boolean apto) {
		this.tipoExame = tipoExame;
		this.dataExame = dataExame;
		this.apto = apto;
	}

	/**
	 * Cadastrar exame médico
	 * 
	 * Realiza cadastro de um exame médico
	 * 
	 * @param ArrayList<ExameMedico> listaExames
	 * @param ExameMedico            exame
	 * @return void
	 */
	public static void cadastrarExameMedico(ArrayList<ExameMedico> listaExames, ExameMedico exame) {
		listaExames.add(exame);
		for (ExameMedico exame2 : listaExames) {
			System.out.println(exame2);
		}
	}

	/**
	 * Listar todos os exames médicos
	 * 
	 * Realiza a leitura de todos os exames médicos cadastrados e apresenta na tela.
	 * 
	 * @param ExameMedico exame
	 * @param ArrayList   listaExames
	 * @return ArrayList
	 */
	public static ArrayList<ExameMedico> listarTodosExames(ArrayList<ExameMedico> listaExames) {
		for (ExameMedico exame2 : listaExames) {
			System.out.println(exame2);
		}
		return listaExames;
	}

	/**
	 * Listar o exame médico conforme parâmetro
	 * 
	 * Realiza a leitura do exame médico informado via parâmetro e apresenta na
	 * tela.
	 * 
	 * @param ExameMedico exame
	 * @param ArrayList   listaExame
	 * @return ArrayList
	 */
	public static ArrayList<ExameMedico> listarExameCodigo(ArrayList<ExameMedico> listaExames, ExameMedico exame) {
		for (ExameMedico exame2 : listaExames) {
			if (listaExames.contains(exame)) {
				System.out.println(exame2);
			}
		}
		return listaExames;
	}

	/**
	 * Atualizar exame médico
	 * 
	 * Realiza a atualização dos dados do exame médico através dos dados informados
	 * (exameNovo)
	 * 
	 * @param listaExames
	 * @param exameAntigo
	 * @param exameNovo
	 * @return void
	 */
	public static void atualizarExameMedico(ArrayList<ExameMedico> listaExames, ExameMedico exameAntigo,
			ExameMedico exameNovo) {
		listaExames.set(listaExames.indexOf(exameAntigo), exameNovo);
	}

	/**
	 * Deletar exame médico
	 * 
	 * Realiza a exclusão do exame médico conforme parâmetro passado (ExameMedico
	 * exame).
	 * 
	 * @param ArrayList<ExameMedico> listaExames
	 * @param ExameMedico            exame
	 * @return void
	 */
	public static void deletarExameMedico(ArrayList<ExameMedico> listaExames, ExameMedico exame) {
		listaExames.remove(exame);
	}

	@Override
	public String toString() {
		return "ExameMedico [tipoExame=" + tipoExame + ", dataExame=" + dataExame + ", apto=" + apto + ", escolha=]";
	}

}
