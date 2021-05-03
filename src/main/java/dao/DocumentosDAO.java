package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.JdbcController;
import model.Documentos;

public class DocumentosDAO implements DAO<Documentos>{

	public boolean cadastrar(Documentos item) {
		// TODO Auto-generated method stub
		return false;
	}

	public Documentos listar(Documentos item) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Documentos> listarTudo() {
		ArrayList<Documentos> out = new ArrayList<Documentos>();
		
		
		JdbcController control = JdbcController.getInstance();
		ResultSet rg = JdbcController.listarPorTabela("rg");
		ResultSet titulo = JdbcController.listarPorTabela("titulo");
		ResultSet carteira_trabalho = JdbcController.listarPorTabela("carteira_trabalho");
		ResultSet registro_alistamento = JdbcController.listarPorTabela("registro_alistamento");
		
		ResultSet colab = JdbcController.listarPorTabela("colaboradores");
		try {
			
			while(colab.next()) {
				int id = colab.getInt("id");
				Documentos entradaDocumento = new Documentos();
				
				while(rg.next()) {
					if(id == rg.getInt("colaborador_id")) {
						String num = rg.getString("numero");
						String orgao = rg.getString("orgao_emissor");
						Date data = rg.getDate("data_emisassao");
						entradaDocumento.setRgNumero(num);
						entradaDocumento.setOrgaoEmissorRG(orgao);
						entradaDocumento.setDataEmissaoRG(data);
					}
				}
				
				while(titulo.next()) {
					if(id == titulo.getInt("colaborador_id")) {
						String num = titulo.getString("numero");
						String secao = titulo.getString("sessao");
						String zona = titulo.getString("zona");
						
						entradaDocumento.setTituloNumero(num);
						entradaDocumento.setTituloSecao(secao);
						entradaDocumento.setTituloZona(zona);
					}
				}
				
				while(carteira_trabalho.next()) {
					if(id == carteira_trabalho.getInt("colaborador_id")) {
						String num = carteira_trabalho.getString("numero");
						String serie = carteira_trabalho.getString("serie");
						Date emissao = carteira_trabalho.getDate("emissao");
						
						entradaDocumento.setCtpsNumero(num);
						entradaDocumento.setCtpsSerie(serie);
						entradaDocumento.setDataEmissaoCTPS(emissao);
					}
				}
				
				while(registro_alistamento.next()) {
					if(id == registro_alistamento.getInt("colaborador_id")) {
						String num = registro_alistamento.getString("numero");
						String serie = registro_alistamento.getString("serie");
						entradaDocumento.setRaNumero(num);
					}
				}
				out.add(entradaDocumento);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return out;
	}

	public boolean delete(Documentos item) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean atualizar(Documentos item, Documentos itemAntigo) {
		// TODO Auto-generated method stub
		return false;
	}

}
