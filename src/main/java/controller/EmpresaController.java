package controller;

import java.util.ArrayList;

import model.Empresa;

public class EmpresaController {

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
	 * Verifica se um número de CNPJ é valido.
	 * 
	 * Retorna true, caso o CNPJ seja válido
	 * 
	 * @param cnpj
	 * @return
	 */
	public boolean validaCNPJ(String cnpj) {

		String cnpjFormatado = this.formataCNPJ(cnpj);
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

		}
		return true;
	}

	/**
	 * Criar uma empresa.
	 * 
	 * Cria uma empresa e atribui ao ArrayList.
	 * 
	 * @param Empresa   Recebe uma instância de Empresa
	 * @param ArrayList Recebe uma instância de ArrayList.
	 */
	public void cadastrarEmpresa(ArrayList<Empresa> listaEmpresas, Empresa empresa) {
		listaEmpresas.add(empresa);
	}

	/**
	 * Exibir todas as empresas.
	 * 
	 * Mostra todas as empresas que estão no ArrayList.
	 * 
	 * @param ArrayList Recebe uma instância de ArrayList.
	 */
	public void listarEmpresa(ArrayList<Empresa> listaEmpresas) {
		for (Empresa empresa : listaEmpresas) {
			System.out.println(empresa.toString());
		}
	}

	/**
	 * Atualizar uma empresa.
	 * 
	 * Substitui o objeto "Empresa" antigo, pelo novo objeto informado no parâmetro.
	 * 
	 * @param ArrayList Recebe uma instância de ArrayList.
	 * @param Empresa   Recebe um objeto da empresa nova
	 * @param Empresa   Recebe o objeto referente à empresa antiga
	 */
	public void atualizarEmpresa(ArrayList<Empresa> listaEmpresas, Empresa empresaNova, Empresa empresaAntiga) {
		int indice = listaEmpresas.indexOf(empresaAntiga);
		listaEmpresas.set(indice, empresaNova);
	}

	/**
	 * Apagar uma empresa.
	 * 
	 * Apaga uma empresa do ArrayList<Empresa>
	 * 
	 * @param listaEmpresas
	 * @param empresa
	 */
	public void deletarEmpresa(ArrayList<Empresa> listaEmpresas, Empresa empresa) {
		listaEmpresas.remove(empresa);
	}

}
