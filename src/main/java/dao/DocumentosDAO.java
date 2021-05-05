package dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.DataParser;
import controller.JdbcController;
import model.Documentos;

public class DocumentosDAO implements DAO<Documentos>{

	public boolean cadastrar(Documentos item) {
		JdbcController control = JdbcController.getInstance();
		try {
			control.executarQuerySemArg(
				"INSERT INTO "+JdbcController.schema+"rg "
				+ "(numero, orgao_emissor, data_emissao, colaborador_id) "
				+ "values("
				+ item.getRgNumero()+","
				+ item.getOrgaoEmissorRG()+","
				+ DataParser.localDateToSQLQuery(item.getDataEmissaoRG()) +","
				+ item.getColaboradorId()
				+")");
			
			control.executarQuerySemArg(
				"INSERT INTO "+JdbcController.schema+"titulo (numero, zona, sessao, colaborador_id)"
				+ "values("
				+ item.getTituloNumero()+","
				+ item.getTituloZona()+","
				+ item.getTituloSecao()+","
				+ item.getColaboradorId()
				+")");
		
		        control.executarQuerySemArg(
				"INSERT INTO "+JdbcController.schema+"carteira_trabalho (numero, serie, emissao, colaborador_id)"
				+ "values("
				+ item.getCtpsNumero()+","
				+ item.getCtpsSerie()+","
				+ DataParser.localDateToSQLQuery(item.getDataEmissaoCTPS()) +","
				+ item.getColaboradorId()
				+")"
				);
			
			control.executarQuerySemArg(
				"INSERT INTO "+JdbcController.schema+"registro_alistamento (numero, serie, colaborador_id)"
				+ "values("
				+ item.getRaNumero()+","
				+ item.getRaSerie()+","
				+ item.getColaboradorId()
				+")");
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public Documentos listar(int id) {
		JdbcController control = JdbcController.getInstance();
		
		ResultSet rg = 
				control.buscarPorReferenciaDeColuna("rg", "colaborador_id", id);
		ResultSet titulo = 
				control.buscarPorReferenciaDeColuna("titulo", "colaborador_id", id);
		ResultSet carteira_trabalho = 
				control.buscarPorReferenciaDeColuna("carteira_trabalho", "colaborador_id", id);
		ResultSet registro_alistamento = 
				control.buscarPorReferenciaDeColuna("registro_alistamento", "colaborador_id", id);
		
		Documentos entradaDocumento = new Documentos();
		entradaDocumento.setColaboradorId(id);
		
		try {
				if(rg.next()) {
						String num = rg.getString("numero");
						String orgao = rg.getString("orgao_emissor");
						Date data = rg.getDate("data_emissao");
						entradaDocumento.setRgNumero(num);
						entradaDocumento.setOrgaoEmissorRG(orgao);
						entradaDocumento.setDataEmissaoRG(DataParser.sqlDateToLocalDate(data));
				}
				if(titulo.next()) {
					if(id == titulo.getInt("colaborador_id")) {
						String num = titulo.getString("numero");
						String secao = titulo.getString("sessao");
						String zona = titulo.getString("zona");
						
						entradaDocumento.setTituloNumero(num);
						entradaDocumento.setTituloSecao(secao);
						entradaDocumento.setTituloZona(zona);
					}
				}
				if(carteira_trabalho.next()) {
					if(id == carteira_trabalho.getInt("colaborador_id")) {
						String num = carteira_trabalho.getString("numero");
						String serie = carteira_trabalho.getString("serie");
						Date emissao = carteira_trabalho.getDate("emissao");
						
						entradaDocumento.setCtpsNumero(num);
						entradaDocumento.setCtpsSerie(serie);
						entradaDocumento.setDataEmissaoCTPS(DataParser.sqlDateToLocalDate(emissao));
					}
				}
				
				if(registro_alistamento.next()) {
					if(id == registro_alistamento.getInt("colaborador_id")) {
						String num = registro_alistamento.getString("numero");
						String serie = registro_alistamento.getString("serie");
						entradaDocumento.setRaNumero(num);
						entradaDocumento.setRaSerie(serie);
					}
				}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return entradaDocumento;
	}

	public ArrayList<Documentos> listarTudo() {
		ArrayList<Documentos> out = new ArrayList<Documentos>();
		
		JdbcController control = JdbcController.getInstance();
		ResultSet colab = control.listarPorTabela("colaborador");
		
		try {
			while(colab.next()) {
				int id = colab.getInt("id");
				Documentos entradaDocumento = new Documentos();
				entradaDocumento.setColaboradorId(id);
				
				ResultSet rg = control.buscarPorReferenciaDeColuna("rg", "colaborador_id", id);
				ResultSet titulo = control.buscarPorReferenciaDeColuna("titulo", "colaborador_id", id);
				ResultSet carteira_trabalho = control.buscarPorReferenciaDeColuna("carteira_trabalho", "colaborador_id", id);
				ResultSet registro_alistamento = control.buscarPorReferenciaDeColuna("registro_alistamento", "colaborador_id", id);

				if(rg.next()) {
					if(id == rg.getInt("colaborador_id")) {
						String num = rg.getString("numero");
						String orgao = rg.getString("orgao_emissor");
						Date data = rg.getDate("data_emissao");
						entradaDocumento.setRgNumero(num);
						entradaDocumento.setOrgaoEmissorRG(orgao);
						entradaDocumento.setDataEmissaoRG(DataParser.sqlDateToLocalDate(data));
					}
				}
				
				if(titulo.next()) {
					if(id == titulo.getInt("colaborador_id")) {
						String num = titulo.getString("numero");
						String secao = titulo.getString("sessao");
						String zona = titulo.getString("zona");
						
						entradaDocumento.setTituloNumero(num);
						entradaDocumento.setTituloSecao(secao);
						entradaDocumento.setTituloZona(zona);
					}
				}

				if(carteira_trabalho.next()) {
					if(id == carteira_trabalho.getInt("colaborador_id")) {
						String num = carteira_trabalho.getString("numero");
						String serie = carteira_trabalho.getString("serie");
						Date emissao = carteira_trabalho.getDate("emissao");
						
						entradaDocumento.setCtpsNumero(num);
						entradaDocumento.setCtpsSerie(serie);
						entradaDocumento.setDataEmissaoCTPS(DataParser.sqlDateToLocalDate(emissao));
					}
				}
				
				if(registro_alistamento.next()) {
					if(id == registro_alistamento.getInt("colaborador_id")) {
						String num = registro_alistamento.getString("numero");
						String serie = registro_alistamento.getString("serie"); 
						entradaDocumento.setRaNumero(num);
						entradaDocumento.setCtpsSerie(serie);
					}
				}
				out.add(entradaDocumento);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return out;
	}

	public boolean atualizar(int id_colab, Documentos itemNovo) { //id do usuario
		JdbcController control = JdbcController.getInstance();
		
		try {
			control.atualizarString("rg", "numero", itemNovo.getRgNumero(),"colaborador_id", id_colab);
			control.atualizarString("rg", "orgao_emissor", itemNovo.getOrgaoEmissorRG(),"colaborador_id", id_colab);
			control.atualizarDate("rg", "data_emissao", itemNovo.getDataEmissaoRG(),"colaborador_id", id_colab);
			
			control.atualizarString("titulo", "numero", itemNovo.getTituloNumero(),"colaborador_id", id_colab);
			control.atualizarString("titulo", "zona", itemNovo.getTituloZona(),"colaborador_id", id_colab);
			control.atualizarString("titulo", "sessao", itemNovo.getTituloSecao(),"colaborador_id", id_colab);
			
			control.atualizarString("carteira_trabalho", "numero", itemNovo.getCtpsNumero(),"colaborador_id", id_colab);
			control.atualizarString("carteira_trabalho", "serie", itemNovo.getCtpsSerie(),"colaborador_id", id_colab);
			control.atualizarDate("carteira_trabalho", "emissao", itemNovo.getDataEmissaoCTPS(),"colaborador_id", id_colab);
			
			control.atualizarString("registro_alistamento", "numero", itemNovo.getRaNumero(),"colaborador_id", id_colab);
			control.atualizarString("registro_alistamento", "serie", itemNovo.getRaSerie(),"colaborador_id", id_colab);
			
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(int id) {
		JdbcController control = JdbcController.getInstance();
		
		Boolean rg = control.deletarPorId("rg", id);
		Boolean titulo = control.deletarPorId("titulo", id);
		Boolean carteira_trabalho = control.deletarPorId("carteira_trabalho", id);
		Boolean registro_alistamento = control.deletarPorId("registro_alistamento", id);
		
		return (rg && titulo && carteira_trabalho && registro_alistamento );
	}
}
