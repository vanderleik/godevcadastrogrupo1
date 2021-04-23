package br.com.proway.senior.cadastro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import controller.ColaboradorController;
import controller.PessoaController;
import enums.Cidades;
import enums.Nacionalidades;
import enums.Paises;
import enums.SexoPessoa;
import enums.TiposExame;
import enums.UnidadesFederativas;
import model.Colaborador;
import model.Contatos;
import model.Documentos;
import model.Endereco;
import model.ExameMedico;
import model.Pessoa;

public class ColaboradorTest {
//
//	String nome = "Maria";
//	String sobrenome = "Silva";
//	static LocalDate dataDeNascimento = LocalDate.of(1994, 05, 9);
//	String genero = "Cisgênero";
//	SexoPessoa sexo = SexoPessoa.FEMININO;
//	String nomeDaMae = "Dulce";
//	String cpf = "99599988826";
//	Nacionalidades nacionalidade = Nacionalidades.BRASILEIRA;
//	Integer idColaborador = 5528;
//	Integer numCargo = 0456;
//	Integer nit = 1000089300;
//	boolean optanteVT = false;
//	boolean optanteVAVR = true;
//	boolean pcd = false;
//	LocalDate dataAdmissao = LocalDate.of(2021, 04, 06);
//	boolean optanteDependente = false;
//	Documentos documentos = new Documentos(88999, 108, LocalDate.of(2020, 9, 15), "Banco do Brasil",
//			0404, 88888, 80809090, 1080, 808, 808080, "SSP", LocalDate.of(2015, 10, 02));
//	Cidades cidadeNasc = Cidades.BLUMENAU;
//	UnidadesFederativas ufNasc = UnidadesFederativas.SC;
//	Paises paisNasc = Paises.BRASIl;
//	Cidades cidadeEnd = Cidades.BLUMENAU;
//	UnidadesFederativas ufEnd = UnidadesFederativas.SC;
//	Paises paisEnd = Paises.BRASIl;
//	Endereco endereco = new Endereco("Rua 10", 25, "Centro", cidadeEnd, ufEnd, "89030180", paisEnd);
//	Contatos contatos = new Contatos("47999368888", "maria@gmail.com");
//	TiposExame tipo = TiposExame.EXAME_PERIODICO;
//	ExameMedico exameMedico = new ExameMedico(tipo, LocalDate.of(2021, 05, 15), true);
//	
//	String nome2 = "José";
//	String sobrenome2 = "Silva";
//	static LocalDate dataDeNascimento2 = LocalDate.of(1988, 05, 9);
//	String genero2 = "Masculino";
//	SexoPessoa sexo2 = SexoPessoa.MASCULINO;
//	String nomeDaMae2 = "Dulce";
//	String cpf2 = "12345678966";
//	Nacionalidades nacionalidade2 = Nacionalidades.BRASILEIRA;
//	Integer idColaborador2 = 5599;
//	Integer numCargo2 = 0456;
//	Integer nit2 = 100015600;
//	boolean optanteVT2 = true;
//	boolean optanteVAVR2 = false;
//	boolean pcd2 = true;
//	LocalDate dataAdmissao2 = LocalDate.of(2021, 01, 06);
//	boolean optanteDependente2 = false;
//	Documentos documentos2 = new Documentos(513, 222, LocalDate.of(2020, 9, 15), "Banco do Brasil",
//			0404,7777, 77885566, 1080, 808, 808080, "SSP", LocalDate.of(2015, 10, 02));
//	Cidades cidadeNasc2 = Cidades.BAGE;
//	UnidadesFederativas ufNasc2 = UnidadesFederativas.RS;
//	Paises paisNasc2 = Paises.BRASIl;
//	Cidades cidadeEnd2 = Cidades.BLUMENAU;
//	UnidadesFederativas ufEnd2 = UnidadesFederativas.SC;
//	Paises paisEnd2 = Paises.BRASIl;
//	Endereco endereco2 = new Endereco("Quadra 10", 25, "Centro", cidadeEnd, ufEnd, "89030180", paisEnd);
//	Contatos contatos2 = new Contatos("77788855523", "josé@gmail.com");
//	TiposExame tipo2 = TiposExame.EXAME_ADMISSIONAL;
//	ExameMedico exameMedico2 = new ExameMedico(tipo, LocalDate.of(2021, 02, 15), true);
//	
//	Colaborador colaborador1 = new Colaborador(nome, sobrenome, dataDeNascimento, null, genero, sexo, nomeDaMae, 
//			cpf, nacionalidade, pcd, idColaborador, numCargo, nit, optanteVT, optanteVAVR, dataAdmissao, 
//			optanteDependente, cidadeNasc, ufNasc, paisNasc, documentos, endereco, contatos, exameMedico);
//	
//	Colaborador colaborador2 = new Colaborador(nome2, sobrenome2, dataDeNascimento2, null, genero2, sexo2, nomeDaMae2, 
//			cpf2, nacionalidade2, pcd2, idColaborador2, numCargo2, nit2, optanteVT2, optanteVAVR2, dataAdmissao2, 
//			optanteDependente2, cidadeNasc2, ufNasc2, paisNasc2, documentos2, endereco2, contatos2, exameMedico2);
//	
//	@Test
//	public void testConstrutorColaborador() {
//		assertEquals(nome, colaborador1.getNome());
//		assertEquals(sobrenome, colaborador1.getSobrenome());
//		assertEquals(dataDeNascimento, colaborador1.getDataDeNascimento());
//		assertEquals(genero, colaborador1.getGenero());
//		assertEquals(sexo, colaborador1.getSexo());
//		assertEquals(nomeDaMae, colaborador1.getNomeDaMae());
//		assertEquals(cpf, colaborador1.getCpf());
//		assertEquals(nacionalidade, colaborador1.getNacionalidade());
//		assertEquals(pcd, colaborador1.isPcd());
//		assertEquals(numCargo, colaborador1.getNumCargo());
//		assertEquals(nit, colaborador1.getNit());
//		assertEquals(optanteVT, colaborador1.isOptanteVT());
//		assertEquals(optanteVAVR, colaborador1.isOptanteVAVR());
//		assertEquals(dataAdmissao, colaborador1.getDataAdmissao());
//		assertEquals(optanteDependente, colaborador1.isOptanteDependente());
//		assertEquals(cidadeNasc, colaborador1.getCidadeNascimento());
//		assertEquals(ufNasc, colaborador1.getUfNascimento());
//		assertEquals(paisNasc, colaborador1.getPaisNascimento());
//		assertEquals("Rua 10", colaborador1.getEndereco().getLogradouro());
//		assertEquals(25, colaborador1.getEndereco().getNumero().intValue());
//		assertEquals(88999, colaborador1.getDocumentos().getCtpsNumero());
//		assertEquals(cidadeEnd, colaborador1.getEndereco().getCidade());
//		assertEquals(ufEnd, colaborador1.getEndereco().getUf());		
//		assertEquals("SSP", colaborador1.getDocumentos().getOrgaoEmissorRG());
//		assertEquals("47999368888", colaborador1.getContatos().getTelefonePrincipal());
//		assertEquals("maria@gmail.com", colaborador1.getContatos().getEmail());
//		assertEquals(true, colaborador1.getExameMedico().isApto());
//		assertEquals(LocalDate.of(2021, 05, 15), colaborador1.getExameMedico().getDataExame());
//		
//	}
//	
//	ArrayList<Colaborador> listaColaboradores = new ArrayList<Colaborador>();
//	
//	@Test
//	public void testCadastrarColaborador() {
//		Colaborador.cadastrarColaborador(listaColaboradores, colaborador1);
//		Colaborador.cadastrarColaborador(listaColaboradores, colaborador2);
//		assertTrue(listaColaboradores.indexOf(colaborador1)>=0);
//		assertTrue(listaColaboradores.indexOf(colaborador2)>=0);
//		
//	}
//	
//	@Test
//	public void testCadastrarColaboradorErrado() {
//		Colaborador.cadastrarColaborador(listaColaboradores, colaborador1);
//		assertFalse(listaColaboradores.indexOf(colaborador1)<0);
//	}
//	
//	@Ignore
//	@Test
//	public void testListarTodosColaboradores() {
//		Colaborador.cadastrarColaborador(listaColaboradores, colaborador1);
//		Colaborador.cadastrarColaborador(listaColaboradores, colaborador2);
//		Colaborador.listarTodosColaboradores(listaColaboradores);
//		assertEquals(Cidades.BAGE, Colaborador.listarTodosColaboradores(listaColaboradores).get(1).getCidadeNascimento());
//		assertEquals("Banco do Brasil", Colaborador.listarTodosColaboradores(listaColaboradores).get(0).getDocumentos().getBancoNome());
//		
//	}
//
//	@Ignore
//	@Test
//	public void testListarPorCodigo() {
//		Colaborador.cadastrarColaborador(listaColaboradores, colaborador1);
//		Colaborador.cadastrarColaborador(listaColaboradores, colaborador2);
//		Colaborador.listarColaboradorCodigo(listaColaboradores, colaborador1);
//		Colaborador.listarColaboradorCodigo(listaColaboradores, colaborador2);
//		assertEquals("12345678966", Colaborador.listarColaboradorCodigo(listaColaboradores, colaborador2).get(1).getCpf());
//		assertEquals("Rua 10", Colaborador.listarColaboradorCodigo(listaColaboradores, colaborador1).get(0).getEndereco().getLogradouro());
//	}
//	
//	@Test
//	public void testAtualizarColaborador() {
//		Colaborador.cadastrarColaborador(listaColaboradores, colaborador2);
//		Colaborador.atualizarColaborador(listaColaboradores, colaborador1, colaborador2);
//		assertNotEquals("Colaborador [idColaborador=5599, numCargo=302, nit=100015600, optanteVT=true, optanteVAVR=false, dataAdmissao=2021-01-06, optanteDependente=false, "
//				+ "cidadeNascimento=BAGE, UfNascimento=RS, paisNascimento=BRASIl, documentos=Documentos [ctpsNumero=513, ctpsSerie=222, dataEmissaoCTPS=2020-09-15, bancoNome=Banco "
//				+ "do Brasil, bancoAgencia=260, bancoNumeroConta=7777, tituloNumero=77885566, tituloZona=1080, tituloSecao=808, raNumero=0, rgNumero=808080, orgaoEmissorRG=SSP, dataEmissaoRG=2015-10-02], "
//				+ "endereco=Endereco [logradouro=Quadra 10, numero=25, bairro=Centro, cidade=BLUMENAU, uf=SC, complemento=null, cep=89030180, pais=BRASIl], contatos=Contatos [telefonePrincipal=77788855523, "
//				+ "telefoneSecundario=null, email=josé@gmail.com], exameMedico=ExameMedico [tipoExame=EXAME_PERIODICO, dataExame=2021-02-15, apto=true, escolha=0]]", listaColaboradores.get(0).toString());
//	}
//	
//	@Test
//	public void testDeletarColaborador() {
//		Colaborador.cadastrarColaborador(listaColaboradores, colaborador1);
//		Colaborador.cadastrarColaborador(listaColaboradores, colaborador2);
//		Colaborador.deletarColaborador(listaColaboradores, colaborador2);
//		assertTrue(listaColaboradores.size() == 1);
//	}

	@Test
	public void validarDataContrato() {

		Colaborador p = new Colaborador();
		Colaborador p2 = new Colaborador();
		Colaborador p3 = new Colaborador();

		ColaboradorController colaboradorController = new ColaboradorController();
		ColaboradorController colaboradorController2 = new ColaboradorController();
		ColaboradorController colaboradorController3= new ColaboradorController();

		p.setDataDeNascimento(LocalDate.of(2002, 01, 28));
		p2.setDataDeNascimento(LocalDate.of(2020, 02, 28));
		p3.setDataDeNascimento(LocalDate.of(1500, 01, 28));

		assertTrue(colaboradorController.validaDataDeContrato(p));
		assertFalse(colaboradorController2.validaDataDeContrato(p2));
		assertFalse(colaboradorController3.validaDataDeContrato(p3));

	}
	
}
