package controller;

public class FormataDocumentos {
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
	 * Formatar telefone
	 * 
	 * Realiza a validação do telefone para verificar se possui apenas números.
	 * 
	 * @param String telefone
	 * @return String telefoneFormatado
	 */
	public String formatarTelefone(String telefone) {
		String telefoneFormatado = "";
		for (byte code : telefone.getBytes()) {
			if (code - 48 < 10 && code - 48 >= 0) {
				telefoneFormatado += Character.toString((char) code);
			}
		}
		return telefoneFormatado;
	}
	
	/**
	 * Torna uma String correspondente à um CNPJ em uma String que contém apenas
	 * algarismos.
	 * 
	 * @param cnpj
	 * @return
	 */
	public String formataCNPJ(String cnpj) {
		String output = "";
		for (byte code : cnpj.getBytes()) {
			if (code - 48 < 10 && code - 48 >= 0) {
				output += Character.toString((char) code);
			}
		}
		return output;
	}

	/**
	 * Remove todos os caracteres que não são os algarismos numéricos da String de CEP
	 * @param cep
	 * @return
	 */
	public String formatarCEP(String cep) {
		String output = "";
		for (byte code : cep.getBytes()) {
			if (code-48 < 10 && code - 48 >= 0) {
				output += Character.toString((char) code);
			}
		}
		return output;
	}
	
}
