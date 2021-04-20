package br.com.proway.senior.cadastro;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.dependente.Dependente;
import br.com.proway.senior.godevcadastro.cadastro.dependente.TiposDependentes;
import br.com.proway.senior.godevcadastro.cadastro.enums.Nacionalidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.SexoPessoa;

public class DependenteTest {
	Dependente dep01 = new Dependente("Paulo", "Levi",
			LocalDate.of(2007, 5, 12), null, "Masculino",
			SexoPessoa.MASCULINO, "Daniela Alves","00012345678", Nacionalidades.BRASILEIRA,
			false, 23, 5515, TiposDependentes.TIPO_FILHO, true);
	Dependente dep02 = new Dependente("Marcos", "Jo�o",
			LocalDate.of(2005, 2, 3), null, "Feminino",
			SexoPessoa.FEMININO, "Marcela Alves","00452345678", Nacionalidades.BRASILEIRA,
			false, 22, 555, TiposDependentes.TIPO_CONJUGE, true);
	
	@Test
	public void testConstrutorDependente() {
		assertEquals("Paulo", dep01.getNome());
		assertEquals("Levi", dep01.getSobrenome());
		assertEquals(LocalDate.of(2007, 5, 12), dep01.getDataDeNascimento());
		assertEquals(null, dep01.getNomeSocial());
		assertEquals("Masculino", dep01.getGenero());
		assertEquals(SexoPessoa.MASCULINO, dep01.getSexo());
		assertEquals("Daniela Alves", dep01.getNomeDaMae());
		assertEquals("00012345678", dep01.getCpf());
		assertEquals(Nacionalidades.BRASILEIRA, dep01.getNacionalidade());
		assertEquals(false, dep01.isPcd());
		assertEquals(23, dep01.getId().intValue());
		assertEquals(5515, dep01.getIdColaborador().intValue());
		assertEquals(TiposDependentes.TIPO_FILHO, dep01.getTipoDependente());
		assertEquals(true, dep01.isOptanteIR());
	}
	
	@Test
	public void testCreateDependente() {
		ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
		Dependente.createDependente(dependentes, dep01);
		assertEquals(dependentes.get(0), dep01);
		assertEquals(dependentes.size(), 1);
	}
	
	@Ignore
	@Test
	public void testReadDependente() {
		ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
		Dependente.createDependente(dependentes, dep01);
		Dependente.readDependente(dependentes);
	}
	
	@Test
	public void testUpdateDependente() {
		ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
		dependentes.add(dep01);
		Dependente.updateDependente(dependentes, dep01, dep02);
		assertEquals(dependentes.get(0), dep02);
		assertFalse(dependentes.contains(dep01));
	}
	
	@Test
	public void testDeleteDependente() {
		ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
		dependentes.add(dep01);
		Dependente.deleteDependente(dependentes, dep01);
		assertEquals(dependentes.size(), 0);
	}
}
