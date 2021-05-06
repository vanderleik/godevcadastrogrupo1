package dao;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import model.Documentos;
import model.ExameMedico;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExameMedicoDAOTest {


	@Test
	public void A_InsertDocumentIntoDB() {
		ExameMedicoDAO emdao = new ExameMedicoDAO();
		ExameMedico em = new ExameMedico();
		em.setColaboradorId(42);
		em.setApto(true);
		em.setDataExame(LocalDate.of(2021, 5, 5));
		em.setTipoExame(1);

		assertTrue(emdao.cadastrar(em));
	}
	
	@Test
	public void B_GetDocumentFromDBbyColabId() {
		ExameMedicoDAO emdao = new ExameMedicoDAO();
		
		int idFuncionario = 42;
		ExameMedico em = emdao.listar(idFuncionario);
		
		assertTrue(idFuncionario == em.getColaboradorId());
	}
	
	@Test
	public void C_GetAllDocuments() {
		ExameMedicoDAO emdao = new ExameMedicoDAO();

		ArrayList<ExameMedico> output = emdao.listarTudo();
		
		assertTrue(output.size() > 0);
	}
	
	@Test
	public void D_UpdateDocumentByColabId() {
		ExameMedicoDAO emdao = new ExameMedicoDAO();

		int idFuncionario = 42;
		
		ExameMedico em = new ExameMedico();
		em.setColaboradorId(idFuncionario);
		em.setApto(false);
		em.setDataExame(LocalDate.of(2020, 4, 4));
		em.setTipoExame(2);
		
		assertTrue(emdao.atualizar(idFuncionario, em));
	}
	
	@Test
	public void E_DeleteDocumentByColabId() {
		ExameMedicoDAO emdao = new ExameMedicoDAO();
		
		int idFuncionario = 42;
		assertTrue(emdao.delete(idFuncionario));
	}

}
