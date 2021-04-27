package testes;

import org.junit.Test;

import model.Contatos;

public class ContatosTest {

	@Test
	public void testeContatosBuilder () {
		Contatos contatos = new Contatos.ContatosBuilder().telefonePrincipal("1140028922").
				telefoneSecundario("08002014007").email("email@testeemail.net").criarContato();
		System.out.println(contatos.toString());
	}
}