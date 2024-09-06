package org.prueba.unitaria;

import org.junit.jupiter.api.Test;
import org.servicios.empleado.ServicioEmpleado;

import junit.framework.TestCase;
/*
 * 1. Debemos heredar de TestCase
 * 2. Debemos crear el método test()
 * 3. Todos los métodos deben comenzar con el nombre test
 * 4.Todos los métodos deben llamar al método test()
 * 5. Todos los métodos deben llevar la anotación @Test
 */
class PruebaUnitariaEmpleado extends TestCase {

	ServicioEmpleado servicioEmpleado = null;
	
	@Test
	public void test() {
		servicioEmpleado = new ServicioEmpleado();
	}

	@Test
	public void testSalarioBonoEmpleado() {
		test();
		assertTrue(servicioEmpleado.salarioBonoEmpleado(20000.0, 5000.0) == 25000.0);
	}
	
	@Test
	public void testSalarioPrestamoEmpleado() {
		test();
		assertEquals(servicioEmpleado.salarioPrestamoEmpleado(20000.0,2500.0), 17500.0);
	}
}
