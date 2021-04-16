package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDate;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.Empresa;
import br.com.proway.senior.godevcadastro.cadastro.Endereco;

public class EmpresaTest {
	Endereco endereco = new Endereco("Rua XV", 51, "Centro", "blumenau", "SC", "12312312312", "brasil");
	Empresa empresa = new Empresa(1000001L, "Empresa Teste", LocalDate.of(2021, 04, 17), "88.888.888/0001-88", endereco);
	
	@Test
	public void testConstrutorEmpresa() {
		assertEquals(LocalDate.of(2021, 04, 17), empresa.getDataInicioContrato());
		assertEquals("88.888.888/0001-88", empresa.getCnpj());
		assertEquals(1000001L, empresa.getEmpresaId());
		assertEquals("Empresa Teste", empresa.getNomeEmpresa());
		assertNotEquals("Rua XX", empresa.getEndereco().getLogradouro());
	}
	
//	@Test
//	public void testCnpjDaEmpresa() {
//		String result = "88.888.888/0001-88";
//		assertEquals(result, empresa.getCnpj());
//	}
//
//	@Test
//	public void testNomeDaEmpresa() {
//		String result = "Empresa Teste";
//		assertEquals(result, empresa.getNomeEmpresa());
//	}
//	
//	@Test
//	public void testEmpresaID() {
//		long result = 1000001L;
//		assertEquals(result, empresa.getEmpresaId());
//	}
	
	
}
