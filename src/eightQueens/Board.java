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
	private static final int size_ = 8;
	Board(){
		
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
}
