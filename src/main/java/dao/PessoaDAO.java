package dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;

import controller.DataParser;
import controller.JdbcController;
import model.Pessoa;

public class PessoaDAO extends DaoFactory<Pessoa>{
	
	public boolean cadastrar(Pessoa item) {
		JdbcController control = JdbcController.getInstance();
		try {
			control.executarQuerySemArg("INSERT INTO " + JdbcController.schema + "pessoa"
					+ "(nome, sobrenome, nome_social, data_nascimento, nacionalidade, naturalidade, nome_completo_mae, nome_completo_pai, pcd, genero_id, identidade_genero_id, endereco_id, telefone_id, cpf)" 
					+ "values("
					+ item.getNome() + "," + item.getSobrenome() + ","
				    + item.getNomeSocial() + ","+ DataParser.localDateToSQLQuery(item.getDataDeNascimento()) 
					+ "," + item.getNacionalidade() +"," + item.getNaturalidade() + "," + item.getNomeDaMae() +"," 
					+ item.getNomeDoPai() + "," + item.getPcd() +"," + item.getGeneroId() +"," + item.getIdentidadeGeneroId() 
					+"," + item.getEnderecoId() +"," + item.getTelefoneId() +"," + item.getCpf() +")");
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public Pessoa listar(int id) {
		JdbcController control = JdbcController.getInstance();

		Pessoa output = new Pessoa();

		try {
			ResultSet pessoa = control.buscarPorId("pessoa", id);
			
			if (pessoa.next()) {
				
			String nome = pessoa.getString("nome");
			String sobrenome = pessoa.getString("sobreome");
			String nome_social = pessoa.getString("nome_social");
			LocalDate data_nascimento = DataParser.sqlDateToLocalDate(pessoa.getDate("data_nascimento"));
			String nacionalidade = pessoa.getString("nacionalidade");
			String naturalidade = pessoa.getString("naturalidade");
			String nome_completo_mae = pessoa.getString("nome_completo_mae");
			String nome_completo_pai = pessoa.getString("nome_completo_pai");
			String pcd = pessoa.getString("pcd");
			Integer generoId  = pessoa.getInt("genero_id");
			Integer identidade_generoId  = pessoa.getInt("genero_id");
			Integer enderecoId  = pessoa.getInt("endereco_id");
			Integer telefoneId  = pessoa.getInt("telefone_id");
			
			output.setNome(nome);
			output.setSobrenome(sobrenome);
			output.setNomeSocial(nome_social);
			output.setDataDeNascimento(data_nascimento);
			output.setNacionalidade(nacionalidade);
			output.setNaturalidade(naturalidade);
			output.setNomeDaMae(nome_completo_mae);
			output.setNomeDoPai(nome_completo_pai);
			output.setPcd(pcd);
			output.setGeneroId(identidade_generoId);
			output.setIdentidadeGeneroId(generoId);
			output.setEnderecoId(enderecoId);
			output.setTelefoneId(telefoneId);
			output.setGeneroId(generoId);
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	}

}
