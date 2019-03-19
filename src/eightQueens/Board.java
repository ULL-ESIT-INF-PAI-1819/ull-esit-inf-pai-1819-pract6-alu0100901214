/**
 * 
 */
package eightQueens;


import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * @author Sergio González Guerra
 *
 */
// Clase que calcula el problema de las 8 reinas y almacena sus soluciones.
public class Board extends JFrame{
	

	private int sol_[];	// Array que guarda una de las posibles soluciones en un solo vector.
	private ArrayList<Solution> solutions_ = new ArrayList<Solution>();	// Soluciones del problema de las 8 reinas.
	Clock clock_= new Clock();	// Objeto Clock que calcula el tiempo para cada solución
	private ArrayList<Long> times_ = new ArrayList<Long>();	// Array con los tiempos de cada solución
	private static final int size_ = 8;		// Tamaño de filas y columnas del tablero.
	private static final int nQueens_ = 8;	// Número de reinas que hay que poner.
	
	// Constructor vacío.
	Board(){
		sol_ = new int[size_];
	}
	
	//Devuelve una solución.
	Solution getSolution(int i) {
		return solutions_.get(i);
	}
	
	// Devuelve el número de soluciones.
	int getNumberOfSolutions() {return solutions_.size();}
	
	// Devuelve el tiempo que ha tardado en obtenerse una solución.
	public long getTime(int i){ return times_.get(i);}
	
	// Devuelve un String con la notación algebraica de la posición de cada reina de una solución.
	public String getAlgebaricNotation(int index) {
		String cad ="";
		for(int i=0; i< size_; i++) {
			for (int j = 0; j < size_; j++) {
				if(solutions_.get(index).getSolution(i, j)==1) {
					cad += AlgebaricNotation.values()[i*size_+j] + " ";
				}
			}
		}
		return cad;
	}
	
	//Calcula recursivamente todas las soluciones del problema de las 8 reinas y los guarda en un array.
	void queens(int k, ArrayList<Integer> col, ArrayList<Integer> diagAs, ArrayList<Integer> diagDes, Clock t) {
		
		if(k == nQueens_) {
			Solution auxSol = new Solution();
			auxSol.setSolution(sol_);
			solutions_.add(auxSol);
			t.stop();
			times_.add(t.getElapsedTime());
			t.restart();
			t.start();
		} else {
			for(int j = 1; j <= nQueens_; j++) {
				if(!content(col,j)&&(!content(diagAs,j+k))&&(!content(diagDes,j-k))) {
					sol_[k]=j;
					col.add(j);
					diagAs.add(j+k);
					diagDes.add(j-k);
					
					queens(k+1,col,diagAs,diagDes,t);
					
					col.remove(col.size()-1);
					diagAs.remove(col.size());
					diagDes.remove(col.size());
				}
			}
		}
		
	}
	
	// Comprueba que un array contenga el valor pasado por parametro.
	boolean content(ArrayList<Integer> v, int val) {
		for(int i=0; i<v.size(); i++) {
			if(v.get(i)==val)
				return true;
		}
		return false;
	}
	
}
