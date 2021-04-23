package controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Colaborador;
import model.Pessoa;


public class ValidacaoDeDatas {
	
	public static final int IDADE_MAXIMA_PARA_PESSOA = 120;
	public static final int IDADE_MINIMA_PARA_CONTRATO = 14;
	public static final int TEMPO_MAXIMO_PARA_CONTRATO = IDADE_MAXIMA_PARA_PESSOA - IDADE_MINIMA_PARA_CONTRATO;
	
	public boolean validaDataDeNascimento(Pessoa pessoa) {

		if (pessoa.getDataDeNascimento().until(LocalDate.now(), ChronoUnit.YEARS) <= IDADE_MAXIMA_PARA_PESSOA)  {
			return true;
		}
		return false;
	}

	public boolean validaDataDeNascimentoColaborador(Colaborador colaborador) {
		if (colaborador.getDataDeNascimento().until(LocalDate.now(), ChronoUnit.YEARS) >= IDADE_MINIMA_PARA_CONTRATO) {
			return true;
		}
		return false;
	}

	public boolean validaDataAdmissao(Colaborador colaborador) {
		if (colaborador.getDataAdmissao().until(LocalDate.now(), ChronoUnit.YEARS) >= TEMPO_MAXIMO_PARA_CONTRATO) {
			return true;
		}
		return false;
	}
	
}
