package br.com.proway.senior.godevcadastro.cadastro.empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import br.com.proway.senior.godevcadastro.cadastro.contatos.Contatos;
import br.com.proway.senior.godevcadastro.cadastro.endereco.Endereco;

/**
 * Classe que abstrai as informações de uma Empresa contratada.
 * Esta Classe será instanciada na Classe PrestadorServico, e instanciará as classes Endereco e Contato
 *
 * @author Thiago Barbieri
 *
 */
public class Empresa {
	
	private long empresaId;
	private String nomeEmpresa;
	private LocalDate dataInicioContrato;
	private String cnpj;
	private Endereco endereco;
	private Contatos contato;

	/**
	 * Construtor Empresa com todos os atributos.
	 * 
	 * @param empresaId
	 * @param nomeEmpresa Nome da Empresa
	 * @param dataInicioContrato Data do início do contrato (DD/MM/YYYY).
	 * @param cnpj Cnpj da Empresa
	 */
	public Empresa(long empresaId, String nomeEmpresa, LocalDate dataInicioContrato, String cnpj, Endereco endereco, Contatos contato) {
		super();
		this.empresaId = empresaId;
		this.nomeEmpresa = nomeEmpresa;
		this.dataInicioContrato = dataInicioContrato;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.contato = contato;
	}
	
	public Empresa() {
		super();
	}

	public long getEmpresaId() {
		return empresaId;
	}
	public void setEmpresaId(long empresaId) {
		this.empresaId = empresaId;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public LocalDate getDataInicioContrato() {
		return dataInicioContrato;
	}
	public void setDataInicioContrato(LocalDate dataInicioContrato) {
		this.dataInicioContrato = dataInicioContrato;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Contatos getContato() {
		return contato;
	}
	
	public void setContato(Contatos contato) {
		this.contato = contato;
	}
	
	public void validarCnpj(String cnpj) {
		
	}
	
	public static String formataCNPJ(String cnpj) {
		String output = "";
		for (byte code : cnpj.getBytes()) {
			if (code-48 < 10 && code - 48 >= 0) {
				output += Character.toString((char) code);
			}
		}
		return output;
	}
	
	/**
	 * Verifica se um número de CNPJ é valido.
	 * 
	 * Retorna true, caso o CNPJ seja válido
	 * @param cnpj
	 * @return
	 * @author Vitor Nathan Gonçalves
	 */
	public static boolean validaCNPJ(String cnpj) {
		
		String cnpjFormatado = Empresa.formataCNPJ(cnpj);
		if(cnpjFormatado.length() == 14) {
			String cnpjInvertido = "";
			
			for(int i = 13; i >= 0; i--) {
				cnpjInvertido += cnpjFormatado.charAt(i);
			}
			
			int mult = 2;
			int soma = 0;
			for(int i = 2; i < 14; i++) {
				soma += mult*(cnpjInvertido.charAt(i)-48);
				if(mult == 9) {
					mult = 2;
				} else {
					mult++;
				}
			}
			
			if(cnpjInvertido.charAt(1)-48 != 11 - (soma%11)) {
				return false;
			}
			
			//pt2
			mult = 2;
			soma = 0;
			for(int i = 1; i < 14; i++) {
				soma += mult*(cnpjInvertido.charAt(i)-48);
				if(mult == 9) {
					mult = 2;
				} else {
					mult++;
				}
			}
			
			if(cnpjInvertido.charAt(0)-48 != 11 - (soma%11)) {
				return false;
			}
			
		
		} 
		return true;
	}
	
	 
	
	
	/**
	 * @author Samuel, Vitor.
	 * 
	 * Criar uma empresa.
	 * 
	 * Cria uma empresa e atribui ao ArrayList.
	 * 
	 * @param Empresa Recebe uma instância de Empresa
	 * @param ArrayList Recebe uma instância de ArrayList.
	 */
	public static void createEmpresa (ArrayList<Empresa> empresas, Empresa empresa) {
		empresas.add(empresa);
	}
	
	/**
	 * @author Samuel, Vitor.
	 * 
	 * Exibir todas as  empresas.
	 * 
	 * Mostra todas as empresas que estão no ArrayList.
	 * 
	 * @param ArrayList Recebe uma instância de ArrayList.
	 */
	public static void readEmpresa (ArrayList<Empresa> empresas) {
		for (Empresa empresa : empresas) {
			System.out.println(empresa.toString());
		}
	}
	
	/**
	 * @author Samuel, Vitor.
	 * 
	 * Atualizar uma empresa.
	 * 
	 * Substitui o objeto "Empresa" antigo, pelo novo objeto informado no parâmetro.
	 * 
	 * @param ArrayList Recebe uma instância de ArrayList.
	 * @param Empresa Recebe um objeto da empresa nova
	 * @param Empresa Recebe o objeto referente à empresa antiga
	 */
	public static void updateEmpresa (ArrayList<Empresa> empresas, Empresa empresa, Empresa empresaAntiga) {
		int indice = empresas.indexOf(empresaAntiga);
		empresas.set(indice, empresa);
	}
	
	/**
	 * Apagar uma empresa.
	 * 
	 * Apaga uma empresa do ArrayList<Empresa>
	 * @param empresas
	 * @param empresa
	 */
	public static void deleteEmpresa(ArrayList<Empresa> empresas, Empresa empresa) {
		empresas.remove(empresa);
	}
	
	@Override
	public String toString() {
		return "Empresa [empresaId=" + empresaId + ", nomeEmpresa=" + nomeEmpresa + ", dataInicioContrato="
				+ dataInicioContrato + ", cnpj=" + cnpj + ", endereco=" + endereco + ", contato= " + contato + "]";
	}
	

	
}
