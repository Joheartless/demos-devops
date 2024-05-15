package com.gildedrose;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;
import org.junit.platform.commons.annotation.Testable;

class CalculadoraTest2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Nested
	@DisplayName("Metodo: Add")
	class Add{
		
		
	}

	@Test
	void testAdd() {
		Calculadora calculadora= new Calculadora();
		double result = calculadora.add(2,2);
		
		assertEquals(4, result);
	}
	
	@Test
	void testAddKO() {
		Calculadora calculadora= new Calculadora();
		double result = calculadora.add(0.1,0.2);
		
		assertEquals(0.3, result);
	}
	
	@Test
	void testRestaKO() {
		Calculadora calculadora= new Calculadora();
		double result = calculadora.add(0.1,0.2);
		
		assertEquals(0.3, result);
	}
	
	

	@Nested
	@DisplayName("Metodo: Div")
	class Divide{
		Calculadora calculadora= new Calculadora();
		 class OK{
			 @Test
			@DisplayName("Division entera")
			 void testDivInt() {
				 assertEquals(0, calculadora.div(1,3));
			 }
			 @Test
			 @DisplayName("Division real")
			 void testDivDoubleDouble() {
				 assertEquals(0.3333, calculadora.div(1.0,3),4);
				 
			 }
		}
		
		@Nested
		class KO{
			@Testable
			@DisplayName("Division por 0")
			void testDivInt() {
				assertThrows(ArithmeticException.class, () -> calculadora.div
			}
		}
		@Test
		void asercionMultiple() {
			Item item = new Item ("Queso",1,-2);
			
			assertNotNull(item);
			assertAll("Propiedades",
					
					() -> assertEquals("Queso", item.getName(), "name"),
					() -> assertEquals(1, item.getSellIn(), "SellIn"),
					 () -> assertEquals(2, item.getQuality(),"Quality")					
					);
		}
	}
	
	
/*
	@Test
	void testDivDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testDivIntInt() {
		fail("Not yet implemented");
	}*/

}
