package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import enums.EMDadosGeograficos.Cidades;
import enums.EMDadosGeograficos.Pais;
import enums.EMDadosGeograficos.UF;
import model.Endereco;

public class EnderecoTest {

	Endereco enderecoSemComplemento = new Endereco("Sítio Côrrego de Santo Antônio", 10, "Côrrego de Santo Antonio",
			Cidades.FLORIANOPOLIS, UF.SC, "28666971", Pais.BRASIl);

	Endereco enderecoCompleto = new Endereco("Rua José Delepranni, s/n", null, "Alto Caldeirão", Cidades.PORTO_ALEGRE,
			UF.RS, "Casa", "29656980", Pais.BRASIl);

	

	@Test
	public void testeEnderecoSemComplemento() {
		assertEquals("Sítio Côrrego de Santo Antônio", enderecoSemComplemento.getLogradouro());
		assertEquals(10, enderecoSemComplemento.getNumero().intValue());
		assertEquals("Côrrego de Santo Antonio", enderecoSemComplemento.getBairro());
		assertEquals(Cidades.FLORIANOPOLIS, enderecoSemComplemento.getCidade());
		assertEquals(UF.SC, enderecoSemComplemento.getUf());
		assertEquals("28666971", enderecoSemComplemento.getCep());
		assertEquals(Pais.BRASIl, enderecoSemComplemento.getPais());
	}

	@Test
	public void testeEnderecoCompleto() {
		assertEquals("Rua José Delepranni, s/n", enderecoCompleto.getLogradouro());
		assertEquals(null, enderecoCompleto.getNumero());
		assertEquals("Alto Caldeirão", enderecoCompleto.getBairro());
		assertEquals(Cidades.PORTO_ALEGRE, enderecoCompleto.getCidade());
		assertEquals(UF.RS, enderecoCompleto.getUf());
		assertEquals("Casa", enderecoCompleto.getComplemento());
		assertEquals("29656980", enderecoCompleto.getCep());
		assertEquals(Pais.BRASIl, enderecoCompleto.getPais());
	}
}
