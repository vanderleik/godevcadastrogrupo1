package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import model.Documentos;

public class DocumentosTest {

	@Test
	public void documentosBuilderTest() {
		
		Documentos documento = new Documentos.DocumentosBuilder().ctpsNumero(123456789).ctpsSerie(123456).dataEmissaoCTPS(LocalDate.of(2009, 02, 21)).
				bancoNome("Bradesco").bancoAgencia(123456).bancoNumeroConta(1234567).tituloNumero(734568911).tituloZona(1234).
				tituloSecao(9487).raNumero(354313465).rgNumero(1528476).orgaoEmissorRG("SSP").
				dataEmissaoRG(LocalDate.of(2010, 10, 5)).criarDocumentos();
		
		System.out.println(documento.toString());
	}

}