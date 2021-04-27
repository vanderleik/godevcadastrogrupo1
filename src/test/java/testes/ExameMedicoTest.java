package testes;

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
}
