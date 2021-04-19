package br.com.proway.senior.cadastro;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.examemedico.ExameMedico;
import br.com.proway.senior.godevcadastro.cadastro.examemedico.TiposExame;

public class ExameMedicoTest {

	
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
	
}
