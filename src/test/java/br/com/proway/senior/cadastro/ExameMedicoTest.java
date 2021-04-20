package br.com.proway.senior.cadastro;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.colaborador.Colaborador;
import br.com.proway.senior.godevcadastro.cadastro.examemedico.ExameMedico;
import br.com.proway.senior.godevcadastro.cadastro.examemedico.TiposExame;

public class ExameMedicoTest {

	TiposExame tipoExame1 = TiposExame.EXAME_PERIODICO;
	LocalDate dataExame1 = LocalDate.of(2021, 05, 15);
	boolean apto1 = false;
	TiposExame tipoExame2 = TiposExame.EXAME_ADMISSIONAL;
	LocalDate dataExame2 = LocalDate.of(2021, 06, 10);
	boolean apto2 = true;
	
	ExameMedico exame1 = new ExameMedico(tipoExame1, dataExame1, apto1);
	ExameMedico exame2 = new ExameMedico(tipoExame2, dataExame2, apto2);
	
	ArrayList<ExameMedico> exames = new ArrayList<ExameMedico>();
	
	@Test 
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
		ExameMedico.cadastrarExameMedico(exames, exame1);
		ExameMedico.cadastrarExameMedico(exames, exame2);
		assertTrue(exames.indexOf(exame1) == 0);
		assertTrue(exames.indexOf(exame2) == 1);
	}
	
	@Test
	public void testCadastrarExameErrado() {
		ExameMedico.cadastrarExameMedico(exames, exame1);
		assertFalse(exames.indexOf(exame1)<0);
	}
	
	@Ignore
	@Test
	public void testListarTodosExames() {
		ExameMedico.cadastrarExameMedico(exames, exame1);
		ExameMedico.cadastrarExameMedico(exames, exame2);
		ExameMedico.listarTodosExames(exames);
		assertEquals(tipoExame1, ExameMedico.listarTodosExames(exames).get(0).getTipoExame());
		assertEquals(dataExame1, ExameMedico.listarTodosExames(exames).get(0).getDataExame());
		assertEquals(apto1, ExameMedico.listarTodosExames(exames).get(0).isApto());
		assertEquals(tipoExame2, ExameMedico.listarTodosExames(exames).get(1).getTipoExame());
		assertEquals(dataExame2, ExameMedico.listarTodosExames(exames).get(1).getDataExame());
		assertEquals(apto2, ExameMedico.listarTodosExames(exames).get(1).isApto());
	}
	
	@Ignore
	@Test
	public void testListarExameCodigo() {
		ExameMedico.cadastrarExameMedico(exames, exame1);
		ExameMedico.cadastrarExameMedico(exames, exame2);
		ExameMedico.listarExameCodigo(exames, exame1);
		ExameMedico.listarExameCodigo(exames, exame2);
		assertEquals(tipoExame1, ExameMedico.listarExameCodigo(exames, exame1).get(0).getTipoExame());
		assertEquals(dataExame1, ExameMedico.listarExameCodigo(exames, exame1).get(0).getDataExame());
		assertEquals(apto1, ExameMedico.listarExameCodigo(exames, exame1).get(0).isApto());
		assertEquals(tipoExame2, ExameMedico.listarExameCodigo(exames, exame2).get(1).getTipoExame());
		assertEquals(dataExame2, ExameMedico.listarExameCodigo(exames, exame2).get(1).getDataExame());
		assertEquals(apto2, ExameMedico.listarExameCodigo(exames, exame2).get(1).isApto());
		
	}
	
	@Test
	public void testAtualizarExameMedico() {
		ExameMedico.cadastrarExameMedico(exames, exame1);
		ExameMedico.atualizarExameMedico(exames, exame1, exame2);
		assertEquals("ExameMedico [tipoExame=EXAME_ADMISSIONAL, dataExame=2021-06-10, apto=true, escolha=]", 
				exames.get(0).toString());
	}
	
	@Test
	public void testDeletarColaborador() {
		ExameMedico.cadastrarExameMedico(exames, exame1);
		ExameMedico.deletarExameMedico(exames, exame1);
		assertTrue(exames.size() == 0);
	}
	
}
