package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.contatos.Contatos;

public class ContatosTest {

	ArrayList<Contatos> contatos = new ArrayList<Contatos>();
	
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
		Contatos contatos = new Contatos("(47) 99999-9999", "47123456789", "123@teste.com.br");
		assertEquals("47999999999" , contatos.getTelefonePrincipal());
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
		assertEquals("123@teste.com.br", contatos.getEmail());
	}

	@Test
	public void testToString() {
		Contatos contatos = new Contatos("47987654321", "47123456789", "123@teste.com.br");
		assertEquals("Contatos [telefonePrincipal=47987654321, telefoneSecundario=47123456789, email=123@teste.com.br]",
				contatos.toString());
	}
	
	@Test
	public void testCadastroContato() {
		Contatos contato = new Contatos("47987654321", "47123456789", "123@teste.com.br");
		Contatos.cadastrarContato(contatos, contato);
		assertTrue(contatos.indexOf(contato)>=0);
	}
	
	@Test
	public void testListarUmContato() {
		Contatos contato1 = new Contatos("48953627858", "48573459863", "456@teste.com.br");
		Contatos.cadastrarContato(contatos, contato1);
		Contatos contato2 = new Contatos("47987654321", "47123456789", "123@teste.com.br");
		Contatos.cadastrarContato(contatos, contato2);
		assertEquals("48953627858", Contatos.listarContato(contatos, 0).getTelefonePrincipal());
		assertEquals("48573459863", Contatos.listarContato(contatos, 0).getTelefoneSecundario());
		assertEquals("456@teste.com.br", Contatos.listarContato(contatos, 0).getEmail());
	}

	@Test
	public void testAtualizarUmContato() {
		Contatos contato1 = new Contatos("48953627858", "48573459863", "456@teste.com.br");
		Contatos.cadastrarContato(contatos, contato1);
		Contatos contato2 = new Contatos("47987654321", "47123456789", "123@teste.com.br");
		Contatos.atualizarUmContato(contatos, contato2, 0);
		assertEquals("47987654321", contatos.get(0).getTelefonePrincipal());
		assertEquals("123@teste.com.br", contatos.get(0).getEmail());
	}
	
	@Test
	public void testRemoverUmContatoPorId() {
		Contatos contato1 = new Contatos("48953627858", "48573459863", "456@teste.com.br");
		Contatos.cadastrarContato(contatos, contato1);
		Contatos contato2 = new Contatos("47987654321", "47123456789", "123@teste.com.br");
		Contatos.cadastrarContato(contatos, contato2);
		Contatos.removerUmContato(contatos, 0);
		assertEquals("47987654321", contatos.get(0).getTelefonePrincipal());
		assertEquals("123@teste.com.br", contatos.get(0).getEmail());
	}
	
	@Test
	public void testRemoverUmContatoPassandoUmContato() {
		Contatos contato1 = new Contatos("48953627858", "48573459863", "456@teste.com.br");
		Contatos.cadastrarContato(contatos, contato1);
		Contatos contato2 = new Contatos("47987654321", "47123456789", "123@teste.com.br");
		Contatos.cadastrarContato(contatos, contato2);
		Contatos.removerUmContatoPassandoUmContato(contatos, contato1);
		assertEquals("47987654321", contatos.get(0).getTelefonePrincipal());
		assertEquals("123@teste.com.br", contatos.get(0).getEmail());
	}
	
	
	
	
	
	
}