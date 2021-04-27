package testes;

import java.time.LocalDate;
import org.junit.Test;
import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosPessoais.SexoPessoa;
import model.Pessoa;

public class PessoaTest {
	
	@Test
	public void testeBuilder() {
		Pessoa pessoa = new Pessoa.PessoaBuilder().nome("José").
				sobrenome("Bezerra").dataDeNascimento(LocalDate.of(1986, 4, 23)).
				genero("Masculino").sexo(SexoPessoa.CIS).nomeDaMae("Lúcia").
				cpf("02154785488").nacionalidade(Nacionalidade.BRASILEIRA).pcd(false).criarPessoa();
		System.out.println(pessoa.toString());
		
	}
}