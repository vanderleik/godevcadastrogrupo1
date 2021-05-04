package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public final class JdbcController {
	private static JdbcController instance;
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs = null;

	public static final String schema = "grupo1.";

	private static final String url = "jdbc:postgresql://localhost:5432/";
	private static final String database = "cadastro_colaborador";
	private static final String user = "postgres";
	private static final String pass = "admin";

	/** Singleton responsavel por se conectar e comunicar com o  banco de dados.
	 * 
	 *  Tambem possui funcoes auxiliares para interacao com banco de dados 
	 *  que devem ser chamadas pela instancia do singleton (getInstance()).
	 *  
	 *  @author Willian Kenji Nishizawa
	 */
	private JdbcController() {
		try {
			con = DriverManager.getConnection(url + database, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/** Obter a instancia do JdbcController.
	 * 
	 * @author Willian Kenji Nishizawa
	 * 
	 * @return objeto do tipo JdbcController
	 */
	public static JdbcController getInstance() {
		if (instance == null) {
			instance = new JdbcController();
		}
		return instance;
	}

	/**
	 * Retorna a conexao do JdbcController com o banco de dados.
	 * 
	 * @author Willian Kenji Nishizawa
	 * 
	 * @return Connection
	 */
	public Connection get_con() {
		return con;
	}

	/**
	 * Funcao do Singleton responsavel por executar uma query sem argumentos
	 * externos.
	 * 
	 * @author Willian Kenji Nishizawa
	 * 
	 * @param query : String com a query em SQL postgres;
	 * @return objeto ReturnSet contendo os resultados da query.
	 * 
	 */
	public ResultSet executarQuerySemArg(String query) {
		try {
			ps = con.prepareStatement(query);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * Funcao do Singleton que retorna todas as linhas da coluna 'nomeTabela' desejada.
	 * 
	 * @author Willian Kenji Nishizawa
	 * 
	 * @param nomeTabela : String que representa o nome da tabela representada no banco de dados;
	 * @return ResultSet com todas as linhas encontradas na tabela 'nomeTabela'
	 */
	public ResultSet listarPorTabela(String nomeTabela) {
		String query = "SELECT * FROM " + schema + nomeTabela;
		rs = null;
		try {
			ps = con.prepareStatement(query);
//			ps.setString(1, nomeTabela);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * Retorna a linha da tabela 'nomeTabela' que tem o PK (PrimaryKey) = 'id'
	 * 
	 * @author Willian Kenji Nishizawa
	 * 
	 * @param nomeTabela
	 * @param id : pk da linha desejada
	 * @return ResultSet com 1 ou 0 itens.
	 */

	public ResultSet buscarPorId(String nomeTabela, int id) {
		String query = "SELECT * FROM " + schema + nomeTabela + " WHERE id =" + id;
		rs = null; // Limpa resultado anterior
		try {
			ps = con.prepareStatement(query);
//			ps.setString(1, nomeTabela);
//			ps.setInt(2, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * Retorna as linhas da tabela 'nomeTabela' com valores 'id_fk' na sua coluna 'nomeFK'
	 * 
	 * @author Willian Kenji Nishizawa
	 * 
	 * @param nomeTabela : Nome da tabela na qual a busca vai ocorrer
	 * @param nomeFK  : nome da coluna onde se encontra o valor de referencia para a busca
	 * @param id_fk   : valor da coluna de referencia
	 * @return ResultSet com todas as linhas encontradas na tabela 'nomeTabela'
	 */
	public ResultSet buscarPorFK(String nomeTabela, String nomeFK, int id_fk) {
		String query = "SELECT * FROM " + schema + nomeTabela + " WHERE " + nomeFK + " =" + id_fk;
		rs = null;

		try {
			ps = con.prepareStatement(query);
//			ps.setString(1, nomeTabela);
//			ps.setString(2, nomeFK);
//			ps.setInt(3, id_fk);

			rs = ps.executeQuery();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * Deleta a linha/item da tabela 'nomeTabela' que tenha PK = id.
	 * 
	 * @author Willian Kenji Nishizawa
	 * 
	 * @param nomeTabela
	 * @param id : PrimaryKey do item a ser removido
	 * @return True/False para o sucesso da operacao.
	 */
	public boolean deletarPorId(String nomeTabela, int id) {
		String query = "DELETE FROM " + schema + nomeTabela + " WHERE id = " + id;
		try {
			ps = con.prepareStatement(query);
//			ps.setString(1, nomeTabela);
//			ps.setInt(2, id);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Na tabela 'nomeTabela' em sua coluna 'nomeColuna' vai atualizar
	 * o valor Inteiro atual para 'valorColuna'
	 * nas linhas onde a coluna 'nomeFK' tem valor 'id'
	 * 
	 * @author Willian Kenji Nishizawa
	 * 
	 * @param nomeTabela : Nome da tabela que desejamos alterar
	 * @param nomeColuna : Nome da coluna que vai ter seu valor alterado
	 * @param valorColuna : Novo valor Integer para a coluna desejada
	 * @param nomeFK : Nome da coluna de referencia (WHERE nomeFK=id)
	 * @param id : Valor esperado na coluna de referencia (WHERE nomeFK=id)
	 * @return True/False para o sucesso da operacao.
	 */
	public Boolean atualizarInteiro(String nomeTabela, String nomeColuna, int valorColuna, String nomeFK, int id) {
		String query = "UPDATE " + schema + nomeTabela + " " + "SET " + nomeColuna + " = " + valorColuna + " WHERE "
				+ nomeFK + "=" + id;

		rs = null;

		try {
			ps = con.prepareStatement(query);
//			ps.setString(1, nomeTabela);
//			ps.setString(2, nomeColuna);
//			ps.setInt(3, valorColuna);
//			ps.setString(4, nomeFK);
//			ps.setInt(5, id);

			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Na tabela 'nomeTabela' em sua coluna 'nomeColuna' vai atualizar
	 * o valor Booleano atual para 'valorColuna'
	 * nas linhas onde a coluna 'nomeFK' tem valor 'id'
	 * 
	 * @author Willian Kenji Nishizawa
	 * 
	 * @param nomeTabela : Nome da tabela que desejamos alterar
	 * @param nomeColuna : Nome da coluna que vai ter seu valor alterado
	 * @param valorColuna : Novo valor Boolean para a coluna desejada
	 * @param nomeFK : Nome da coluna de referencia (WHERE nomeFK=id)
	 * @param id : Valor esperado na coluna de referencia (WHERE nomeFK=id)
	 * @return True/False para o sucesso da operacao.
	 */
	public Boolean atualizarBoolean(String nomeTabela, String nomeColuna, boolean valorColuna, String nomeFK, int id) {
		String query = "UPDATE " + schema + nomeTabela + " " + "SET " + nomeColuna + " = " + valorColuna + " WHERE "
				+ nomeFK + "=" + id;
		rs = null;

		try {
			ps = con.prepareStatement(query);
//			ps.setString(1, nomeTabela);
//			ps.setString(2, nomeColuna);
//			ps.setBoolean(3, valorColuna);
//			ps.setString(4, nomeFK);
//			ps.setInt(5, id);

			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Na tabela 'nomeTabela' em sua coluna 'nomeColuna' vai atualizar
	 * o valor String atual para 'valorColuna'
	 * nas linhas onde a coluna 'nomeFK' tem valor 'id'
	 * 
	 * @author Willian Kenji Nishizawa
	 * 
	 * @param nomeTabela : Nome da tabela que desejamos alterar
	 * @param nomeColuna : Nome da coluna que vai ter seu valor alterado
	 * @param valorColuna : Novo valor String para a coluna desejada
	 * @param nomeFK : Nome da coluna de referencia (WHERE nomeFK=id)
	 * @param id : Valor esperado na coluna de referencia (WHERE nomeFK=id)
	 * @return True/False para o sucesso da operacao.
	 */
	public Boolean atualizarString(String nomeTabela, String nomeColuna, String valorColuna, String nomeFK, int idFK) {
		String query = "UPDATE " + schema + nomeTabela + " " + "SET " + nomeColuna + " = " + valorColuna + " WHERE "
				+ nomeFK + "=" + idFK;
		rs = null;

		try {
			ps = con.prepareStatement(query);
//			ps.setString(1, nomeTabela);
//			ps.setString(2, nomeColuna);
//			ps.setString(3, valorColuna);
//			ps.setString(4, nomeFK);
//			ps.setInt(5, id);

			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Na tabela 'nomeTabela' em sua coluna 'nomeColuna' vai atualizar
	 * o valor de Data atual para 'valorColuna'
	 * nas linhas onde a coluna 'nomeFK' tem valor 'id'
	 * 
	 * @author Willian Kenji Nishizawa
	 * 
	 * @param nomeTabela : Nome da tabela que desejamos alterar
	 * @param nomeColuna : Nome da coluna que vai ter seu valor alterado
	 * @param valorColuna : Novo valor LocalDate para a coluna desejada
	 * @param nomeFK : Nome da coluna de referencia (WHERE nomeFK=id)
	 * @param id : Valor esperado na coluna de referencia (WHERE nomeFK=id)
	 * @return True/False para o sucesso da operacao.
	 */
	public Boolean atualizarDate(String nomeTabela, String nomeColuna, LocalDate valorColuna, String nomeFK, int idFK) {
		String query = "UPDATE " + schema + nomeTabela + " " + "SET " + nomeColuna + " = "
				+ DataParser.localDateToSQLQuery(valorColuna) + " WHERE " + nomeFK + "=" + idFK;
		rs = null;

		try {
			ps = con.prepareStatement(query);
//			ps.setString(1, nomeTabela);
//			ps.setString(2, nomeColuna);
//			ps.setDate(3, DataParser.localDateToSQLDate(valorColuna));
//			ps.setString(4, nomeFK);
//			ps.setInt(5, id);

			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
