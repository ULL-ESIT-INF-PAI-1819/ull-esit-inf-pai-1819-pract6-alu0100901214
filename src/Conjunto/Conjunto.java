/**
 * 
 */
package Conjunto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Sergio_Gonz�lez_Guerra
 *
 */
// Clase que representa un conjunto de valores enteros.
public class Conjunto {
	
	private ArrayList<Integer> conjunto_ = new ArrayList<Integer>();
	
	// Constructor Vac�o.
	Conjunto(){}
	
	// Constructor pasando un vector.
	Conjunto(int[] valores){
		for (int i = 0; i < valores.length; i++) {
			conjunto_.add(valores[i]);
		}
	}
	
	// Constructor pasando un archivo.
	Conjunto(File archivo) throws IOException{
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String cadena;
		cadena = br.readLine();
		String[] parts = cadena.split(" ");
		
		for (int i = 0; i < parts.length; i++) {
			conjunto_.add(Integer.parseInt(parts[i]));
		}
		
	}
	
	public String toString() {
		String cad="";
		for (int i = 0; i < conjunto_.size(); i++) {
			cad += conjunto_.get(i) + " ";
		}
		return cad;
	}
	
}