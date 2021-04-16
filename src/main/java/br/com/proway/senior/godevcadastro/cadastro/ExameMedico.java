package br.com.proway.senior.godevcadastro.cadastro;

import java.time.LocalDate;

public class ExameMedico {
	
	/**
	 * Classe ExameMedico
	 * 
	 * Classe recebe informa��es para cadastro dos exames m�dicos
	 * que ser� instanciada na classe Colaborador para o cadastramento
	 * do mesmo
	 */
	
	/**
	 * @param TiposExame tipoExame
	 * @param private Date dataExame
	 * @param private boolean apto
	 */
	TiposExame tipoExame;
	private LocalDate dataExame;
	private boolean apto;
	
	int escolha;
	
	public String testeTipo(int tipo) {
		String resultado = null;
		switch (tipo) {
			case 0: 
			resultado = tipoExame.EXAME_ADMISSIONAL.toString();
			break;
			case 1:
			resultado = tipoExame.EXAME_PERIODICO.toString();
			break;
			case 2:
			resultado = tipoExame.EXAME_DEMISSIONAL.toString();
			break;
			default:
			System.out.println("Insira uma op��o v�lida.");			
		}
		
		return resultado;
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
	
	
	
}
