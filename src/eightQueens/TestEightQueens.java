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
	void TestQueen(){
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
}
