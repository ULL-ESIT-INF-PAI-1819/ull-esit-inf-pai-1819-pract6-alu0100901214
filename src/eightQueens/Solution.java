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
	private static final int size_ = 8;
	
	Solution(){
		solutionQueens = new int[size_][size_];
	}
	
	void setSolution(int[] sol){
		int k=0;
		boolean check=false;
		for (int j = 0; j < sol.length; j++) {
			for (int i = 0; i < size_; i++) {
				if((sol[k]-1==i)&&(!check)) {
					solutionQueens[i][j] = 1;
					if(k<sol.length-1)
						k++;
					check =true;
				}else {
					solutionQueens[i][j] = 0;
					
				}
			}
			check=false;
		}
	}
	
	int getSolution(int i, int j){return solutionQueens[i][j];}
	
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
