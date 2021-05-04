package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public final class JdbcController {
	private static JdbcController instance;
	
	//private static String driver = "com.postgresql.jdbc.Driver";
	private static String url = "jdbc:postgresql://localhost:5432/cadastro_colaborador";

	//private static String database = "cadastro_colaborador";
	//private static String schema = "grupo1";

	private static String user = "postgres";
	private static String pass = "admin";
	private static PreparedStatement ps;
	private static ResultSet rs = null;
	
	private static Connection con;

	private JdbcController() {
		try {
			//Class.forName("com.example.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass );
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static JdbcController getInstance() {
		if (instance == null) {
			instance = new JdbcController();
		}
		return instance;
	}
	
	public Connection get_con() {
		return con;
	}

	/** 
	 * Funcao do Singleton responsavel por executar uma query sem argumentos externos.
	 * 
	 * @param query : String com a query em SQL postgres;
	 * @author Willian Kenji Nishizawa
	 */
	public ResultSet executarQuerySemArg(String query) {
		try {
			ps = con.prepareStatement(query);
			ps.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	/**
	 * Funcao do Singleton que lista por tabela do BD.
	 * 
	 * 
	 * 
	 * @param query : String com a query em SQL postgres
	 * @return
	 */

	public ResultSet listarPorTabela(String nomeTabela) {
		String query = "SELECT * FROM ?";
		rs = null; //Limpa resultado anterior
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, nomeTabela);
			rs = ps.executeQuery();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	/**
	 * Funcao do Singleton que busca por ID na tebela informada.
	 * 
	 * 
	 * @param nomeTabela
	 * @param id
	 * @param query : String com a query em SQL postgres
	 * @return 
	 */
	
	public ResultSet buscarPorId(String nomeTabela, int id) {
		String query = "SELECT * FROM ? WHERE id = ?";
		rs = null; //Limpa resultado anterior
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, nomeTabela);
			ps.setInt(2, id);
			rs = ps.executeQuery();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	/**
	 * Funcao do Singleton que busca por foreign key na tebela informada.
	 * 
	 * 
	 * @param nomeTabela
	 * @param nomeFK
	 * @param id_fk
	 * @param query : String com a query em SQL postgres
	 * @return
	 */
	public ResultSet buscarPorFK(String nomeTabela, String nomeFK, int id_fk) {
		String query = "SELECT * FROM ? WHERE ? = ?";
		rs = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, nomeTabela);
			ps.setString(2, nomeFK);
			ps.setInt(3, id_fk);
			
			rs = ps.executeQuery();
			return rs;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	/**
	 * Deleta o item da tabela selecionada pelo ID.
	 * 
	 * 
	 * 
	 * @param nomeTabela
	 * @param id
	 * @param query : String com a query em SQL postgres
	 * @return
	 */
	public boolean deletarPorId(String nomeTabela, int id) {
		String query = "DELETE FROM ? WHERE id = ?";
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, nomeTabela);
			ps.setInt(2, id);
			rs = ps.executeQuery();
			return true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * Atualiza um número inteiro da tabela selecionada.
	 * 
	 * 
	 * @param nomeTabela
	 * @param nomeColuna
	 * @param valorColuna
	 * @param nomeFK
	 * @param id
	 * @return
	 */
	public Boolean atualizarInteiro(String nomeTabela, String nomeColuna, int valorColuna, String nomeFK, int id) {
		String query = "UPDATE ?+ SET ? = ? WHERE ?=?";
		rs = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, nomeTabela);
			ps.setString(2, nomeColuna);
			ps.setInt(3, valorColuna);
			ps.setString(4, nomeFK);
			ps.setInt(5, id);
			
			rs = ps.executeQuery();
			return true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * Atualiza um booleano da tabela selecionada.
	 * 
	 * @param nomeTabela
	 * @param nomeColuna
	 * @param valorColuna
	 * @param nomeFK
	 * @param id
	 * @return
	 */
	public Boolean atualizarBoolean(String nomeTabela, String nomeColuna, boolean valorColuna, String nomeFK, int id) {
		String query = "UPDATE ? SET ? = ? WHERE ?=?";
		rs = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, nomeTabela);
			ps.setString(2, nomeColuna);
			ps.setBoolean(3, valorColuna);
			ps.setString(4, nomeFK);
			ps.setInt(5, id);
			
			rs = ps.executeQuery();
			return true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * Atualiza uma String da tabela selecionada.
	 * 
	 * @param nomeTabela
	 * @param nomeColuna
	 * @param valorColuna
	 * @param nomeFK
	 * @param id
	 * @return
	 */
	public Boolean atualizarString(String nomeTabela, String nomeColuna, String valorColuna, String nomeFK, int id) {
		String query = "UPDATE ? SET ? = ? WHERE ?=?";
		rs = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, nomeTabela);
			ps.setString(2, nomeColuna);
			ps.setString(3, valorColuna);
			ps.setString(4, nomeFK);
			ps.setInt(5, id);
			
			rs = ps.executeQuery();
			return true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
/**
 * Atualiza um Date da tabela selecionada.
 * 
 * 
 * @param nomeTabela
 * @param nomeColuna
 * @param valorColuna
 * @param nomeFK
 * @param id
 * @return
 */
	public Boolean atualizarDate(String nomeTabela, String nomeColuna, LocalDate valorColuna, String nomeFK, int id) {
		String query = "UPDATE ? SET ? = ? WHERE ?=?";
		rs = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, nomeTabela);
			ps.setString(2, nomeColuna);
			ps.setDate(3, valorColuna);
			ps.setString(4, nomeFK);
			ps.setInt(5, id);
			
			rs = ps.executeQuery();
			return true;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
