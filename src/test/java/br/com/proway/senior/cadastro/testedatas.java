package br.com.proway.senior.cadastro;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

public class testedatas {

	@Test
	public void test() {
		System.out.println(Math.abs(LocalDate.now().until(LocalDate.of(2020, 07, 01), ChronoUnit.DAYS)));
		
	}

}
