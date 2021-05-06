package controller;

/**
 * Classe respons�vel por validar os dados dos documentos. Utilizado em conjunto
 * com a classe FormatacaoDocumentos.
 *
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com>
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Vitor <vitornathang@gmail.com>
 *
 */
public class ValidacaoDocumentos {
	FormatacaoDocumentos formatadocumento = new FormatacaoDocumentos();

	/**
	 * Validar CPF.
	 * 
	 * Utiliza o algoritmo para verificar se o CPF contido na String � v�lido.
	 * 
	 * @param CPF
	 * @return boolean
	 */
	public boolean validarCPF(String CPF) {

		String CPFFormatado = formatadocumento.removerCaracteres(CPF);
		if (CPF.length() != 11) {
			return false;
		}

		return this.validaPrimeiroDigitoCPF(CPFFormatado) &&
				this.validaSegundoDigitoCPF(CPFFormatado);
	}

	public boolean validaPrimeiroDigitoCPF(String CPFFormatado) {
		int soma = 0;
		int mult = 10;

		for (int i = 0; i < 9; i++) {
			soma += mult * ((CPFFormatado.charAt(i) - 48));
			mult--;
		}

		return ((11 - soma % 11 == CPFFormatado.charAt(9) - 48)
				^ (11 - soma % 11 == 10 && CPFFormatado.charAt(9) - 48 == 0));

	}

	public boolean validaSegundoDigitoCPF(String CPFFormatado) {
		int soma = 0;
		int mult = 11;

		for (int i = 0; i < 10; i++) {
			soma += mult * ((CPFFormatado.charAt(i) - 48));
			mult--;
		}
		return ((11 - soma % 11 == CPFFormatado.charAt(10) - 48)
				^ (11 - soma % 11 == 10 && CPFFormatado.charAt(10) - 48 == 0));
	}

	/**
	 * ATEN��O: TELEFONE MOVEL Valida o tamanho do telefone
	 * 
	 * Este m�todo verifica se h� 11 d�gitos no telefone. Se houver ele retorna true
	 * caso contr�rio, retorna false.
	 * 
	 * @param telefone
	 * @return boolean
	 */
	public boolean validarTamanhoTelMovel(String telefone) {
		if (telefone.length() != 11) {
			return false;
		}
		return true;
	}

	/**
	 * ATEN��O: TELEFONE FIXO Valida o tamanho do telefone fixo.
	 * 
	 * Este m�todo verifica se h� 10 d�gitos no telefone. Se houver ele retorna true
	 * caso contr�rio, retorna false.
	 * 
	 * @param telefone
	 * @return boolean
	 */
	public boolean validarTamanhoTelFixo(String telefone) {
		if (telefone.length() != 10) {
			return false;
		}
		return true;
	}

	/**
	 * Verifica se um n�mero de CNPJ � valido.
	 * 
	 * Retorna true, caso o CNPJ seja v�lido
	 * 
	 * @param cnpj
	 * @return
	 */
	public boolean validarCNPJ(String cnpj) {

		String cnpjFormatado = formatadocumento.removerCaracteres(cnpj);
		if (cnpjFormatado.length() == 14) {
			String cnpjInvertido = "";

			for (int i = 13; i >= 0; i--) {
				cnpjInvertido += cnpjFormatado.charAt(i);
			}
			int mult = 2;
			int soma = 0;
			for (int i = 2; i < 14; i++) {
				soma += mult * (cnpjInvertido.charAt(i) - 48);
				if (mult == 9) {
					mult = 2;
				} else {
					mult++;
				}
			}
			if (cnpjInvertido.charAt(1) - 48 != 11 - (soma % 11)) {
				return false;
			}

			// pt2
			mult = 2;
			soma = 0;
			for (int i = 1; i < 14; i++) {
				soma += mult * (cnpjInvertido.charAt(i) - 48);
				if (mult == 9) {
					mult = 2;
				} else {
					mult++;
				}
			}
			if (cnpjInvertido.charAt(0) - 48 != 11 - (soma % 11)) {
				return false;
			}
			return true;

		}
		return false;
	}

	/**
	 * Validar email
	 * 
	 * Realiza valida��o do email para verificar se possui o caracter "@".
	 * 
	 * @param String email
	 * @return boolean
	 */
	public boolean validarEmail(String email) {
		if (!email.contains("@")) {
			return false;
		}
		return true;
	}

	/**
	 * Verifica se CEP cont�m 8 d�gitos
	 * 
	 * @param cep
	 * @return
	 */
	public boolean validarCEP(String cep) {
		if (formatadocumento.removerCaracteres(cep).length() != 8) {
			return false;
		}
		return true;
	}

}
