/**
 * 
 */
package Conjunto;

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
	
	Conjunto(int[] valores){
		
	}
	
	public String toString() {
		String cad="";
		for (int i = 0; i < conjunto_.size(); i++) {
			cad += conjunto_.get(i) + " ";
		}
		return cad;
	}
	
}
