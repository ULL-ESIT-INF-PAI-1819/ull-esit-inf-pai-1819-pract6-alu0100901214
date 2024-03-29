/**
 * 
 */
package Conjunto;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * @author Sergio_Gonz�lez_Guerra
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
		String resultadoEsperado = "1 2 3 ";
		
		assertEquals(resultadoReal,resultadoEsperado);
	}
	
	@Test 
	void constructorPorFichero() throws IOException{
		File archivo = new File("conjunto1.txt");
		Conjunto A= new Conjunto(archivo);
		String resultadoReal = A.toString();
		String resultadoEsperado = "1 2 3 ";
		
		assertEquals(resultadoReal,resultadoEsperado);
	}
	
	@Test
	void pruebaCardinal() {
		int[] vector = {1,2,3};
		Conjunto A= new Conjunto(vector);
		int resultadoReal = A.cardinal();
		int resultadoEsperado = 3;
		assertEquals(resultadoReal,resultadoEsperado);
	}
	
	@Test
	void pruebaEsVacio() {
		int[] vector = {1,2,3};
		Conjunto A= new Conjunto(vector);
		boolean resultadoReal = A.esVacio();
		boolean resultadoEsperado = false;
		assertEquals(resultadoReal,resultadoEsperado);
	}
	
	@Test
	void pruebaPerteneceElemento() {
		int[] vector = {1,2,3};
		Conjunto A= new Conjunto(vector);
		boolean resultadoReal = A.perteneceElemento(1);
		boolean resultadoEsperado = true;
		assertEquals(resultadoReal,resultadoEsperado);
	}
	
	@Test
	void pruebaAdd() {
		int[] vector = {1,2,3};
		Conjunto A= new Conjunto(vector);
		A.add(1);
		String resultadoReal = A.toString();
		String resultadoEsperado = "1 2 3 ";
		
		assertEquals(resultadoReal,resultadoEsperado);
		
		A.add(4);
		resultadoReal = A.toString();
		resultadoEsperado = "1 2 3 4 ";
		assertEquals(resultadoReal,resultadoEsperado);
	}
	
	@Test
	void pruebaEliminar() {
		int[] vector = {1,2,3};
		Conjunto A= new Conjunto(vector);
		A.eliminar(1);
		String resultadoReal = A.toString();
		String resultadoEsperado = "2 3 ";
		
		assertEquals(resultadoReal,resultadoEsperado);
		
		A.eliminar(4);
		resultadoReal = A.toString();
		resultadoEsperado = "2 3 4 ";
		assertEquals(resultadoReal,resultadoEsperado);
	}
}
