package enums;

import java.util.EnumMap;

public class EMOutros {
	
	/**
	 * Classe de apoio para ser utilizada na classe ExameMedico
	 * visando a seleção do tipo de exame a ser cadastrado.
	 * 
	 * @author Vanderlei, Vitor Gonçalves, Sabrina, Enzo Moura e Bruna.
	 */
	public enum TiposExames {
		ADMISSIONAL, PERIODICO, DEMISSIONAL;
	}

	public EnumMap<TiposExames, Integer> Exames;
	{
		EnumMap<TiposExames, Integer> tiposExames = new EnumMap<TiposExames, Integer>(TiposExames.class);
		tiposExames.put(TiposExames.ADMISSIONAL, 1);
		tiposExames.put(TiposExames.PERIODICO, 2);
		tiposExames.put(TiposExames.DEMISSIONAL, 3);
	}
	
}
