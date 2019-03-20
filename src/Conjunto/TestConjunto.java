/**
 * 
 */
package Conjunto;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * @author Sergio_González_Guerra
 *
 */
public class TestConjunto {
	
	@Test
	void constructorVacio() {
		Conjunto A= new Conjunto();
		String resultadoReal = A.toString();
		String resultadoEsperado = "";
		
		assertEquals(resultadoReal,resultadoEsperado);
	}
	
	@Test
	void constructorPorVector() {
		int[] vector = {1,2,3};
		Conjunto A= new Conjunto(vector);
		String resultadoReal = A.toString();
		String resultadoEsperado = "1 2 3";
		
		assertEquals(resultadoReal,resultadoEsperado);
	}
}
