/**
 * 
 */
package eightQueens;

/**
 * @author Sergio González Guerra
 *
 */
public class Board {
	
	private int board_[][];
	//private int col_[];
	private int sol_[];
	//private int diagAs_[];
	//private int diagDes_[];
	private static final int size_ = 8;
	private static final int nQueens_ = 8;
	Board(){
		board_ = new int[size_][size_];
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
	
	void queens(int k, int col[], int diagAs[], int diagDes[]) {
		
	}
	
	boolean content(int v[], int val) {
		
	}
}
