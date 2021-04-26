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

	@Test
	public void testCadastroContato() {
		Contatos contato = new Contatos("(47) 99999-9999", "(47) 12345-6789", "123@teste.com.br");
		Contatos.cadastrarContato(listaContatos, contato);
		assertTrue(listaContatos.indexOf(contato)>=0);
	}
	
	@Test
	public void testListarUmContato() {
		Contatos contato1 = new Contatos("(47) 99999-9999", "(47) 12345-6789", "456@teste.com.br");
		Contatos.cadastrarContato(listaContatos, contato1);
		Contatos contato2 = new Contatos("(47) 99999-9999", "(47) 12345-6789", "123@teste.com.br");
		Contatos.cadastrarContato(listaContatos, contato2);
		assertEquals("47999999999", Contatos.listarContato(listaContatos, 0).getTelefonePrincipal());
		assertEquals("47123456789", Contatos.listarContato(listaContatos, 0).getTelefoneSecundario());
		assertEquals("456@teste.com.br", Contatos.listarContato(listaContatos, 0).getEmail());
	}

	@Test
	public void testAtualizarUmContato() {
		Contatos contato1 = new Contatos("(47) 99999-9999", "48573459863", "456@teste.com.br");
		Contatos.cadastrarContato(listaContatos, contato1);
		Contatos contato2 = new Contatos("(47) 99999-9999", "47123456789", "123@teste.com.br");
		Contatos.atualizarContato(listaContatos, contato2, 0);
		assertEquals("47999999999", listaContatos.get(0).getTelefonePrincipal());
		assertEquals("123@teste.com.br", listaContatos.get(0).getEmail());
	}
	
	@Test
	public void testDeletarUmContatoPorId() {
		Contatos contato1 = new Contatos("(47) 99999-9999", "(47) 12345-6789", "456@teste.com.br");
		Contatos.cadastrarContato(listaContatos, contato1);
		Contatos contato2 = new Contatos("(47) 99999-9999", "(47) 12345-6789", "123@teste.com.br");
		Contatos.cadastrarContato(listaContatos, contato2);
		Contatos.deletarContato(listaContatos, 0);
		assertEquals("47999999999", listaContatos.get(0).getTelefonePrincipal());
		assertEquals("123@teste.com.br", listaContatos.get(0).getEmail());
	}
	
	@Test
	public void testDeletarUmContatoPassandoUmContato() {
		Contatos contato1 = new Contatos("(47) 99999-9999", "(47) 12345-6789", "456@teste.com.br");
		Contatos.cadastrarContato(listaContatos, contato1);
		Contatos contato2 = new Contatos("(47) 99999-9999", "(47) 12345-6789", "123@teste.com.br");
		Contatos.cadastrarContato(listaContatos, contato2);
		Contatos.removerUmContatoPassandoUmContato(listaContatos, contato1);
		assertEquals("47999999999", listaContatos.get(0).getTelefonePrincipal());
		assertEquals("47123456789", listaContatos.get(0).getTelefoneSecundario());
		assertEquals("123@teste.com.br", listaContatos.get(0).getEmail());
	}
	
	
	
	
	
	
}