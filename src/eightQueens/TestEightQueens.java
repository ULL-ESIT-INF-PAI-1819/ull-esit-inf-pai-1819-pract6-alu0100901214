/**
 * 
 */
package eightQueens;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Sergio González Guerra
 *
 */
public class TestEightQueens {

	@Test
	void TestBoardConstructor(){
		Board b= new Board();
		System.out.println(b);
		String resultadoReal = b.toString();
		String resultadoEsperado = 
				"0 0 0 0 0 0 0 0 \r\n" + 
				"0 0 0 0 0 0 0 0 \r\n" + 
				"0 0 0 0 0 0 0 0 \r\n" + 
				"0 0 0 0 0 0 0 0 \r\n" + 
				"0 0 0 0 0 0 0 0 \r\n" + 
				"0 0 0 0 0 0 0 0 \r\n" + 
				"0 0 0 0 0 0 0 0 \r\n" + 
				"0 0 0 0 0 0 0 0";
		assertEquals(resultadoReal.equals(resultadoEsperado),false);
	}
	
	@Test
	void TestContent() {
		Board b = new Board();
		int[] v = new int[8];
		v[5] = 1;
		boolean resultadoReal = b.content(v, 1);
		boolean resultadoEsperado = true;
		assertEquals(resultadoReal,resultadoEsperado);
	}
}
