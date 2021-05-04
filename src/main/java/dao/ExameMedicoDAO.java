package dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.DataParser;
import controller.JdbcController;
import model.ExameMedico;

public class ExameMedicoDAO implements DAO<ExameMedico> {

	public boolean cadastrar(ExameMedico item) {
		JdbcController control = JdbcController.getInstance();
		try {
			control.executarQuerySemArg("INSERT INTO " + JdbcController.schema + "exame_medico"
					+ "(data, apto, tipo_exame_id, colaborador_id)" + "values("
					+ DataParser.localDateToSQLQuery(item.getDataExame()) + "," + item.isApto() + ","
					+ item.getTipoExame() + "," + item.getColaboradorId() + ")");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// POR FK, nao por PK
	public ExameMedico listar(int id) {
		JdbcController control = JdbcController.getInstance();

		ExameMedico output = new ExameMedico();

		try {
			ResultSet em = control.buscarPorFK("exame_medico", "colaborador_id", id);
			
			if (em.next()) {
				
			Date data_exame = em.getDate("data");
			Boolean apto = em.getBoolean("apto");
			int tipo_exame = em.getInt("tipo_exame_id"); // TODO: enum

			output.setColaboradorId(id);
			output.setDataExame(DataParser.sqlDateToLocalDate(data_exame));
			output.setApto(apto);
			output.setTipoExame(tipo_exame);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	}

	public ArrayList<ExameMedico> listarTudo() {
		ArrayList<ExameMedico> out = new ArrayList<ExameMedico>();

		JdbcController control = JdbcController.getInstance();
		ResultSet colab = control.listarPorTabela("colab");

		try {
			while (colab.next()) {
				int id = colab.getInt("id");
				ExameMedico entradaExame = new ExameMedico();
				
				ResultSet em = control.buscarPorFK("exame_medico", "colaborador_id", id);
				
				if (em.next()) {
					if (id == em.getInt("colaborador_id")) {
						Date data_exame = em.getDate("data");
						Boolean apto = em.getBoolean("apto");
						int tipo_exame = em.getInt("tipo_exame_id"); // TODO: enum

						entradaExame.setColaboradorId(id);
						entradaExame.setDataExame(DataParser.sqlDateToLocalDate(data_exame));
						entradaExame.setApto(apto);
						entradaExame.setTipoExame(tipo_exame);
					}
				}
				out.add(entradaExame);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return out;
	}

	public boolean delete(int id) {
		JdbcController control = JdbcController.getInstance();
		Boolean em = control.deletarPorId("exame_medico", id);
		return em;
	}

	public boolean atualizar(int id, ExameMedico itemNovo) {
		JdbcController control = JdbcController.getInstance();
		
		try {
			control.atualizarDate("exame_medico", "data", itemNovo.getDataExame(),"colaborador_id", id);
			control.atualizarBoolean("exame_medico", "apto", itemNovo.isApto(),"colaborador_id", id);
			control.atualizarInteiro("exame_medico", "tipo_exame_id", itemNovo.getTipoExame(),"colaborador_id", id);
			control.atualizarInteiro("exame_medico", "colaborador_id", itemNovo.getColaboradorId(), "colaborador_id", id);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
