package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import dao.DocumentosDAO;
import model.Documentos;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
/**
 * Testes para o DAODocumentos. Os testes acontecem em ordem sequencial por nome.
 * @author senior
 *
 */
public class DAODocumentosTest {
	
//	@Before
//	public void cleanDb() {
//		
//	}
	
	@Test
	public void A_InsertDocumentIntoDB() {
		Documentos doc = new Documentos();
		doc.setColaboradorId(42);
		
		doc.setCtpsNumero("2345678");
		doc.setCtpsSerie("1092");
		doc.setDataEmissaoCTPS(LocalDate.of(2021, 05, 06));
		
		doc.setTituloNumero("0001123");
		doc.setTituloZona("666");
		doc.setTituloSecao("0420");
		
		doc.setRaNumero("123456789101213");
		doc.setRaSerie("999");
		
		doc.setRgNumero("7654321");
		doc.setDataEmissaoRG(LocalDate.of(2021, 05, 16));
		doc.setOrgaoEmissorRG("999666");

		DocumentosDAO docdao = new DocumentosDAO();
		
		assertTrue(docdao.cadastrar(doc));
	}
	
	@Test
	public void B_GetDocumentFromDBbyColabId() {
		DocumentosDAO docdao = new DocumentosDAO();
		
		int idFuncionario = 42;
		Documentos output = docdao.listar(idFuncionario);
		
		assertEquals(idFuncionario, output.getColaboradorId());
	}
	
	@Test
	public void C_GetAllDocuments() {
		DocumentosDAO docdao = new DocumentosDAO();

		ArrayList<Documentos> output = docdao.listarTudo();
		
		assertTrue(output.size() > 0);
	}

}
