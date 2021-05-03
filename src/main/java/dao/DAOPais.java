package dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.JdbcController;
import model.Pais;

public class DAOPais<Pais> implements DAO<Pais> {
	
	public boolean cadastrar(Pais item) {
		Connection con = JdbcController.getInstance().get_con();
		
		/*item
		 *  - id
		 *  - sigla
		 */
		try {
			String query = "INSERT INTO pais (sigla) VALUES (?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setChar(1, item.sigla); //um set para cada tipo do SQL
			
			ResultSet rs = ps.executeQuery();
			return true;
			
		} catch (SQLException sadasd) {
			sadasd.printStackTrace();
		}
		return false;
	}

	public Pais listar(Pais item) {
		Connection con = JdbcController.getInstance().get_con();
		ResultSet rs = null;
		
		try {
			String query = "SELECT * FROM pais WHERE id = ? ";
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, item.id);
			
			rs = ps.executeQuery();
			// TODO: retorno nao parece certo
			return item;
			
		} catch (SQLException sadasd) {
			sadasd.printStackTrace();
		}
		return item;
	}

	public ArrayList<Pais item> listarTudo() { 
		// Nao precisa ser um metodo generico, só deve pedir qual de qual tabela
		Connection con = JdbcController.getInstance().get_con();
		ResultSet rs = null;
		
		ArrayList<Pais item> out = new ArrayList<Pais item>();
		
		try {
			String query = "SELECT * FROM pais ";
			
			PreparedStatement ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String sigla =  rs.getCharacterStream("sigla").toString();
				
				Pais item = (Pais) new Object(id, sigla); // objeto pais que temos que criar
				out.add(item);
			}
			return out;
			
		} catch (SQLException sadasd) {
			sadasd.printStackTrace();
		}
		return out;
	}

	public boolean delete(Pais item) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean atualizar(Pais item, Pais itemAntigo	) {
		// TODO Auto-generated method stub
		return false;
	}

}
