package dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.DataParser;
import controller.JdbcController;
import model.Colaborador;
/**
 * Classe ColaboradorDao, realiza operações de inclusão, consulta, edição e exclusão.
 * 
 *  
 * @author Vanderlei <vanderleik@yahoo.com.br>
 *
 */

public class ColaboradorDAO extends DaoFactory<Colaborador>{
	
	public boolean cadastrar(Colaborador item) {
		JdbcController control = JdbcController.getInstance();
		try {
			control.executarQuerySemArg("INSERT INTO " + JdbcController.schema + "colaborador"
					+ "(nit, optante_vt, optante_vavr, data_admissao, optante_dependente)" + "values("
					+ item.getNit() + "," + item.isOptanteVT() + ","
					+ item.isOptanteVAVR() + "," + item.getDataAdmissao() + ","
					+ item.isOptanteDependente() + ")");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Colaborador listar(int id) {
		JdbcController control = JdbcController.getInstance();

		Colaborador output = new Colaborador();

		try {
			ResultSet colab = control.buscarPorReferenciaDeColuna("colaborador", "nit", id);
			
			if (colab.next()) {
				
			
			Integer nit = colab.getInt("nit");
			Boolean optante_vt = colab.getBoolean("optante_vt");
			Boolean optante_vavr = colab.getBoolean("optante_vavr");
			Date data_admissao = colab.getDate("data_admissao");
			Boolean optante_dependente = colab.getBoolean("optante_dependente");
			
			output.setIdColaborador(id);
			output.setNit(nit);
			output.setOptanteVT(optante_vt);
			output.setOptanteVAVR(optante_vavr);
			output.setDataAdmissao(DataParser.sqlDateToLocalDate(data_admissao));
			output.setOptanteDependente(optante_dependente);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	}

	
	public ArrayList<Colaborador> listarTudo() {
		ArrayList<Colaborador> out = new ArrayList<Colaborador>();

		JdbcController control = JdbcController.getInstance();
		ResultSet colab = control.listarPorTabela("colaborador");

		try {
			while (colab.next()) {
				int id = colab.getInt("id");
				Colaborador entradaColab = new Colaborador();
				
				ResultSet em = control.buscarPorReferenciaDeColuna("colaborador", "nit", id);
				
				if (em.next()) {
					if (id == em.getInt("colaborador_id")) {
						Integer nit = colab.getInt("nit");
						Boolean optante_vt = colab.getBoolean("optante_vt");
						Boolean optante_vavr = colab.getBoolean("optante_vavr");
						Date data_admissao = colab.getDate("data_admissao");
						Boolean optante_dependente = colab.getBoolean("optante_dependente");
											
					}
				}
				out.add(entradaColab);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return out;
	}

	public boolean delete(int id) {
		JdbcController control = JdbcController.getInstance();
		Boolean colab = control.deletarPorId("colaborador", id);
		return colab;
	}

	public boolean atualizar(int id, Colaborador itemNovo) {
		JdbcController control = JdbcController.getInstance();
		
		try {
			control.atualizarInteiro("colaborador", "nit", itemNovo.getNit(),"colaborador_id", id);
			control.atualizarBoolean("colaborador", "optante_vt", itemNovo.isOptanteVT(),"colaborador_id", id);
			control.atualizarBoolean("colaborador", "optante_vavr", itemNovo.isOptanteVAVR(),"colaborador_id", id);
			control.atualizarDate("colaborador", "data_admissao", itemNovo.getDataAdmissao(),"colaborador_id", id);
			control.atualizarBoolean("colaborador", "optante_dependente", itemNovo.isOptanteDependente(),"colaborador_id", id);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
