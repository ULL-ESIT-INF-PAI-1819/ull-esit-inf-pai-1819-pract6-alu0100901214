/**
 * 
 */
package Conjunto;

import java.io.File;
import java.io.IOException;

/**
 * @author sackk
 *
 */
public class UsaConjunto {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Conjunto A = new Conjunto();
		System.out.println("A: " + A);
		int[] vector = {1,2,3};
		Conjunto B = new Conjunto(vector);
		System.out.println("B: " +B);
		File archivo = new File("conjunto1.txt");
		Conjunto C= new Conjunto(archivo);
		System.out.println("C: " + C);
	}

}
