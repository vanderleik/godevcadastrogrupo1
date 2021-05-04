package controller;

import java.time.LocalDate;
import java.sql.Date;

public class DataParser {
	/**
	 * Passa de LocalDate para java.sql.Date esperado pelo banco de dados
	 * @param entrada em formato LocalDate 
	 * @author Willian Kenji Nishizawa <wk.nishizawa@gmail.com>
	 * @return entrada em Date
	 */
	public static Date localDateToSQLDate(LocalDate entrada) {
		return Date.valueOf(entrada);
	}
	
	/**
	 * Passa de sql.Date vindo do Banco de Dados para java.time.LocalDate
	 * @param entrada em formato Date 
	 * @author Willian Kenji Nishizawa <wk.nishizawa@gmail.com>
	 * @return entrada em LocalDate
	 */
	public static LocalDate sqlDateToLocalDate(Date entrada) {
		return entrada.toLocalDate();
	}
	
	/**
	 * Funcao responsavel por receber uma LocalDate e traduzi-la para uma String
	 * utilizavel em Queries. 
	 * 
	 * @author Willian Kenji Nishizawa <wk.nishizawa@gmail.com>
	 * @param entrada data em LocalDate
	 * @return String para ser usada em Query
	 */
	public static String localDateToSQLQuery(LocalDate entrada) {
		return "'"+entrada.toString()+"'";
	}
	

	
}
