/**
 * 
 */
package Conjunto;

import java.util.ArrayList;

/**
 * @author Sergio_González_Guerra
 *
 */
// Clase que representa un conjunto de valores enteros.
public class Conjunto {
	
	private ArrayList<Integer> conjunto_ = new ArrayList<Integer>();
	
	// Constructor Vacío.
	Conjunto(){}
	
	Conjunto(int[] valores){
		for (int i = 0; i < valores.length; i++) {
			conjunto_.add(valores[i]);
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
