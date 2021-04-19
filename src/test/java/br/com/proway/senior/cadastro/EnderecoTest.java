package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;

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
		assertEquals("Barra Alegre", enderecoSemComplemento.getCidade());
		assertEquals("rj", enderecoSemComplemento.getUf());
		assertEquals("28666971", enderecoSemComplemento.getCep());
		assertEquals("Brasil", enderecoSemComplemento.getPais());
	}

	@Test
	public void testeEnderecoCompleto() {
		assertEquals("Rua José Delepranni, s/n", enderecoCompleto.getLogradouro());
		assertEquals(null, enderecoCompleto.getNumero());
		assertEquals("Alto Caldeirão", enderecoCompleto.getBairro());
		assertEquals("Alto Caldeirão", enderecoCompleto.getCidade());
		assertEquals("es", enderecoCompleto.getUf());
		assertEquals("Casa", enderecoCompleto.getComplemento());
		assertEquals("29656980", enderecoCompleto.getCep());
		assertEquals("Brasil", enderecoCompleto.getPais());
	}

}
