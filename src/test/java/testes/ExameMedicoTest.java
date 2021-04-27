package testes;

import java.time.LocalDate;

import org.junit.Test;

import enums.EMOutros.TiposExames;
import model.ExameMedico;

public class ExameMedicoTest {
	
	@Test
	public void testeExameMedicoBuilder() {
		ExameMedico exameMedico = new ExameMedico.ExameMedicoBuilder().
				tipoExame(TiposExames.ADMISSIONAL).dataExame(LocalDate.of(2016, 11, 5)).
				apto(true).criarExameMedico();
		System.out.println(exameMedico.toString());
	}
}
