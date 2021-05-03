package testes;

import static org.junit.Assert.assertTrue;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.Test;

import dao.DocumentosDAO;
import model.Documentos;

public class DAODocumentosTest {

	@Test
	public void test() {
		Documentos doc = new Documentos();
		doc.setColaboradorId(1);
		doc.setCtpsNumero("1234567");
		doc.setCtpsSerie("1234");
		doc.setDataEmissaoCTPS(LocalDate.of(2021, 05, 06));
		doc.setTituloNumero("1234567");
		doc.setTituloZona("123");
		doc.setTituloSecao("1234");
		doc.setRaNumero("123456789101213");
		doc.setRaSerie("123");
		
		doc.setRgNumero("1234567");
		doc.setDataEmissaoRG(LocalDate.of(2021, 05, 06));
		doc.setOrgaoEmissorRG("123456");

		DocumentosDAO docdao = new DocumentosDAO();
		//docdao.cadastrar(doc);
		assertTrue(docdao.cadastrar(doc));
	}

}
