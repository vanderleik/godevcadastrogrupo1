package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import controller.GenericCrudController;
import model.Pessoa;

public class GenericCrudControllerTest {

	@Test
	public void testCadastrar() {
		GenericCrudController generic = new GenericCrudController();
		Pessoa pessoa = new Pessoa();
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		generic.cadastrar(pessoas, pessoa);
		assertTrue(pessoas.get(0)==pessoa);
	}
	@Test
	public void testListaArray() {
		GenericCrudController generic = new GenericCrudController();
		Pessoa pessoa = new Pessoa();
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(pessoa);


		assertEquals("Pessoa [nome=null, sobrenome=null, dataDeNascimento=null, nomeSocial=null, "
				+ "genero=null, sexo=null, nomeDaMae=null, cpf=null, nacionalidade=null, pcd=false]",generic.listar(pessoas, pessoa));
	}

	@Test
	public void testListaTodoArray() {
		GenericCrudController generic = new GenericCrudController();
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoa2.setNome("Maria");
		pessoas.add(pessoa);
		pessoas.add(pessoa2);
		
		assertEquals("[Pessoa [nome=null, sobrenome=null, dataDeNascimento=null, "
				+ "nomeSocial=null, genero=null, sexo=null, nomeDaMae=null, cpf=null, "
				+ "nacionalidade=null, pcd=false], Pessoa [nome=Maria, sobrenome=null, "
				+ "dataDeNascimento=null, nomeSocial=null, genero=null, sexo=null, nomeDaMae=null, "
				+ "cpf=null, nacionalidade=null, pcd=false]]" , generic.listarTudo(pessoas));
	}
	
	@Test
	
	public void testDeletaObjetoDoArray() {
		GenericCrudController generic = new GenericCrudController();
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoa2.setNome("Maria");
		pessoas.add(pessoa);
		pessoas.add(pessoa2);
		generic.delete(pessoas, pessoa);
		
		assertTrue(pessoas.get(0).getNome()=="Maria");
	}
	
	@Test
	
	public void testAtualizaObjetoDoArray() {
		GenericCrudController generic = new GenericCrudController();
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoa2.setNome("Maria");
		pessoas.add(pessoa);
		generic.atualizar(pessoas, pessoa2, pessoa);
		
		assertTrue(pessoas.get(0).getNome()== "Maria");
	}
	
}

















