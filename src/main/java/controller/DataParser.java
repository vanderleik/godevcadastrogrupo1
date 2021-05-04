package controller;

import java.time.LocalDate;
import java.sql.Date;

public class DataParser {
	public static Date localDateToSQLDate(LocalDate entrada) {
		return Date.valueOf(entrada);
	}
	
	public static LocalDate sqlDateToLocalDate(Date entrada) {
		return entrada.toLocalDate();
	}
	
	/**
	 * Funcao responsavel por receber uma LocalDate e traduzi-la para uma String
	 * utilizavel em Queries. 
	 * 
	 * @author Willian Kenji Nishizawa <wk.nishizawa@gmail.com>
	 * @param entrada
	 * @return String
	 */
	public static String localDateToSQLQuery(LocalDate entrada) {
		return "'"+entrada.toString()+"'";
	}
	

	
}
