package enums;

import java.util.EnumMap;

public class EMDadosGeograficos {
	
	/**
	 * Classe de apoio para ser utilizada em Pessoa, Endereco e Colaborador para 
	 * setar informações de local de nascimento e endereço.
	 * 
	  * @author Bruna <sh4323202@gmail.com>
	  * @author Enzo <enzomm.bodyandmind@gmail.com> 
	  * @author Sabrina <sabrinaschmidt335@gmail.com>
	  * @author Vanderlei <vanderleik@yahoo.com.br>
	  * @author Vitor <vitornathang@gmail.com>
	 */
	
	public enum Cidades {
		BLUMENAU, FLORIANOPOLIS, PORTO_ALEGRE, BAGE, PARNAMIRIM, NATAL, SAO_PAULO, GUARULHOS;
	}

	/**
	 * Classe de apoio para ser utilizada em Pessoa, Endereco e Colaborador para 
	 * setar informações de local de nascimento e endereço.
	 * 
	  * @author Bruna <sh4323202@gmail.com>
	  * @author Enzo <enzomm.bodyandmind@gmail.com> 
	  * @author Sabrina <sabrinaschmidt335@gmail.com>
	  * @author Vanderlei <vanderleik@yahoo.com.br>
	  * @author Vitor <vitornathang@gmail.com>
	 */
	public enum UF {
		AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO
	}

	/**
	 * Classe de apoio para ser utilizada em Colaborador e Endereco para 
	 * setar o local de nascimento e os endereços.
	 * 
	 * @author Bruna <sh4323202@gmail.com>
	 * @author Enzo <enzomm.bodyandmind@gmail.com> 
	 * @author Sabrina <sabrinaschmidt335@gmail.com>
	 * @author Vanderlei <vanderleik@yahoo.com.br>
	 * @author Vitor <vitornathang@gmail.com>
	 */
	
	public enum Pais {
		BRASIl, ARGENTINA, CHILE, HAITI
	}

	/**
	 * Classe de apoio para ser utilizada em Pessoa para 
	 * setar a nacionalidade.
	 * 
	 * @author Bruna <sh4323202@gmail.com>
	 * @author Enzo <enzomm.bodyandmind@gmail.com> 
	 * @author Sabrina <sabrinaschmidt335@gmail.com>
	 * @author Vanderlei <vanderleik@yahoo.com.br>
	 * @author Vitor <vitornathang@gmail.com>
	 */
	
	public enum Nacionalidade {
		BRASILEIRA, ARGENTINA, CHILENA, HAITIANA
	}

	/**
	 * Classe de apoio contendo dois EnumMaps, utilizados para setar dados geográficos.
	 * 
	 * @author Bruna <sh4323202@gmail.com>
	 * @author Enzo <enzomm.bodyandmind@gmail.com> 
	 * @author Sabrina <sabrinaschmidt335@gmail.com>
	 * @author Vanderlei <vanderleik@yahoo.com.br>
	 * @author Vitor <vitornathang@gmail.com>
	 */
	
	public EnumMap<?, ?> Geograficos;
	{
		EnumMap<Cidades, UF> cidadesUF = new EnumMap<Cidades, UF>(Cidades.class);
		cidadesUF.put(Cidades.BLUMENAU, UF.SC);
		cidadesUF.put(Cidades.FLORIANOPOLIS, UF.SC);
		cidadesUF.put(Cidades.PORTO_ALEGRE, UF.RS);
		cidadesUF.put(Cidades.BAGE, UF.RS);
		cidadesUF.put(Cidades.PARNAMIRIM, UF.RN);
		cidadesUF.put(Cidades.NATAL, UF.RN);
		cidadesUF.put(Cidades.SAO_PAULO, UF.SP);
		cidadesUF.put(Cidades.GUARULHOS, UF.SP);

		EnumMap<Pais, Nacionalidade> paisNacionalidade = new EnumMap<Pais, Nacionalidade>(Pais.class);
		paisNacionalidade.put(Pais.ARGENTINA, Nacionalidade.ARGENTINA);
		paisNacionalidade.put(Pais.BRASIl, Nacionalidade.BRASILEIRA);
		paisNacionalidade.put(Pais.CHILE, Nacionalidade.CHILENA);
		paisNacionalidade.put(Pais.HAITI, Nacionalidade.HAITIANA);

	}
}
