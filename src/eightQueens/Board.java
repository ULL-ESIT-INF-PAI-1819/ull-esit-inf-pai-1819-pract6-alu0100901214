/**
 * 
 */
package eightQueens;

import java.util.ArrayList;

/**
 * @author Sergio González Guerra
 *
 */
public class Board {
	
	private int board_[][];
	private int sol_[];
	private ArrayList<Solution> solutions_ = new ArrayList<Solution>();
	private static final int size_ = 8;
	private static final int nQueens_ = 8;
	
	Board(){
		board_ = new int[size_][size_];
		sol_ = new int[size_];
		for(int i = 0; i < size_; i++) {
			for(int j = 0; j < size_; j++) {
				board_[i][j] = 0;
			}
		}
	}
	
	public String toString() {
		String cad="";
		for(int i = 0; i < size_; i++) {
			for(int j = 0; j < size_; j++) {
				cad+= board_[i][j] + " ";
			}
			cad+="\n";
		}
		return cad;
	}
	
	Solution getSolution(int i) {
		return solutions_.get(i);
	}
	
	void queens(int k, ArrayList<Integer> col, ArrayList<Integer> diagAs, ArrayList<Integer> diagDes) {
		
	}
	
	boolean content(ArrayList<Integer> v, int val) {
		for(int i=0; i<v.size(); i++) {
			if(v.get(i)==val)
				return true;
		}
		return false;
	}
}
