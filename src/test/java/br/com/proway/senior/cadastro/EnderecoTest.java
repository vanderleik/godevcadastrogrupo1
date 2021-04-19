package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.endereco.Endereco;
import br.com.proway.senior.godevcadastro.cadastro.enums.Cidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.Paises;
import br.com.proway.senior.godevcadastro.cadastro.enums.UnidadesFederativas;

public class EnderecoTest {

	Endereco enderecoSemComplemento = new Endereco("Sítio Côrrego de Santo Antônio", 10, "Côrrego de Santo Antonio",
			Cidades.FLORIANOPOLIS, UnidadesFederativas.SC, "28666971", Paises.BRASIl);

	Endereco enderecoCompleto = new Endereco("Rua José Delepranni, s/n", null, "Alto Caldeirão", Cidades.PORTO_ALEGRE,
			UnidadesFederativas.RS, "Casa", "29656980", Paises.BRASIl);

	

	@Test
	public void testeEnderecoSemComplemento() {
		assertEquals("Sítio Côrrego de Santo Antônio", enderecoSemComplemento.getLogradouro());
		assertEquals(10, enderecoSemComplemento.getNumero().intValue());
		assertEquals("Côrrego de Santo Antonio", enderecoSemComplemento.getBairro());
		assertEquals(Cidades.FLORIANOPOLIS, enderecoSemComplemento.getCidade());
		assertEquals(UnidadesFederativas.SC, enderecoSemComplemento.getUf());
		assertEquals("28666971", enderecoSemComplemento.getCep());
		assertEquals(Paises.BRASIl, enderecoSemComplemento.getPais());
	}

	@Test
	public void testeEnderecoCompleto() {
		assertEquals("Rua José Delepranni, s/n", enderecoCompleto.getLogradouro());
		assertEquals(null, enderecoCompleto.getNumero());
		assertEquals("Alto Caldeirão", enderecoCompleto.getBairro());
		assertEquals(Cidades.PORTO_ALEGRE, enderecoCompleto.getCidade());
		assertEquals(UnidadesFederativas.RS, enderecoCompleto.getUf());
		assertEquals("Casa", enderecoCompleto.getComplemento());
		assertEquals("29656980", enderecoCompleto.getCep());
		assertEquals(Paises.BRASIl, enderecoCompleto.getPais());
	}


	@Test
	public void testeCreate() {
		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		Endereco.create(enderecoSemComplemento, enderecos);
		assertTrue(enderecos.indexOf(enderecoSemComplemento) >= 0);
	}
	
	@Test
	public void testeReadOne() {
		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		enderecos.add(enderecoSemComplemento);
		assertEquals("Endereco [logradouro=Sítio Côrrego de Santo Antônio, numero=10, bairro=Côrrego de Santo Antonio, cidade=FLORIANOPOLIS, uf=SC, complemento=null, cep=28666971, pais=BRASIl]", Endereco.readOne(enderecos, enderecoSemComplemento));
	}
	
	@Test
	public void testeUpdate() {
		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		enderecos.add(enderecoSemComplemento);
		Endereco.update(enderecos, enderecoCompleto, enderecoSemComplemento);
		assertEquals(enderecoCompleto, enderecos.get(0));
		assertFalse(enderecoSemComplemento.equals(enderecos.get(0)));
	}
	
	@Test
	public void testeDelete() {
		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		enderecos.add(enderecoSemComplemento);
		Endereco.delete(enderecos, enderecoSemComplemento);
		assertTrue(enderecos.size() == 0);
	}
	
	@Test 
	public void testeFormataCEP() {
		System.out.println(Endereco.formataCEP("1008383492/:"));
		assertEquals(Endereco.formataCEP("1008383492/:"), "1008383492");
	}
	
	@Test
	public void testeValidaCEP() {
		assertTrue(Endereco.validaCEP("45112589"));
	}
}
