package br.com.proway.senior.godevcadastro.cadastro.contatos;

import java.util.ArrayList;

/**
 * Armazena os contatos necessários de um colaborador, empresa ou prestador de
 * serviço.
 * 
 * É instanciada nas classes Colaborador, Empresa, e PrestadorServico.
 * 
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
	 * 
	 * @param telefonePrincipal
	 * @param telefoneSecundario
	 * @param email
	 */
	public Contatos(String telefonePrincipal, String telefoneSecundario, String email) {
		setTelefonePrincipal(telefonePrincipal);
		setTelefoneSecundario(telefoneSecundario);
		setEmail(email);
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
		setTelefonePrincipal(telefonePrincipal);
		setEmail(email);
	}

	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}

	public void setTelefonePrincipal(String telefonePrincipal) {
		String telFormatado = formatarTelefone(telefonePrincipal);
		if(validarTamanhoTel(telFormatado)) {
			this.telefonePrincipal = telFormatado;
		} else {
			System.out.println("Telefone inválido!");
		}
	}

	public String getTelefoneSecundario() {
		return telefoneSecundario;
	}

	/**
	 * Insere o telefone principal no Objeto Contatos
	 * 
	 * Este metodo faz a inserção do telefone no objeto, desde que seja valido
	 * 
	 * @param telefoneSecundario
	 */
	public void setTelefoneSecundario(String telefoneSecundario) {
		String telFormatado = formatarTelefone(telefoneSecundario);
		if(validarTamanhoTel(telFormatado)) {
			this.telefoneSecundario = telFormatado;
		} else {
			System.out.println("Telefone inválido!");
		}
	}

	public String getEmail() {
		return email;
	}

	/**
	 * Insere o email no objeto
	 * 
	 * Este método faz a inserção do email no objeto, desde que haja o caractere "@"
	 * na String
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		if (email.contains("@")) {
			this.email = email;
		} else {
			System.out.println("Email inválido!");
		}
	}
	
	/**
	 * Valida o tamanho do telefone
	 * 
	 * Este metodo verifica se ha 11 digitos no telefone. Se houver ele retorna true
	 * caso contrario retorna false.
	 * 
	 * @param telefone
	 * @return true || false
	 */
	public boolean validarTamanhoTel(String telefone) {
		if(telefone.length() != 11) {
			return false;
		}
		return true;
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
			if (code - 48 < 10 && code - 48 >= 0) {
				telefoneFormatado += Character.toString((char) code);
			}
		}
		return telefoneFormatado;
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
	 * Validar email
	 * 
	 * Realiza validação do email para verificar se possui o caracter "@".
	 * 
	 * @param String email
	 * @return true caso valido
	 */
	public static boolean validarEmail(String email) {
		if (!email.contentEquals("@")) {
			return false;
		}
		return true;
	}

	/**
	 * Lista um contato
	 * 
	 * Este método verifica se o id informado é menor ou igual ao tamanho total da
	 * lista, e se for menor ou igual, adiciona à lista de contatos
	 * 
	 * @param ArrayList<Contatos> contatos
	 * @param Integer             id
	 * @return contatos.get(id)
	 */
	public static Contatos listarContato(ArrayList<Contatos> contatos, Integer id) {
		if (id <= contatos.size() - 1) {
			contatos.get(id).getEmail();
			contatos.get(id).getTelefonePrincipal();
			contatos.get(id).getTelefoneSecundario();
			return contatos.get(id);
		}
		return null;
	}

	/**
	 * Atualiza os dados do contato
	 * 
	 * Este método atualiza os dados de contato e faz uma verificação se o id
	 * informado é menor ou igual ao tamanho total da lista, e se for, ele irá
	 * buscar o usuário a ser atualizado pelo id e trocar seus dados
	 * 
	 * @param ArrayList<Contatos> contatos
	 * @param Contatos            contato
	 * @param Integer             id
	 * @return Contatos contato
	 */
	public static Contatos atualizarUmContato(ArrayList<Contatos> contatos, Contatos contato, Integer id) {
		if (id <= contatos.size() - 1) {
			contatos.set(id, contato);
			return contato;
		}
		return null;
	}

	/**
	 * Remove um contato da lista
	 * 
	 * Este método remove um contato da lista e faz uma verificação se o id
	 * informado é menor ou igual ao tamanho total da lista, e se for, ele irá
	 * buscar o contato a ser removido por id e removerá da lista
	 * 
	 * @param ArrayList<Contatos> contatos
	 * @param Integer             id
	 * @return String "Contato foi removido com sucesso!"
	 */
	public static String removerUmContato(ArrayList<Contatos> contatos, Integer id) {
		if (id <= contatos.size() - 1) {
			contatos.remove(contatos.get(id));
			return "Contato foi removido com sucesso!";
		}
		return "Contato não foi encontrado!";
	}

	/**
	 * Remove um contato da lista
	 * 
	 * Este método remove um contato da lista e faz uma verificação se o objeto contato
	 * informado estiver na lista, caso não esteja, retorna uma String de aviso.
	 * 
	 * @param ArrayList<Contatos> contatos
	 * @param Contatos contato
	 * @return String "Contato foi removido com sucesso!"
	 */
	public static String removerUmContatoPassandoUmContato(ArrayList<Contatos> contatos, Contatos contato) {
		try {
			contatos.remove(contato);
			return "Contato foi removido com sucesso!";
		} catch (Exception e) {
			return "Contato não foi encontrado!";
		}
	}

	@Override
	public String toString() {
		return "Contatos [telefonePrincipal=" + telefonePrincipal + ", telefoneSecundario=" + telefoneSecundario
				+ ", email=" + email + "]";
	}

}
