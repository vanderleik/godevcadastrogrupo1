package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.JdbcController;
import model.DadosBancarios;

/**
 * 
 * @author David Willian
 *
 */

public class DadosBancariosDAO implements DAO<DadosBancarios> {

	public boolean cadastrar(DadosBancarios item) {
		JdbcController control = JdbcController.getInstance();
		try {
			control.executarQuerySemArg(
				"INSERT INTO "+JdbcController.schema+"Banco "
				+ "(codigo, nome) "
				+ "values("
				+ item.getBancoCodigo()+","
				+ item.getBancoNome()+","
				+")");
			
			control.executarQuerySemArg(
				"INSERT INTO "+JdbcController.schema+"agencia (numero, digito_verificador, banco_codigo)"
				+ "values("
				+ item.getAgenciaNumero()+","
				+ item.getAgenciaDigitoVerficador()+","
				+ item.getBancoCodigo()+","
				+ item.getAgenciaId()+","
				+")");
		
		        control.executarQuerySemArg(
				"INSERT INTO "+JdbcController.schema+"conta (numero, digito_verificador, agencia_id, )"
				+ "values("
				+ item.getContaNumero()+","
				+ item.getContaDigitoVerficador()+","
				+ item.getAgenciaId()+","
				+")"
				);
			
//			control.executarQuerySemArg(
//				"INSERT INTO "+JdbcController.schema+"conta_has_colaborador (numero, serie, colaborador_id)"
//				+ "values("
//				+ item.getRaNumero()+","
//				+ item.getRaSerie()+","
//				+ item.getColaboradorId()
//				+")");
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public DadosBancarios listar(int id) {
		JdbcController control = JdbcController.getInstance();
		
		ResultSet banco = 
				control.buscarPorReferenciaDeColuna("banco", "colaborador_id", id);
		ResultSet agencia = 
				control.buscarPorReferenciaDeColuna("agencia", "colaborador_id", id);
		ResultSet conta = 
				control.buscarPorReferenciaDeColuna("conta", "colaborador_id", id);
//		ResultSet conta_has_colaborador = 
//				control.buscarPorFK("conta_has_colaborador", "colaborador_id", id);
//		
		DadosBancarios entradaDeDadosBancarios = new DadosBancarios();
		entradaDeDadosBancarios.setColaboradorId(id);
		
		try {
				if(banco.next()) {
						String cod = banco.getString("banco_codigo");
						String nome = banco.getString("nome");
						entradaDeDadosBancarios.setBancoCodigo(cod);
						entradaDeDadosBancarios.setBancoNome(nome);
				}
				if(agencia.next()) {
					if(id == agencia.getInt("colaborador_id")) {
						String num = agencia.getString("numero");
						String digito = agencia.getString("digito_verificador");
						String cod = agencia.getString("banco_codigo");
						
						entradaDeDadosBancarios.setAgenciaNumero(num);
						entradaDeDadosBancarios.setAgenciaDigitoVerficador(digito);
						entradaDeDadosBancarios.setBancoCodigo(cod);
					}
				}
				if(conta.next()) {
					if(id == conta.getInt("colaborador_id")) {
						String num = conta.getString("numero");
						String digito = conta.getString("digito");
						String agencia_id = conta.getString("agencia_id");
						
						entradaDeDadosBancarios.setContaNumero(num);
						entradaDeDadosBancarios.setContaDigitoVerficador(digito);
						entradaDeDadosBancarios.setAgenciaId(agencia_id);
					}
				}
				
//				if(conta_has_colaborador.next()) {
//					if(id == conta_has_colaborador.getInt("colaborador_id")) {
//						String conta_id = conta_has_colaborador.getString("conta_id");
//						String colaborador_id = conta_has_colaborador.getString("colaborador_id");
//						entradaDeDadosBancarios.setcon(num);
//						entradaDeDadosBancarios.setRaSerie(serie);
//					}
//				}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return entradaDeDadosBancarios;
	}

	public ArrayList<DadosBancarios> listarTudo() {
		ArrayList<DadosBancarios> out = new ArrayList<DadosBancarios>();
		
		JdbcController control = JdbcController.getInstance();
		ResultSet colab = control.listarPorTabela("colaborador");
		
		try {
			while(colab.next()) {
				int id = colab.getInt("id");
				DadosBancarios entradaDadosBancarios = new DadosBancarios();
				entradaDadosBancarios.setColaboradorId(id);
				
				ResultSet banco = control.buscarPorReferenciaDeColuna("banco", "colaborador_id", id);
				ResultSet agencia = control.buscarPorReferenciaDeColuna("agencia", "colaborador_id", id);
				ResultSet conta = control.buscarPorReferenciaDeColuna("conta", "colaborador_id", id);
	

				if(banco.next()) {
					if(id == banco.getInt("colaborador_id")) {
						String nome = banco.getString("nome");
						String codigo = banco.getString("codigo");
						
						entradaDadosBancarios.setBancoNome(nome);
						entradaDadosBancarios.setBancoCodigo(codigo);
						
					}
				}
				
				if(agencia.next()) {
					if(id == agencia.getInt("colaborador_id")) {
						String num = agencia.getString("numero");
						String digito = agencia.getString("digito_verificador");
						String codigo = agencia.getString("codigo");
						
						entradaDadosBancarios.setAgenciaNumero(num);
						entradaDadosBancarios.setAgenciaDigitoVerficador(digito);
						entradaDadosBancarios.setBancoCodigo(codigo);
					}
				}

				if(conta.next()) {
					if(id == conta.getInt("colaborador_id")) {
						String num = conta.getString("numero");
						String digito = conta.getString("digito");
						String agencia_id = conta.getString("agencia_id");
						
						entradaDadosBancarios.setAgenciaNumero(num);
						entradaDadosBancarios.setContaDigitoVerficador(digito);
						entradaDadosBancarios.setAgenciaId(agencia_id);
					}
				}
				
				out.add(entradaDadosBancarios);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return out;
	}

	public boolean atualizar(int id_colab, DadosBancarios itemNovo) { //id do usuario
		JdbcController control = JdbcController.getInstance();
		
		try {
			control.atualizarString("banco", "nome", itemNovo.getBancoNome(),"colaborador_id", id_colab);
			control.atualizarString("banco", "codigo", itemNovo.getBancoCodigo(),"colaborador_id", id_colab);
			
			control.atualizarString("agencia", "numero", itemNovo.getAgenciaNumero(),"colaborador_id", id_colab);
			control.atualizarString("agencia", "digito", itemNovo.getAgenciaDigitoVerficador(),"colaborador_id", id_colab);
			control.atualizarString("agencia", "codigo", itemNovo.getBancoCodigo(),"colaborador_id", id_colab);
			
			control.atualizarString("conta", "numero", itemNovo.getContaNumero(),"colaborador_id", id_colab);
			control.atualizarString("conta", "digito", itemNovo.getContaDigitoVerficador(),"colaborador_id", id_colab);
			control.atualizarString("agencia", "id", itemNovo.getAgenciaId(),"colaborador_id", id_colab);
		
			
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(int id) {
		JdbcController control = JdbcController.getInstance();
		
		Boolean banco = control.deletarPorId("rg", id);
		Boolean agencia = control.deletarPorId("titulo", id);
		Boolean conta = control.deletarPorId("carteira_trabalho", id);
		
		return (banco && agencia && conta);
	}
}
