package dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.DataParser;
import controller.JdbcController;
import model.Documentos;
import model.Endereco;
import model.Pessoa;

public class EnderecoDAO implements DAO<Endereco> {

	public boolean cadastrar(Endereco item) {
		JdbcController control = JdbcController.getInstance();
		try {
			control.executarQuerySemArg(
					"INSERT INTO " + JdbcController.schema + "pais (sigla) " + "values (" + item.getPais() + ")");

			control.executarQuerySemArg("INSERT INTO " + JdbcController.schema + "estado (sigla, pais_id)" + "values("
					+ item.getUf() + "," + item.getPaisId() + ")");

			control.executarQuerySemArg("INSERT INTO " + JdbcController.schema + "cidade (nome, estado_id)" + "values("
					+ item.getCidade() + "," + item.getEstadoId() + ")");

			control.executarQuerySemArg("INSERT INTO " + JdbcController.schema + "bairro (nome, cidade_id)" + "values("
					+ item.getBairro() + "," + item.getCidadeId() + ")");

			control.executarQuerySemArg("INSERT INTO " + JdbcController.schema
					+ "endereco (logradouro, numero, complemento, cep, bairro_id)" + "values(" + item.getLogradouro()
					+ "," + item.getNumero() + "," + item.getComplemento() + "," + item.getCep() + ","
					+ item.getBairroId() + ")");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// Pesquisa pelo id do Endereco
	public Endereco listar(int id) {
		JdbcController control = JdbcController.getInstance();
		Endereco out = new Endereco();

		try {
			ResultSet endereco = control.buscarPorId("endereco", id); // primeiro esse
			if (endereco.next()) {
				int bairro_id = endereco.getInt("bairro_id");

				out.setLogradouro(endereco.getString("logradouro"));
				out.setNumero(endereco.getString("numero"));
				out.setComplemento(endereco.getString("complemento"));
				out.setCep(endereco.getString("cep"));
				out.setBairroId(bairro_id);

				ResultSet bairro = control.buscarPorId("bairro", bairro_id);
				if (bairro.next()) {
					int cidade_id = bairro.getInt("cidade_id");

					out.setBairro(bairro.getString("nome"));
					out.setCidadeId(cidade_id);

					ResultSet cidade = control.buscarPorId("cidade", cidade_id);
					if (cidade.next()) {
						int estado_id = cidade.getInt("estado_id");

						out.setEstadoId(estado_id);
						out.setCidade(cidade.getString("nome"));

						ResultSet estado = control.buscarPorId("estado", estado_id);
						if (estado.next()) {
							int pais_id = estado.getInt("pais_id");

							out.setPaisId(pais_id);
							out.setUf(estado.getString("nome"));

							ResultSet pais = control.buscarPorId("pais", pais_id);
							if (pais.next()) {
								out.setPais(pais.getString("sigla"));
							}
						}
					}
				}
			}
			return out;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Endereco> listarTudo() {
		ArrayList<Endereco> out = new ArrayList<Endereco>();

		JdbcController control = JdbcController.getInstance();
		ResultSet endereco = control.listarPorTabela("endereco");

		try {
			while (endereco.next()) {
				int id = endereco.getInt("id");
				out.add(listar(id));
			}
			return out;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean delete(int id) {
		JdbcController control = JdbcController.getInstance();
		Integer pais_id = 0, estado_id = 0, cidade_id = 0, bairro_id = 0, endereco_id = 0;

		try {
			ResultSet endereco = control.buscarPorId("endereco", id);
			endereco_id = endereco.getInt("id");
			if (endereco.next()) {
				bairro_id = endereco.getInt("bairro_id");

				ResultSet bairro = control.buscarPorId("bairro", bairro_id);
				if (bairro.next()) {
					cidade_id = bairro.getInt("cidade_id");

					ResultSet cidade = control.buscarPorId("cidade", cidade_id);
					if (cidade.next()) {
						estado_id = cidade.getInt("estado_id");

						ResultSet estado = control.buscarPorId("estado", estado_id);
						if (estado.next()) {
							pais_id = estado.getInt("pais_id");

							ResultSet pais = control.buscarPorId("pais", pais_id);
							if (pais.next()) {
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Boolean pais = control.deletarPorId("pais", pais_id);
		Boolean estado = control.deletarPorId("estado", estado_id);
		Boolean cidade = control.deletarPorId("cidade", cidade_id);
		Boolean bairro = control.deletarPorId("bairro", bairro_id);
		Boolean enderecox = control.deletarPorId("endereco", endereco_id);

		return (pais && estado && cidade && bairro && enderecox);
	}

	public boolean atualizar(int id, Endereco itemNovo) {
		JdbcController control = JdbcController.getInstance();
		Integer pais_id = 0, estado_id = 0, cidade_id = 0, bairro_id = 0, endereco_id = 0;
		
		try {
			ResultSet endereco = control.buscarPorId("endereco", id);
			endereco_id = endereco.getInt("id");
			if (endereco.next()) {
				bairro_id = endereco.getInt("bairro_id");

				ResultSet bairro = control.buscarPorId("bairro", bairro_id);
				if (bairro.next()) {
					cidade_id = bairro.getInt("cidade_id");

					ResultSet cidade = control.buscarPorId("cidade", cidade_id);
					if (cidade.next()) {
						estado_id = cidade.getInt("estado_id");

						ResultSet estado = control.buscarPorId("estado", estado_id);
						if (estado.next()) {
							pais_id = estado.getInt("pais_id");

							ResultSet pais = control.buscarPorId("pais", pais_id);
							if (pais.next()) {
							}
						}
					}
				}
			}

			control.atualizarString("pais", "sigla", itemNovo.getPais(), "id", pais_id);

			control.atualizarString("estado", "sigla", itemNovo.getUf(), "id", estado_id);
			control.atualizarInteiro("estado", "pais_id", itemNovo.getPaisId(), "id", estado_id);

			control.atualizarString("cidade", "nome", itemNovo.getCidade(), "id", cidade_id);
			control.atualizarInteiro("cidade", "estado_id", itemNovo.getEstadoId(), "id", cidade_id);

			control.atualizarString("bairro", "nome", itemNovo.getBairro(), "id", bairro_id);
			control.atualizarInteiro("bairro", "cidade_id", itemNovo.getCidadeId(), "id", bairro_id);

			control.atualizarString("endereco", "logradouro", itemNovo.getLogradouro(), "id", id);
			control.atualizarString("endereco", "numero", itemNovo.getNumero(), "id", id);
			control.atualizarString("endereco", "complemento", itemNovo.getComplemento(), "id", id);
			control.atualizarString("endereco", "cep", itemNovo.getCep(), "id", id);
			control.atualizarInteiro("endereco", "bairro_id", itemNovo.getBairroId(), "id", id);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
