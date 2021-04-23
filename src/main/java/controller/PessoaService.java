package controller;

import model.Pessoa;

public class PessoaService {

	/**
	 * Formatar CPF
	 * 
	 * Formata uma String que contenha um CPF para que possua apenas algarismos.
	 * 
	 * @param String cpf
	 * @return String
	 */
	public String formatarCPF(String CPF) {
		String output = "";
		for (byte code : CPF.getBytes()) {
			if (code - 48 < 10 && code - 48 >= 0) {
				output += Character.toString((char) code);
			}
		}
		return output;
	}

	/**
	 * Validar CPF.
	 * 
	 * Utiliza o algoritmo para verificar se o CPF contido na String é válido.
	 * 
	 * @param CPF
	 * @return boolean
	 */
	public boolean validarCPF(String CPF) {

		String CPFFormatado = this.formatarCPF(CPF);
		if (CPF.length() == 11) {

			int soma = 0;
			int mult = 10;
			for (int i = 0; i < 9; i++) {
				soma += mult * ((CPFFormatado.charAt(i) - 48));
				mult--;
			}
			if (11 - soma % 11 == CPFFormatado.charAt(9) - 48) {
				boolean valido;
			} else if (11 - soma % 11 == 10 && CPFFormatado.charAt(9) - 48 == 0) {
				boolean valido;
			} else {
				return false;
			}

			soma = 0;
			mult = 11;
			for (int i = 0; i < 10; i++) {
				soma += mult * ((CPFFormatado.charAt(i) - 48));
				mult--;
			}
			if (11 - soma % 11 == CPFFormatado.charAt(10) - 48) {
				boolean valido;
			} else if (11 - soma % 11 == 10 && CPFFormatado.charAt(10) - 48 == 0) {
				boolean valido;
			} else {
				return false;
			}

		} else {
			return false;
		}
		return true;
	}

}
