package testes;

import java.time.LocalDate;
import org.junit.Test;
import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosPessoais.IdentidadeGenero;
import model.Pessoa;

public class PessoaTest {
	
	@Test
	public void testeBuilder() {
		Pessoa pessoa = new Pessoa.PessoaBuilder().nome("Jos�").
				sobrenome("Bezerra").dataDeNascimento(LocalDate.of(1986, 4, 23)).
				genero("Masculino").identidadeGenero(IdentidadeGenero.CIS).nomeDaMae("L�cia").
				cpf("02154785488").nacionalidade(Nacionalidade.BRASILEIRA).pcd(false).criarPessoa();
		System.out.println(pessoa.toString());
		
	}
}