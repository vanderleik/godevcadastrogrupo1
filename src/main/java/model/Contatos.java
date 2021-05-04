package model;

import java.util.ArrayList;

/**
 * Armazena os contatos necessários de um colaborador, empresa ou prestador de
 * serviço.
 * 
 * Deve ser instanciado utilizando o ContatosBuilder. 
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago Luiz Barbieri e Vitor Nathan Gonçalves.
 *
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com> 
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Vitor <vitornathang@gmail.com>
 */

public class Contatos{
	private int pessoaId;
	
	private ArrayList<String> telefonePrincipal;
	private ArrayList<String> email;

	private Contatos(ArrayList<String> telefonePrincipal, ArrayList<String> email) {
		setTelefonePrincipal(telefonePrincipal);
		setEmail(email);
	}


	public ArrayList<String> getTelefonePrincipal() {
		return telefonePrincipal;
	}

	public void setTelefonePrincipal(ArrayList<String> telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}

	public ArrayList<String> getEmail() {
		return email;
	}

	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Contatos [telefonePrincipal=" + telefonePrincipal + ", email=" + email + "]";
	}



	/**
	 * Cria contato.
	 * É utilizado para criar um objeto da classe contato.
	 * 
	 * Exemplo de uso:
	 * Contatos contatos = new Contatos.ContatosBuilder().telefonePrincipal("1140028922").
				telefoneSecundario("08002014007").email("email@testeemail.net").criarContato();
	 * 
	 * @author Bruna <sh4323202@gmail.com>
	 * @author Enzo <enzomm.bodyandmind@gmail.com> 
	 * @author Sabrina <sabrinaschmidt335@gmail.com>
	 * @author Vanderlei <vanderleik@yahoo.com.br>
	 * @author Vitor <vitornathang@gmail.com>
	 */
	public static class ContatosBuilder {
		
		private String telefonePrincipal;
		private String telefoneSecundario;
		private String email;

		public ContatosBuilder() {}

		public ContatosBuilder telefonePrincipal(String telefonePrincipal) {
			this.telefonePrincipal = telefonePrincipal;
			return this;
		}

		public ContatosBuilder telefoneSecundario(String telefoneSecundario) {
			this.telefoneSecundario = telefoneSecundario;
			return this;
		}

		public ContatosBuilder email(String email) {
			this.email = email;
			return this;
		}

//		public Contatos criarContato() {
//			return 
//		}
	}
}
