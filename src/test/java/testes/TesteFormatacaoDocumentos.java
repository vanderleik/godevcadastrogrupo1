package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import controller.FormataDocumentos;

public class TesteFormatacaoDocumentos {

	FormataDocumentos fd = new FormataDocumentos();
	
	@Test
	public void testeFormataCPF() {
		assertEquals(fd.formatarCPF("211.640.283-24"), "21164028324");
	}
	
	@Test
	public void testeFormataCNPJ() {
		assertEquals(fd.formataCNPJ("05.975.585/0001-89"), "05975585000189");
	}
	
	@Test
	public void testeFormataCEP() {
		assertEquals(fd.formatarCEP("891100-00"), "89110000");
	}
	
	@Test
	public void testeFormataTelefone() {
		assertEquals(fd.formatarTelefone("4002-8922"), "40028922");
	}
}