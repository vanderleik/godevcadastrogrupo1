package enums;

import java.util.EnumMap;

/**
 * Classe de apoio para ser utilizada em Pessoa para 
 * setar o sexo.
 * 
 * @author Vanderlei, Vitor Gonçalves, Sabrina, Enzo Moura e Bruna.
 */
public class EMDadosPessoais {
	
	public enum SexoPessoa {
		TRANS, CIS
	}

	/**
	 * Classe de apoio para ser utilizada em Dependentes para
	 * ser o tipo do mesmo.
	 * 
	 * @author Vanderlei, Vitor Gonçalves, Sabrina, Enzo Moura e Bruna.
	 */
	public enum TiposDependentes {
		FILHO, CONJUGE, MAE, PAI
	}

	/**
	 * Classe de apoio contendo dois EnumMaps, utilizados para setar dados pessoais.
	 * 
	 * @author Vanderlei, Vitor Gonçalves, Sabrina, Enzo Moura e Bruna.
	 */
	
	public EnumMap<?, ?> DadosPessoais;
	{
		EnumMap<SexoPessoa, Integer> sexoPessoa = new EnumMap<SexoPessoa, Integer>(SexoPessoa.class);
		sexoPessoa.put(SexoPessoa.TRANS, 1);
		sexoPessoa.put(SexoPessoa.CIS, 2);

		EnumMap<TiposDependentes, Integer> tiposDependentes = new EnumMap<TiposDependentes, Integer>(
				TiposDependentes.class);
		tiposDependentes.put(TiposDependentes.FILHO, 1);
		tiposDependentes.put(TiposDependentes.CONJUGE, 2);
		tiposDependentes.put(TiposDependentes.MAE, 3);
		tiposDependentes.put(TiposDependentes.PAI, 4);
	}
}