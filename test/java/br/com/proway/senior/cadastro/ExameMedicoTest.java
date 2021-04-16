package br.com.proway.senior.cadastro;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExameMedicoTest {

	
	@Test 
	public void testEnumTipo() { 
	ExameMedico exame = new ExameMedico();
	String teste = exame.testeTipo(0); 
	assertEquals(teste, "EXAME_ADMISSIONAL");
	 }
	 
}
