package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import controller.FormatacaoDocumentos;

public class TesteFormatacaoDocumentos {

	FormatacaoDocumentos fd = new FormatacaoDocumentos();
	
	@Test
	public void testeFormataCPF() {
		assertEquals(fd.removerCaracteres("211.640.283-24"), "21164028324");
	}
	
	@Test
	public void testeFormataCNPJ() {
		assertEquals(fd.removerCaracteres("05.975.585/0001-89"), "05975585000189");
	}
	
	@Test
	public void testeFormataCEP() {
		assertEquals(fd.removerCaracteres("891100-00"), "89110000");
	}
	
	@Test
	public void testeFormataTelefone() {
		assertEquals(fd.removerCaracteres("4002-8922"), "40028922");
	}
}