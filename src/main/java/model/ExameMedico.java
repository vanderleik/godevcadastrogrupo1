package model;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosPessoais.SexoPessoa;
import enums.EMOutros.TiposExames;
import model.Pessoa.PessoaBuilder;

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

	TiposExames tipoExame;
	private LocalDate dataExame;
	private boolean apto;
	
	public ExameMedico(TiposExames tipoExame, LocalDate dataExame, boolean apto) {
		this.tipoExame = tipoExame;
		this.dataExame = dataExame;
		this.apto = apto;
	}
	
	public ExameMedico() {
		
	}

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
	
	public static class ExameMedicoBuilder {
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
		
		public ExameMedico criarExameMedico() {
			return new ExameMedico(tipoExame, dataExame, apto);
		}
	}

	@Override
	public String toString() {
		return "ExameMedico [tipoExame=" + tipoExame + ", dataExame=" + dataExame + ", apto=" + apto;
	}

}
