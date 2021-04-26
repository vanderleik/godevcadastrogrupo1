package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import model.Documentos;

public class DocumentosTest {
	
	Documentos documentoPrincipal = new Documentos(1234567, 45678, LocalDate.of(2011, 3, 21), "Banco Imaginário", 12, 123456, 459751448486L, 78, 56, 100002467786L, 6433803, "Ministério do Exército", LocalDate.of(2013, 4, 16));
	Documentos documentoSecundario = new Documentos(1234567, 45678, LocalDate.of(2011, 3, 21), "Banco Imaginário", 12, 123456, 459751448486L, 78, 56, 6433803, "Ministério do Exército", LocalDate.of(2013, 4, 16));
	
	@Test
	public void testDocumentosPrincipal() {
		assertEquals(1234567, documentoPrincipal.getCtpsNumero());
		assertEquals(45678, documentoPrincipal.getCtpsSerie());
		assertEquals(LocalDate.of(2011, 3, 21), documentoPrincipal.getDataEmissaoCTPS());
		assertEquals("Banco Imaginário", documentoPrincipal.getBancoNome());
		assertEquals(12, documentoPrincipal.getBancoAgencia());
		assertEquals(123456, documentoPrincipal.getBancoNumeroConta());
		assertEquals(459751448486L, documentoPrincipal.getTituloNumero());
		assertEquals(78, documentoPrincipal.getTituloZona());
		assertEquals(56, documentoPrincipal.getTituloSecao());
		assertEquals(100002467786L, documentoPrincipal.getRaNumero());
		assertEquals(6433803, documentoPrincipal.getRgNumero());
		assertEquals("Ministério do Exército", documentoPrincipal.getOrgaoEmissorRG());
		assertEquals(LocalDate.of(2013, 4, 16), documentoPrincipal.getDataEmissaoRG());
	}

	@Test
	public void testDocumentosSecundario() {
		assertEquals(1234567, documentoSecundario.getCtpsNumero());
		assertEquals(45678, documentoSecundario.getCtpsSerie());
		assertEquals(LocalDate.of(2011, 3, 21), documentoSecundario.getDataEmissaoCTPS());
		assertEquals("Banco Imaginário", documentoSecundario.getBancoNome());
		assertEquals(12, documentoSecundario.getBancoAgencia());
		assertEquals(123456, documentoSecundario.getBancoNumeroConta());
		assertEquals(459751448486L, documentoSecundario.getTituloNumero());
		assertEquals(78, documentoSecundario.getTituloZona());
		assertEquals(56, documentoSecundario.getTituloSecao());
		assertEquals(6433803, documentoSecundario.getRgNumero());
		assertEquals("Ministério do Exército", documentoSecundario.getOrgaoEmissorRG());
		assertEquals(LocalDate.of(2013, 4, 16), documentoSecundario.getDataEmissaoRG());
	}

	@Test
	public void testeSettersGetters() {
		documentoPrincipal.setCtpsNumero(45678964);
		documentoPrincipal.setCtpsSerie(54751);
		documentoPrincipal.setDataEmissaoCTPS(LocalDate.of(1971, 1, 3));
		documentoPrincipal.setBancoNome("Banco Imobiliário");
		documentoPrincipal.setBancoAgencia(456);
		documentoPrincipal.setBancoNumeroConta(7854);
		documentoPrincipal.setTituloNumero(547254265L);
		documentoPrincipal.setTituloZona(23);
		documentoPrincipal.setTituloSecao(42);
		documentoPrincipal.setRaNumero(681315613L);
		documentoPrincipal.setRgNumero(447854);
		documentoPrincipal.setOrgaoEmissorRG("Ministério da Pesca");
		documentoPrincipal.setDataEmissaoRG(LocalDate.of(1989, 2, 4));
		
		assertEquals(45678964, documentoPrincipal.getCtpsNumero());
		assertEquals(54751, documentoPrincipal.getCtpsSerie());
		assertEquals(LocalDate.of(1971, 1, 3), documentoPrincipal.getDataEmissaoCTPS());
		assertEquals("Banco Imobiliário", documentoPrincipal.getBancoNome());
		assertEquals(456, documentoPrincipal.getBancoAgencia());
		assertEquals(7854, documentoPrincipal.getBancoNumeroConta());
		assertEquals(547254265L, documentoPrincipal.getTituloNumero());
		assertEquals(23, documentoPrincipal.getTituloZona());
		assertEquals(42, documentoPrincipal.getTituloSecao());
		assertEquals(681315613L, documentoPrincipal.getRaNumero());
		assertEquals(447854, documentoPrincipal.getRgNumero());
		assertEquals("Ministério da Pesca", documentoPrincipal.getOrgaoEmissorRG());
		assertEquals(LocalDate.of(1989, 2, 4), documentoPrincipal.getDataEmissaoRG());
	}
	
	@Test
	public void testCadastrarDocumentos() {
		ArrayList<Documentos> listaDocumentos = new ArrayList<Documentos>();
		Documentos.cadastrarDocumentos(listaDocumentos, documentoPrincipal);
		assertTrue(listaDocumentos.contains(documentoPrincipal));
	}
	
	@Test
	public void testAtualizarDocumentos() {
		ArrayList<Documentos> listaDocumentos = new ArrayList<Documentos>();
		listaDocumentos.add(documentoPrincipal);
		Documentos.atualizarDocumentos(listaDocumentos, documentoPrincipal, documentoSecundario);
		assertTrue(listaDocumentos.contains(documentoSecundario));
		assertFalse(listaDocumentos.contains(documentoPrincipal));
	}
	
	@Test
	public void testDeletarDocumentos() {
		ArrayList<Documentos> listaDocumentos = new ArrayList<Documentos>();
		listaDocumentos.add(documentoPrincipal);
		Documentos.deletarDocumentos(listaDocumentos, documentoPrincipal);
		assertTrue(listaDocumentos.size() == 0);
	}
}