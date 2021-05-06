package testes;

import java.time.LocalDate;
import org.junit.Test;
import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosPessoais.IdentidadeGenero;
import model.Contatos;
import model.PrestadorServico;

public class PrestadorServicoTest {
	
	@Test
	public void testePrestadorServicoBuilder() {
		PrestadorServico prestadorServico = new PrestadorServico.PrestadorServicoBuilder().nome("Luana").sobrenome("Silva").dataDeNascimento(LocalDate.of(2002, 05, 21)).genero("Feminino")
				.identidadeGenero(IdentidadeGenero.TRANS).nomeDaMae("Ana Catarina").cpf("15284852032").nacionalidade(Nacionalidade.BRASILEIRA).
				pcd(false).idPrestadorServico(123).dataInicioContrato(LocalDate.of(2017, 02, 04)).idEmpresa(145).idSetor(35).contatos(new Contatos()).criarPrestadorServico();
		
		System.out.println(prestadorServico.toString());
	}
}