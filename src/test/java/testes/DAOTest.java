package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dao.PessoaDAO;
import model.Pessoa;

public class DAOTest {

	Pessoa p1 = new Pessoa();
	Pessoa p2 = new Pessoa();
	
	@Test
	public void testCadastrarPessoa() {
		p1.setNome("Marcos");
		p2.setNome("João");
		PessoaDAO dao = new PessoaDAO();
		dao.cadastrar(p1);
		assertEquals(dao.itens.get(0), p1);
	}
	
	@Test
	public void testeListar() {
		p1.setNome("Marcos");
		p2.setNome("João");
		PessoaDAO dao = new PessoaDAO();
		dao.itens.add(p1);
		assertEquals(dao.listar(p1), p1);
	}
	
	@Test
	public void testeListarTudo() {
		p1.setNome("Marcos");
		p2.setNome("João");
		PessoaDAO dao = new PessoaDAO();
		dao.itens.add(p1);
		dao.itens.add(p2);
		ArrayList<Pessoa> arrayTeste = new ArrayList();
		arrayTeste.add(p1);
		arrayTeste.add(p2);
		assertEquals(dao.listarTudo(), arrayTeste);
		arrayTeste.remove(0);
	}
	
	@Test
	public void testDeletarPessoa() {
		p1.setNome("Marcos");
		p2.setNome("João");
		PessoaDAO dao = new PessoaDAO();
		dao.itens.add(p1);
		dao.delete(p1);
		assertEquals(dao.itens.size(), 0);
	}

	@Test
	public void testAtualizarPessoa() {
		p1.setNome("Marcos");
		p2.setNome("João");
		PessoaDAO dao = new PessoaDAO();
		dao.itens.add(p1);
		dao.atualizar(p2, p1);
		assertEquals(dao.itens.get(0), p2);
	}
}
