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
import java.util.Collections;

/**
 * @author Sergio_González_Guerra
 *
 */
// Clase que representa un conjunto de valores enteros.
public class Conjunto {
	
	private ArrayList<Integer> conjunto_ = new ArrayList<Integer>();
	// Constructor Vacío.
	Conjunto(){}
	
	// Constructor pasando un vector.
	Conjunto(int[] valores){
		for (int i = 0; i < valores.length; i++) {
			if(!conjunto_.contains(valores[i])&&(valores[i]>=0))
				conjunto_.add(valores[i]);
		}
		conjunto_.sort(null);
	}
	
	// Constructor pasando un archivo.
	Conjunto(File archivo) throws IOException{
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String cadena;
		cadena = br.readLine();
		String[] parts = cadena.split(" ");
		
		for (int i = 0; i < parts.length; i++) {
			if(!conjunto_.contains(Integer.parseInt(parts[i]))&&(Integer.parseInt(parts[i])>=0))
				conjunto_.add(Integer.parseInt(parts[i]));
		}
		conjunto_.sort(null);
		br.close();
	}
	
	public String toString() {
		String cad="";
		for (int i = 0; i < conjunto_.size(); i++) {
			cad += conjunto_.get(i) + " ";
		}
		return cad;
	}
	
	public int cardinal() {
		return conjunto_.size();
	}
	
	public boolean esVacio() {
		return conjunto_.size() == 0;
	}
	
	public boolean perteneceElemento(int val) {
		return conjunto_.contains(val);
	}
	
	public void add(int val) {
		
	}
}
