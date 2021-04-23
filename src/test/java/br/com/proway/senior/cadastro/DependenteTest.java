package br.com.proway.senior.cadastro;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import enums.Nacionalidades;
import enums.SexoPessoa;
import enums.TiposDependentes;
import model.Dependente;

public class DependenteTest {
	Dependente dependente1 = new Dependente("Paulo", "Levi",
			LocalDate.of(2007, 5, 12), null, "Masculino",
			SexoPessoa.MASCULINO, "Daniela Alves","00012345678", Nacionalidades.BRASILEIRA,
			false, 23, 5515, TiposDependentes.TIPO_FILHO, true);
	Dependente dependente2 = new Dependente("Marcos", "João",
			LocalDate.of(2005, 2, 3), null, "Feminino",
			SexoPessoa.FEMININO, "Marcela Alves","00452345678", Nacionalidades.BRASILEIRA,
			false, 22, 555, TiposDependentes.TIPO_CONJUGE, true);
	
	@Test
	public void testConstrutorDependente() {
		assertEquals("Paulo", dependente1.getNome());
		assertEquals("Levi", dependente1.getSobrenome());
		assertEquals(LocalDate.of(2007, 5, 12), dependente1.getDataDeNascimento());
		assertEquals(null, dependente1.getNomeSocial());
		assertEquals("Masculino", dependente1.getGenero());
		assertEquals(SexoPessoa.MASCULINO, dependente1.getSexo());
		assertEquals("Daniela Alves", dependente1.getNomeDaMae());
		assertEquals("00012345678", dependente1.getCpf());
		assertEquals(Nacionalidades.BRASILEIRA, dependente1.getNacionalidade());
		assertEquals(false, dependente1.isPcd());
		assertEquals(23, dependente1.getId().intValue());
		assertEquals(5515, dependente1.getIdColaborador().intValue());
		assertEquals(TiposDependentes.TIPO_FILHO, dependente1.getTipoDependente());
		assertEquals(true, dependente1.isOptanteIR());
	}
	
	@Test
	public void testCadastrarDependente() {
		ArrayList<Dependente> listaDependentes = new ArrayList<Dependente>();
		Dependente.cadastrarDependente(listaDependentes, dependente1);
		assertEquals(listaDependentes.get(0), dependente1);
		assertEquals(listaDependentes.size(), 1);
	}
	
	@Ignore
	@Test
	public void testListarDependente() {
		ArrayList<Dependente> listaDependentes = new ArrayList<Dependente>();
		Dependente.cadastrarDependente(listaDependentes, dependente1);
		Dependente.listarDependentes(listaDependentes);
	}
	
	@Test
	public void testAtualizarDependente() {
		ArrayList<Dependente> listaDependentes = new ArrayList<Dependente>();
		listaDependentes.add(dependente1);
		Dependente.atualizarDependente(listaDependentes, dependente1, dependente2);
		assertEquals(listaDependentes.get(0), dependente2);
		assertFalse(listaDependentes.contains(dependente1));
	}
	
	@Test
	public void testDeletarDependente() {
		ArrayList<Dependente> listaDependentes = new ArrayList<Dependente>();
		listaDependentes.add(dependente1);
		Dependente.deletarDependente(listaDependentes, dependente1);
		assertEquals(listaDependentes.size(), 0);
	}
}
