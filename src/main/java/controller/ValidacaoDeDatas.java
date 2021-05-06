package controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Colaborador;
import model.Pessoa;
import model.PrestadorServico;

/**
 * Classe utilizada na validação das datas do cadastro.
 * 
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com> 
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Vitor <vitornathang@gmail.com>
 */
public class ValidacaoDeDatas {
	
	public static final int IDADE_MAXIMA_PARA_PESSOA = 120;
	public static final int IDADE_MINIMA_PARA_CONTRATO = 14;
	
	/**
	 * Corresponde ao tempo máximo que um colaborador pode ser contratado pela empresa,
	 * baseando-se no tempo máximo que se espera que um ser humano viva
	 */
	public static final int TEMPO_MAXIMO_PARA_ADMISSAO = IDADE_MAXIMA_PARA_PESSOA - IDADE_MINIMA_PARA_CONTRATO;
	
	/**
	 * Validar a data de nascimento de uma pessoa.
	 * 
	 * Verifica se a data de nascimento informada está entre 0 e 120 anos
	 * @param pessoa
	 * @return true, caso a data seja válida
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
	 * @return true, caso a data seja válida
	 */
	public boolean validaDataDeNascimentoColaborador(Colaborador colaborador) {
		if (colaborador.getPessoa().getDataDeNascimento().until(LocalDate.now(), ChronoUnit.YEARS) >= IDADE_MINIMA_PARA_CONTRATO &&
				colaborador.getPessoa().getDataDeNascimento().until(LocalDate.now(), ChronoUnit.YEARS) <= IDADE_MAXIMA_PARA_PESSOA) {
			return true;
		}
		return false;
	}

	/**
	 * Verifica se a data informada é condizente com uma data de admissão (0<=Tempo<=TEMPO_MAXIMO_PARA_ADMISSAO).
	 * @param colaborador
	 * @return true, caso a data seja válida
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
	 * @return true, caso a data seja válida
	 */
	public boolean validaDataInicioContrato(PrestadorServico presServico) {
		if (presServico.getDataInicioContrato().until(LocalDate.now(), ChronoUnit.DAYS) >= 0 )	 {
			return true;
		}
		return false;
	}
	
	/**
	 * Verifica se uma data informada ocorreu no passado
	 * @param data
	 * @return true, caso a data seja no passado
	 */
	public boolean validaDataPassada(LocalDate data) {
		if(data.until(LocalDate.now(), ChronoUnit.YEARS)>0) {
			return true;
		}
		return false;	
	}

	
	
}

