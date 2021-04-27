package testes;

import java.time.LocalDate;

import org.junit.Test;

import model.Contatos;
import model.Empresa;
import model.Endereco;

public class EmpresaTest {
	
	@Test
	public void testeEmpresaBuilder() {
		Empresa empresa = new Empresa.EmpresaBuilder().empresaId(56).nomeEmpresa("Nome Ilustrativo").
				dataInicioContrato(LocalDate.of(2004, 6, 26)).cnpj("567895463214").
				endereco(new Endereco()).contato(new Contatos()).criarEmpresa();
		System.out.println(empresa.toString());
	}

}
