package br.com.proway.senior.cadastro;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.contatos.Contatos;

public class ContatosTest {

	@Test
	public void testContatosPrincipal() {
		Contatos contatos = new Contatos("47987654321", "47123456789", "123@teste.com.br");
		assertEquals("47987654321", contatos.getTelefonePrincipal());
		assertEquals("47123456789", contatos.getTelefoneSecundario());
		assertEquals("123@teste.com.br", contatos.getEmail());
	}

	@Test
	public void testContatosStringString() {
		Contatos contatos = new Contatos("47987654321", "123@teste.com.br");
		assertEquals("47987654321", contatos.getTelefonePrincipal());
		assertTrue(null == contatos.getTelefoneSecundario());
		assertEquals("123@teste.com.br", contatos.getEmail());
	}

	@Test
	public void testSetTelefonePrincipal() {
		Contatos contatos = new Contatos("47987654321", "47123456789", "123@teste.com.br");
		contatos.setTelefonePrincipal("12345678910");
		assertEquals(contatos.getTelefonePrincipal(), "12345678910");
	}

	@Test
	public void testSetTelefoneSecundario() {
		Contatos contatos = new Contatos("47987654321", "47123456789", "123@teste.com.br");
		contatos.setTelefoneSecundario("12345678910");
		assertEquals(contatos.getTelefoneSecundario(), "12345678910");
	}

	@Test
	public void testSetEmail() {
		Contatos contatos = new Contatos("47987654321", "47123456789", "123@teste.com.br");
		contatos.setEmail("abcd@teste.com");
		assertEquals(contatos.getEmail(), "abcd@teste.com");
	}

	@Test
	public void testToString() {
		Contatos contatos = new Contatos("47987654321", "47123456789", "123@teste.com.br");
		assertEquals("Contatos [telefonePrincipal=47987654321, telefoneSecundario=47123456789, email=123@teste.com.br]",
				contatos.toString());
	}

}