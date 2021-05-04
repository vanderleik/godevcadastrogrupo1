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
	private static Connection con;
	private static PreparedStatement ps;
	private static ResultSet rs = null;
	
	public static final String schema = "grupo1.";
	
	private static final String url = "jdbc:postgresql://localhost:5432/";
	private static final String database = "cadastro_colaborador";
	private static final String user = "postgres";
	private static final String pass = "admin";
	
	private JdbcController() {
		try {
			con = DriverManager.getConnection(url+database, user, pass );
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
	 * @return
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
	

	public ResultSet listarPorTabela(String nomeTabela) {
		String query = "SELECT * FROM "+schema+"?";
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
	
	
	public ResultSet buscarPorId(String nomeTabela, int id) {
		String query = "SELECT * FROM "+schema+"? WHERE id = ?";
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
	public ResultSet buscarPorFK(String nomeTabela, String nomeFK, int id_fk) {
		String query = "SELECT * FROM "+schema+"? WHERE ? = ?";
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
	
	public boolean deletarPorId(String nomeTabela, int id) {
		String query = "DELETE FROM "+schema+"? WHERE id = ?";
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
	
	public Boolean atualizarInteiro(String nomeTabela, String nomeColuna, int valorColuna, String nomeFK, int id) {
		String query = "UPDATE "+schema+"? SET ? = ? WHERE ?=?";
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
	
	public Boolean atualizarBoolean(String nomeTabela, String nomeColuna, boolean valorColuna, String nomeFK, int id) {
		String query = "UPDATE "+schema+"? SET ? = ? WHERE ?=?";
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
	
	public Boolean atualizarString(String nomeTabela, String nomeColuna, String valorColuna, String nomeFK, int id) {
		String query = "UPDATE "+schema+"? SET ? = ? WHERE ?=?";
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
	
	public Boolean atualizarDate(String nomeTabela, String nomeColuna, LocalDate valorColuna, String nomeFK, int id) {
		String query = "UPDATE "+schema+"? SET ? = ? WHERE ?=?";
		rs = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, nomeTabela);
			ps.setString(2, nomeColuna);
			ps.setDate(3, DataParser.localDateToSQLDate(valorColuna));
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
