package controller;

import java.util.ArrayList;

import model.Empresa;

public class EmpresaController {

	
	

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
