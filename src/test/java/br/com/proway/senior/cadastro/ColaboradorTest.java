package br.com.proway.senior.cadastro;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import br.com.proway.senior.godevcadastro.cadastro.colaborador.Colaborador;
import br.com.proway.senior.godevcadastro.cadastro.contatos.Contatos;
import br.com.proway.senior.godevcadastro.cadastro.documentos.Documentos;
import br.com.proway.senior.godevcadastro.cadastro.endereco.Endereco;
import br.com.proway.senior.godevcadastro.cadastro.enums.Cidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.Nacionalidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.Paises;
import br.com.proway.senior.godevcadastro.cadastro.enums.SexoPessoa;
import br.com.proway.senior.godevcadastro.cadastro.enums.UnidadesFederativas;
import br.com.proway.senior.godevcadastro.cadastro.examemedico.ExameMedico;
import br.com.proway.senior.godevcadastro.cadastro.examemedico.TiposExame;

public class ColaboradorTest {

	String nome = "Maria";
	String sobrenome = "Silva";
	static LocalDate dataDeNascimento = LocalDate.of(1994, 05, 9);
	String genero = "Cisgênero";
	SexoPessoa sexo = SexoPessoa.FEMININO;
	String nomeDaMae = "Dulce";
	String cpf = "99599988826";
	Nacionalidades nacionalidade = Nacionalidades.BRASILEIRA;
	Integer idColaborador = 5528;
	Integer numCargo = 0456;
	Integer nit = 1000089300;
	boolean optanteVT = false;
	boolean optanteVAVR = true;
	boolean pcd = false;
	LocalDate dataAdmissao = LocalDate.of(2021, 04, 06);
	boolean optanteDependente = false;
	Documentos documentos = new Documentos(88999, 108, LocalDate.of(2020, 9, 15), "Banco do Brasil",
			0404, 88888, 80809090, 1080, 808, 808080, "SSP", LocalDate.of(2015, 10, 02));
	Cidades cidadeNasc = Cidades.BLUMENAU;
	UnidadesFederativas ufNasc = UnidadesFederativas.SC;
	Paises paisNasc = Paises.BRASIl;
	Cidades cidadeEnd = Cidades.BLUMENAU;
	UnidadesFederativas ufEnd = UnidadesFederativas.SC;
	Paises paisEnd = Paises.BRASIl;
	Endereco endereco = new Endereco("Rua 10", 25, "Centro", cidadeEnd, ufEnd, "89030180", paisEnd);
	Contatos contatos = new Contatos("47999368888", "maria@gmail.com");
	TiposExame tipo = TiposExame.EXAME_PERIODICO;
	ExameMedico exameMedico = new ExameMedico(tipo, LocalDate.of(2021, 05, 15), true);
	
	Colaborador colab = new Colaborador(nome, sobrenome, dataDeNascimento, null, genero, sexo, nomeDaMae, 
			cpf, nacionalidade, pcd, idColaborador, numCargo, nit, optanteVT, optanteVAVR, dataAdmissao, 
			optanteDependente, cidadeNasc, ufNasc, paisNasc, documentos, endereco, contatos, exameMedico);
	

	@Test
	public void testConstrutorColaborador() {
		assertEquals(nome, colab.getNome());
		assertEquals(sobrenome, colab.getSobrenome());
		assertEquals(dataDeNascimento, colab.getDataDeNascimento());
		assertEquals(genero, colab.getGenero());
		assertEquals(sexo, colab.getSexo());
		assertEquals(nomeDaMae, colab.getNomeDaMae());
		assertEquals(cpf, colab.getCpf());
		assertEquals(nacionalidade, colab.getNacionalidade());
		assertEquals(pcd, colab.isPcd());
		assertEquals(numCargo, colab.getNumCargo());
		assertEquals(nit, colab.getNit());
		assertEquals(optanteVT, colab.isOptanteVT());
		assertEquals(optanteVAVR, colab.isOptanteVAVR());
		assertEquals(dataAdmissao, colab.getDataAdmissao());
		assertEquals(optanteDependente, colab.isOptanteDependente());
		assertEquals(cidadeNasc, colab.getCidadeNascimento());
		assertEquals(ufNasc, colab.getUfNascimento());
		assertEquals(paisNasc, colab.getPaisNascimento());
		assertEquals("Rua 10", colab.getEndereco().getLogradouro());
		assertEquals(25, colab.getEndereco().getNumero().intValue());
		assertEquals(88999, colab.getDocumentos().getCtpsNumero());
		assertEquals(cidadeEnd, colab.getEndereco().getCidade());
		assertEquals(ufEnd, colab.getEndereco().getUf());		
		assertEquals("SSP", colab.getDocumentos().getOrgaoEmissorRG());
		assertEquals("47999368888", colab.getContatos().getTelefonePrincipal());
		assertEquals("maria@gmail.com", colab.getContatos().getEmail());
		assertEquals(true, colab.getExameMedico().isApto());
		assertEquals(LocalDate.of(2021, 05, 15), colab.getExameMedico().getDataExame());
		
	}
}
