package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.contatos.Contatos;
import br.com.proway.senior.godevcadastro.cadastro.prestadorservico.PrestadorServico;

public class PrestadorServicoTest {

	Contatos contatos = new Contatos("4798653726", "4799887766", "steven@gmail.com");
	
	PrestadorServico prestServicoCompleto = new PrestadorServico("Steven", "Jobs", LocalDate.of(1955, 2, 24),
			"Steal", "Bissexual", 'm', "Reed Jobs", "18287498007", "americano", false, 123456,
			LocalDate.of(2018, 7, 9), 5, 7,	contatos);
	
	
	@Test
	public void testPrestadorDeServicosCompleto() {
		assertEquals("Steven", prestServicoCompleto.getNome());
		assertEquals("Jobs", prestServicoCompleto.getSobrenome());
		assertEquals(LocalDate.of(1955, 2, 24), prestServicoCompleto.getDataDeNascimento());
		assertEquals("Steal", prestServicoCompleto.getNomeSocial());
		assertEquals("Bissexual", prestServicoCompleto.getGenero());
		assertEquals('m', prestServicoCompleto.getSexo());
		assertEquals("Reed Jobs", prestServicoCompleto.getNomeDaMae());
		assertEquals("18287498007", prestServicoCompleto.getCpf());
		assertEquals("americano", prestServicoCompleto.getNacionalidade());
		assertEquals(123456, prestServicoCompleto.getIdPrestadorServico());
		assertEquals(LocalDate.of(2018, 7, 9), prestServicoCompleto.getDataInicioContrato());
		assertEquals(5, prestServicoCompleto.getIdEmpresa());
		assertEquals(7, prestServicoCompleto.getIdSetor());
		assertEquals("4798653726", prestServicoCompleto.getContatos().getTelefonePrincipal());
		assertEquals("4799887766", prestServicoCompleto.getContatos().getTelefoneSecundario());
		assertEquals("steven@gmail.com", prestServicoCompleto.getContatos().getEmail());
	}
}
