package org.lessons.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	static Calculator myCalculator;
	float results;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		myCalculator = new Calculator();
	}

	@Test
	@DisplayName("verifica addizione")
	void addTest() {
		try {
//			richiamo il metodo dentro la classe Calculator e gli assegno i parametri
//			assegno al risultato il metodo da testare
			results = myCalculator.add(3, 5);
//			assegno 1) ilrisultato che mi aspetto, 2) la variabile che contine il metodo, 3) il messaggio
			assertEquals(8, results, "la somma deve essere 8");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Test
	@DisplayName("verifica sottrazione")
	void substractTest() {
		try {
//			richiamo il metodo dentro la classe Calculator e gli assegno i parametri
			results = myCalculator.substract(5, 3);
			assertEquals(2, results, "il risultato deve essere 2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("verifica divisione")
	void divideTest() {
		try {
//			richiamo il metodo dentro la classe Calculator e gli assegno i parametri
			results = myCalculator.divide(6, 3);
			assertEquals(2, results, "La divisione deve dare 2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("verifica moltiplicazione")
	void multiplyTest() {
		try {
//			richiamo il metodo dentro la classe Calculator e gli assegno i parametri
			results = myCalculator.multiply(6, 3);
			assertEquals(18, results, "la moltiplicazione darà 18");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("verifica moltiplicazione")
	void multiplyTestWithZero() {
		try {
//			richiamo il metodo dentro la classe Calculator e gli assegno i parametri
			results = myCalculator.multiply(0, 3);
			assertEquals(0, results, "la moltiplicazione darà 0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
