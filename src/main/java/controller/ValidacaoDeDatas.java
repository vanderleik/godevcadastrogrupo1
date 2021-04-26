package controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Colaborador;
import model.Pessoa;
import model.PrestadorServico;

/**
 * Classe utilizada na validação das datas no cadastro.
 *
 */
public class ValidacaoDeDatas {
	
	public static final int IDADE_MAXIMA_PARA_PESSOA = 120;
	public static final int IDADE_MINIMA_PARA_CONTRATO = 14;
	/**
	 * Corresponde ao tempo máximo que um colaborador pode ser contratado pela empresa,
	 * baseando-se na expectativa de vida
	 */
	public static final int TEMPO_MAXIMO_PARA_ADMISSAO = IDADE_MAXIMA_PARA_PESSOA - IDADE_MINIMA_PARA_CONTRATO;
	
	/**
	 * Validar a data de nascimento de uma pessoa.
	 * 
	 * Verifica se a data de nascimento informada está entre 0 e 120 anos
	 * @param pessoa
	 * @return
	 */
	public boolean validaDataDeNascimento(Pessoa pessoa) {

		if (pessoa.getDataDeNascimento().until(LocalDate.now(), ChronoUnit.YEARS) <= IDADE_MAXIMA_PARA_PESSOA &&
				pessoa.getDataDeNascimento().until(LocalDate.now(), ChronoUnit.DAYS) > 0)  {
			return true;
		}
		return false;
	}

	/**
	 * Valida a data de nascimento de um colaborador.
	 * 
	 * Verifica se a data está de acordo com as normas de contratação (14 <= idade <= 120).
	 * @param colaborador
	 * @return
	 */
	public boolean validaDataDeNascimentoColaborador(Colaborador colaborador) {
		if (colaborador.getDataDeNascimento().until(LocalDate.now(), ChronoUnit.YEARS) >= IDADE_MINIMA_PARA_CONTRATO &&
				colaborador.getDataDeNascimento().until(LocalDate.now(), ChronoUnit.YEARS) <= IDADE_MAXIMA_PARA_PESSOA) {
			return true;
		}
		return false;
	}

	/**
	 * Verifica se a data informada é condizente com uma data de admissão (0<=Tempo<=TEMPO_MAXIMO_PARA_ADMISSAO).
	 * @param colaborador
	 * @return
	 */
	public boolean validaDataAdmissao(Colaborador colaborador) {
		if (colaborador.getDataAdmissao().until(LocalDate.now(), ChronoUnit.DAYS) >= 0 && 
				colaborador.getDataAdmissao().until(LocalDate.now(), ChronoUnit.YEARS) <= TEMPO_MAXIMO_PARA_ADMISSAO) {
			return true;
		}
		return false;
	}
	
	/**
	 * Verifica se a data informada é condizente com uma data de contrato entre a 
	 * empresa e o Prestador de Serviço.
	 * 
	 * @param colaborador
	 * @return
	 */
	public boolean validaDataInicioContrato(PrestadorServico presServico) {
		if (presServico.getDataInicioContrato().until(LocalDate.now(), ChronoUnit.DAYS) >= 0 )	 {
			return true;
		}
		return false;
	}
	
	public boolean validaDataPassada(LocalDate data) {
		if(data.until(LocalDate.now(), ChronoUnit.YEARS)>0) {
			return true;
		}
		return false;	
	}

	
	
}

