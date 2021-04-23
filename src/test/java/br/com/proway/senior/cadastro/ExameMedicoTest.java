package br.com.proway.senior.cadastro;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import enums.TiposExame;
import model.Colaborador;
import model.ExameMedico;

public class ExameMedicoTest {

	TiposExame tipoExame1 = TiposExame.EXAME_PERIODICO;
	LocalDate dataExame1 = LocalDate.of(2021, 05, 15);
	boolean apto1 = false;
	TiposExame tipoExame2 = TiposExame.EXAME_ADMISSIONAL;
	LocalDate dataExame2 = LocalDate.of(2021, 06, 10);
	boolean apto2 = true;
	
	ExameMedico exame1 = new ExameMedico(tipoExame1, dataExame1, apto1);
	ExameMedico exame2 = new ExameMedico(tipoExame2, dataExame2, apto2);
	
	ArrayList<ExameMedico> listaExames = new ArrayList<ExameMedico>();
	
	@Test 
	@Ignore
	public void testEnumTipo() { 
		ExameMedico exame = new ExameMedico();
		String teste = exame.selecionarTipoExame(0); 
		assertEquals(teste, "EXAME_ADMISSIONAL");
	 }
	 
	@Test 
	public void testConstrutorExame() { 
		TiposExame tipo = TiposExame.EXAME_PERIODICO;
		ExameMedico exame = new ExameMedico(tipo, LocalDate.of(2021, 04, 04), false);
		assertEquals(tipo, exame.getTipoExame());
		assertEquals(LocalDate.of(2021, 04, 04), exame.getDataExame());
		assertEquals(false, exame.isApto());
		
	}
	
	@Test
	public void testCadastrarExameMedico() {
		ExameMedico.cadastrarExameMedico(listaExames, exame1);
		ExameMedico.cadastrarExameMedico(listaExames, exame2);
		assertTrue(listaExames.indexOf(exame1) == 0);
		assertTrue(listaExames.indexOf(exame2) == 1);
	}
	
	@Test
	public void testCadastrarExameErrado() {
		ExameMedico.cadastrarExameMedico(listaExames, exame1);
		assertFalse(listaExames.indexOf(exame1)<0);
	}
	
	@Ignore
	@Test
	public void testListarTodosExames() {
		ExameMedico.cadastrarExameMedico(listaExames, exame1);
		ExameMedico.cadastrarExameMedico(listaExames, exame2);
		ExameMedico.listarTodosExames(listaExames);
		assertEquals(tipoExame1, ExameMedico.listarTodosExames(listaExames).get(0).getTipoExame());
		assertEquals(dataExame1, ExameMedico.listarTodosExames(listaExames).get(0).getDataExame());
		assertEquals(apto1, ExameMedico.listarTodosExames(listaExames).get(0).isApto());
		assertEquals(tipoExame2, ExameMedico.listarTodosExames(listaExames).get(1).getTipoExame());
		assertEquals(dataExame2, ExameMedico.listarTodosExames(listaExames).get(1).getDataExame());
		assertEquals(apto2, ExameMedico.listarTodosExames(listaExames).get(1).isApto());
	}
	
	@Ignore
	@Test
	public void testListarExameCodigo() {
		ExameMedico.cadastrarExameMedico(listaExames, exame1);
		ExameMedico.cadastrarExameMedico(listaExames, exame2);
		ExameMedico.listarExameCodigo(listaExames, exame1);
		ExameMedico.listarExameCodigo(listaExames, exame2);
		assertEquals(tipoExame1, ExameMedico.listarExameCodigo(listaExames, exame1).get(0).getTipoExame());
		assertEquals(dataExame1, ExameMedico.listarExameCodigo(listaExames, exame1).get(0).getDataExame());
		assertEquals(apto1, ExameMedico.listarExameCodigo(listaExames, exame1).get(0).isApto());
		assertEquals(tipoExame2, ExameMedico.listarExameCodigo(listaExames, exame2).get(1).getTipoExame());
		assertEquals(dataExame2, ExameMedico.listarExameCodigo(listaExames, exame2).get(1).getDataExame());
		assertEquals(apto2, ExameMedico.listarExameCodigo(listaExames, exame2).get(1).isApto());
		
	}
	
	@Test
	public void testAtualizarExameMedico() {
		ExameMedico.cadastrarExameMedico(listaExames, exame1);
		ExameMedico.atualizarExameMedico(listaExames, exame1, exame2);
		assertEquals("ExameMedico [tipoExame=EXAME_ADMISSIONAL, dataExame=2021-06-10, apto=true, escolha=]", 
				listaExames.get(0).toString());
	}
	
	@Test
	public void testDeletarExameMedico() {
		ExameMedico.cadastrarExameMedico(listaExames, exame1);
		ExameMedico.deletarExameMedico(listaExames, exame1);
		assertTrue(listaExames.size() == 0);
	}
	
}
