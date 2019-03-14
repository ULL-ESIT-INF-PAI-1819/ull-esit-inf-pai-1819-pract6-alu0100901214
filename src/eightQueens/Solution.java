/**
 * 
 */
package eightQueens;

/**
 * @author Sergio González Guerra
 *
 */
public class Solution {
	
	int[][] solutionQueens;
	
	void setSolution(int[] sol){
		
	}
	
	public String toString() {
		String cad="";
		for(int i = 0; i < solutionQueens.length; i++) {
			for (int j = 0; j < solutionQueens.length; j++) {
				cad += solutionQueens[i][j]+ " ";
			}
			cad += "\n";
		}
		return cad;
	}
	
}
