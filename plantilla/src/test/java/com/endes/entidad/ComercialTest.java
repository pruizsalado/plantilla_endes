package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComercialTest {
	private Comercial comercial;
	@BeforeEach
	void setUp() throws Exception {
		comercial = new Comercial("12345678A", "Pablo", "Ruiz", 1000.0, 1500.0);
	}

	@Test
	void testGetVentas() {
		double resultadoEsperado = 1500.0;
		double resultadoActual = comercial.getVentas();
		assertEquals(resultadoEsperado, resultadoActual);
	}
	
	@Test
	void testSetVentas() {
        comercial.setVentas(2000.0);
        double resultadoEsperado = 2000.0;
        double resultadoActual = comercial.getVentas();
        assertEquals(resultadoEsperado, resultadoActual);
	}
	
	@Test
	void testSetVentasNegativas() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
				() -> comercial.setVentas(-100.0));
		assertEquals("Las ventas no pueden ser negativas", exception.getMessage());
	}
	
	@Test
	void testCalcularExtra() {
		double resultadoEsperado = 150.0;
		double resultadoActual = comercial.calcularExtra();
		assertEquals(resultadoEsperado, resultadoActual);
	}
	
	@Test
	void testGetSueldo() {
		double resultadoEsperado = 1150.0;
		double resultadoActual = comercial.getSueldo();
		assertEquals(resultadoEsperado, resultadoActual);
	}
}