package testes;

import java.time.LocalDate;

import org.junit.Test;

import enums.EMDadosGeograficos.Cidades;
import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosGeograficos.Pais;
import enums.EMDadosPessoais.IdentidadeGenero;
import enums.EMDadosGeograficos.UF;
import model.Colaborador;
import model.Contatos;
import model.Documentos;
import model.Endereco;
import model.ExameMedico;

public class ColaboradorTest {
	
	@Test
	public void testeBuilderColaborador() {
		Colaborador colaborador = new Colaborador.ColaboradorBuilder().nome("Jos�").
				sobrenome("Bezerra").dataDeNascimento(LocalDate.of(1986, 4, 23)).
				genero("Masculino").identidadeGenero(IdentidadeGenero.CIS).nomeDaMae("L�cia").
				cpf("02154785488").nacionalidade(Nacionalidade.BRASILEIRA).pcd(false).
				idColaborador(2).numCargo(13).nit(20363636).optanteVT(true).optanteVAVR(true).
				dataAdmissao(LocalDate.of(2017, 5, 4)).optanteDependente(false).cidadeNascimento(Cidades.BLUMENAU).
				UfNascimento(UF.SC).paisNascimento(Pais.BRASIl).
				documentos(new Documentos()).endereco(new Endereco()).
				contatos(new Contatos()).exameMedico(new ExameMedico()).criarColaborador();
		//Realizar confer�ncia visual no console
		System.out.println(colaborador.toString());
	}
}
