package br.com.proway.senior.godevcadastro.cadastro.contatos;

import java.util.ArrayList;

import br.com.proway.senior.godevcadastro.cadastro.colaborador.Colaborador;

/**
 * Armazena os contatos necessários de um colaborador, empresa ou prestador de serviço.
 * 
 * É instanciada nas classes Colaborador, Empresa, e PrestadorServico.
 * @author Vitor Nathan Gonçalves
 *
 */
public class Contatos {
	
	/**
	 * Telefone mais utilizado pela pessoa
	 */
	private String telefonePrincipal;
	
	/**
	 * Telefone menos utilizado/recado
	 */
	private String telefoneSecundario;
	
	/**
	 * Email principal da pessoa
	 */
	private String email;
	
	/**
	 * Construtor principal da classe.
	 * 
	 * Inclui o telefone secundário
	 * @param telefonePrincipal
	 * @param telefoneSecundario
	 * @param email
	 */
	public Contatos(String telefonePrincipal, String telefoneSecundario, String email) {
		this.telefonePrincipal = telefonePrincipal;
		this.telefoneSecundario = telefoneSecundario;
		this.email = email;
	}
	
	/**
	 * Construtor secundário da classe
	 * 
	 * NÃO inclui o telefone secundário
	 * 
	 * @param telefonePrincipal
	 * @param email
	 */
	public Contatos(String telefonePrincipal, String email) {
		this.telefoneSecundario = null;
		this.telefonePrincipal = telefonePrincipal;
		this.email = email;
	}

	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}

	public void setTelefonePrincipal(String telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}

	public String getTelefoneSecundario() {
		return telefoneSecundario;
	}

	public void setTelefoneSecundario(String telefoneSecundario) {
		this.telefoneSecundario = telefoneSecundario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Cadastrar contato
	 * 
	 * Realiza cadastro de contato no ArrayList<Contatos>
	 * 
	 * @param contatos
	 * @param contato
	 */
	public static void cadastrarContato(ArrayList<Contatos> contatos, Contatos contato) {
		contatos.add(contato);
	}
	
	/**
	 * Formatar telefone
	 * 
	 * Realiza a validação do telefone para verificar se possui apenas numeros.
	 * 
	 * @param String telefone
	 * @return telefone Formatado
	 */
	public static String formatarTelefone(String telefone) {
		String telefoneFormatado = "";
		for (byte code : telefone.getBytes()) {
			if (code-48 < 10 && code - 48 >= 0) {
				telefoneFormatado += Character.toString((char) code);
			}
		}
		return telefoneFormatado;
	}

	
	/**
	 * Validar email
	 * 
	 * Realiza validação do email para verificar se possui o caracter "@".
	 * 
	 * @param String email
	 * @return true caso valido
	 */
	public static boolean validarEmail(String email) {
		if(!email.contentEquals("@")) {
			return false;
		}
		return true;
	}
	
	public static void listarContato() {
		
	}
	

	@Override
	public String toString() {
		return "Contatos [telefonePrincipal=" + telefonePrincipal + ", telefoneSecundario=" + telefoneSecundario
				+ ", email=" + email + "]";
	}

}
