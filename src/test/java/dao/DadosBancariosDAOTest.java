package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import model.DadosBancarios;
import model.Documentos;

/**
 * 
 * @author David Willian
 *
 */

public class DadosBancariosDAOTest {

	@Test
	public void A_InsertDadosBancariosIntoDB() {
		DadosBancarios dadosbanc = new DadosBancarios();
		dadosbanc.setColaboradorId(42);

		dadosbanc.setBancoNome("BANCO");
		dadosbanc.setBancoCodigo("109");

		dadosbanc.setAgenciaNumero("00011");
		dadosbanc.setAgenciaDigitoVerficador("9");
		dadosbanc.setBancoCodigo("109");

		dadosbanc.setContaNumero("123456789123");
		dadosbanc.setContaDigitoVerficador("999");

		DadosBancariosDAO daoDadosBancarios = new DadosBancariosDAO();

		assertTrue(daoDadosBancarios.cadastrar(dadosbanc));
	}
	@Test
	public void B_GetDadosBancariosFromDBbyColabId() {
		DadosBancariosDAO dadosbanc = new DadosBancariosDAO();
		
		int idFuncionario = 42;
		DadosBancarios output = dadosbanc.listar(idFuncionario);
		
		assertTrue(idFuncionario == output.getColaboradorId());
	}
	@Test
	public void C_GetAllDadosBancarios() {
		DadosBancariosDAO dadosbanc = new DadosBancariosDAO();

		ArrayList<DadosBancarios> output = dadosbanc.listarTudo();
		
		assertTrue(output.size() > 0);
	}
	@Test
	public void D_UpdateDadosBancariosByColabId() {
		DadosBancariosDAO dadosbanc = new DadosBancariosDAO();
		
		int idFuncionario = 42;
		
		DadosBancarios dbank = new DadosBancarios();
		dbank.setColaboradorId(idFuncionario);
		
		dbank.setColaboradorId(42);

		dbank.setBancoNome("BANCO");
		dbank.setBancoCodigo("109");

		dbank.setAgenciaNumero("00011");
		dbank.setAgenciaDigitoVerficador("9");
		dbank.setBancoCodigo("109");

		dbank.setContaNumero("123456789123");
		dbank.setContaDigitoVerficador("999");

		assertTrue(dadosbanc.atualizar(idFuncionario, dbank));
	}
	@Test
	public void E_DeleteDadosBancariosByColabId() {
		DadosBancariosDAO dadosbanc = new DadosBancariosDAO();
		
		int idFuncionario = 42;
		assertTrue(dadosbanc.delete(idFuncionario));
	}
}
