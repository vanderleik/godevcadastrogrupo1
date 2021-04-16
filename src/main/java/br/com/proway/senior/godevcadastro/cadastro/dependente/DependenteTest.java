package br.com.proway.senior.godevcadastro.cadastro.dependente;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class DependenteTest {
	Dependente dep01 = new Dependente("Paulo", "Levi",
			LocalDate.of(2007, 5, 12), null, "Masculino",
			'M', "Daniela Alves","00012345678", "Brasileira",
			false, 23, 5515, "Filho(a)", true);
	
	@Test
	public void testConstrutorDependente() {
		assertEquals("Paulo", dep01.getNome());
		assertEquals("Levi", dep01.getSobrenome());
		assertEquals(LocalDate.of(2007, 5, 12), dep01.getDataDeNascimento());
		assertEquals(null, dep01.getNomeSocial());
		assertEquals("Masculino", dep01.getGenero());
		assertEquals('M', dep01.getSexo());
		assertEquals("Daniela Alves", dep01.getNomeDaMae());
		assertEquals("00012345678", dep01.getCpf());
		assertEquals("Brasileira", dep01.getNacionalidade());
		assertEquals(false, dep01.isPcd());
		assertEquals(23, dep01.getId().intValue());
		assertEquals(5515, dep01.getIdColaborador().intValue());
		assertEquals("Filho(a)", dep01.getTipoDependente());
		assertEquals(true, dep01.isOptanteIR());
	}

}
