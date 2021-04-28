package controller;

/**
 * Contém métodos de formatação de dados.
 * Classe responsável por conter todos os métodos de formatação de dados. 
 * É usada em conjunto com a classe ValidacaoDocumentos.
 * 
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com> 
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Vitor <vitornathang@gmail.com>
 *
 */
public class FormatacaoDocumentos {
	/**
	 * Remove caracteres.
	 * 
	 * Formata uma String para que possua apenas algarismos.
	 * 
	 * @param String entrada
	 * @return String
	 */
	public String removerCaracteres(String entrada) {
		String output = "";
		for (byte code : entrada.getBytes()) {
			if (code - 48 < 10 && code - 48 >= 0) {
				output += Character.toString((char) code);
			}
		}
		return output;
	}	
}
