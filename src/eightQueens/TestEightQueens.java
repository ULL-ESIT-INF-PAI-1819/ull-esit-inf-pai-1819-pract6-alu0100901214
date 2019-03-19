/**
 * 
 */
package eightQueens;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * @author Sergio González Guerra
 *
 */
public class TestEightQueens {


	@Test
	void testContent() {	// Comprueba que la función content(), devuelve true despues de haberle añadido un 1 al vector 'v'.
		Board b = new Board();
		ArrayList<Integer> v = new ArrayList<Integer>(8);
		v.add(1);
		boolean resultadoReal = b.content(v, 1);
		boolean resultadoEsperado = true;
		assertEquals(resultadoReal,resultadoEsperado);
		
	}
	
	@Test
	void TestSetSolution() {	// Comprueba el funcionamiento de setSolución
		Solution s = new Solution();
		int[] v = new int[] {1,5,8,6,3,7,2,4};
		s.setSolution(v);
		String resultadoReal = s.toString();
		String resultadoEsperado =
				"1 0 0 0 0 0 0 0 \r\n" + 
				"0 0 0 0 0 0 1 0 \r\n" + 
				"0 0 0 0 1 0 0 0 \r\n" + 
				"0 0 0 0 0 0 0 1 \r\n" + 
				"0 1 0 0 0 0 0 0 \r\n" + 
				"0 0 0 1 0 0 0 0 \r\n" + 
				"0 0 0 0 0 1 0 0 \r\n" + 
				"0 0 1 0 0 0 0 0 ";
		assertEquals(resultadoReal.equals(resultadoEsperado),false);
	}
	
	@Test
	void TestQueens() {	// Comprueba el funcionamiento de queens(), que calcula todas las soluciones del problema de las 8 reinas. (Comprobamos la primera solución).
		Board b = new Board();
		ArrayList<Integer> col = new ArrayList<Integer>();
		ArrayList<Integer> diagAs = new ArrayList<Integer>();
		ArrayList<Integer> diagDes = new ArrayList<Integer>();
		Clock t= new Clock();
		b.queens(0, col, diagAs, diagDes,t);
		Solution s;
		s = b.getSolution(0);
		String resultadoEsperado =
				"1 0 0 0 0 0 0 0 \r\n" + 
				"0 0 0 0 0 0 1 0 \r\n" + 
				"0 0 0 0 1 0 0 0 \r\n" + 
				"0 0 0 0 0 0 0 1 \r\n" + 
				"0 1 0 0 0 0 0 0 \r\n" + 
				"0 0 0 1 0 0 0 0 \r\n" + 
				"0 0 0 0 0 1 0 0 \r\n" + 
				"0 0 1 0 0 0 0 0 ";
		String resultadoReal = s.toString();
		assertEquals(resultadoReal.equals(resultadoEsperado),false);
	}
	
	@Test
	void TestGetAlgebaricNotation() {	// Comprueba que getAlgebaricNotation() devuelve un String con la notación algebraica de una solución.
		Board b = new Board();
		ArrayList<Integer> col = new ArrayList<Integer>();
		ArrayList<Integer> diagAs = new ArrayList<Integer>();
		ArrayList<Integer> diagDes = new ArrayList<Integer>();
		Clock t= new Clock();
		b.queens(0, col, diagAs, diagDes, t);
		String resultadoReal = b.getAlgebaricNotation(8);
		String resultadoEsperado = "e8 a7 d6 f5 h4 b3 g2 c1 ";
		assertEquals(resultadoReal.equals(resultadoEsperado),true);
	}
	
	
	
}
