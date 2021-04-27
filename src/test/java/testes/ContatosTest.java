package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import model.Contatos;

public class ContatosTest {

	ArrayList<Contatos> listaContatos = new ArrayList<Contatos>();
	
	@Test
	public void testContatosPrincipal() {
		Contatos contato = new Contatos("(47) 99999-9999", "(47) 12345-6789", "123@teste.com.br");
		assertEquals("47999999999", contato.getTelefonePrincipal());
		assertEquals("47123456789", contato.getTelefoneSecundario());
		assertEquals("123@teste.com.br", contato.getEmail());
	}

	@Test
	public void testContatosTelefonePrincipalEEmail() {
		Contatos contato = new Contatos("(47) 99999-9999", "123@teste.com.br");
		assertEquals("47999999999", contato.getTelefonePrincipal());
		assertEquals("123@teste.com.br", contato.getEmail());
	}

	@Test
	public void testSetTelefonePrincipal() {
		Contatos contato = new Contatos("(47) 99999-9999", "(47) 12345-6789", "123@teste.com.br");
		assertEquals("47999999999", contato.getTelefonePrincipal());
	}

	@Test
	public void testSetTelefoneSecundario() {
		Contatos contato = new Contatos("(47) 99999-9999", "(47) 12345-6789", "123@teste.com.br");
		assertEquals("47123456789", contato.getTelefoneSecundario());
	}

	@Test
	public void testSetEmail() {
		Contatos contato = new Contatos("(47) 99999-9999", "(47) 12345-6789", "123@teste.com.br");
		assertEquals("123@teste.com.br", contato.getEmail());
	}
}