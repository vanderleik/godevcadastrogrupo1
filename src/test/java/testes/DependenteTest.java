package testes;

import java.time.LocalDate;
import org.junit.Test;
import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosPessoais.IdentidadeGenero;
import enums.EMDadosPessoais.TiposDependentes;
import model.Dependente;

public class DependenteTest {
	
	@Test
	public void testeDependenteBuilder() {
		Dependente dependente = new Dependente.DependenteBuilder().nome("José").
				sobrenome("Bezerra").dataDeNascimento(LocalDate.of(1986, 4, 23)).
				genero("Masculino").identidadeGenero(IdentidadeGenero.CIS).nomeDaMae("Lúcia").
				cpf("02154785488").nacionalidade(Nacionalidade.BRASILEIRA).pcd(false).
				idDependente(456).idColaborador(78).tipoDependentes(TiposDependentes.CONJUGE).
				optanteIR(true).criarDependente();
		System.out.println(dependente.toString());			
	}
}
