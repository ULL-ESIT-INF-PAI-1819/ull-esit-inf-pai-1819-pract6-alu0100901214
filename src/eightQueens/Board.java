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

import com.sun.javafx.collections.MappingChange.Map;

/**
 * @author Sergio González Guerra
 *
 */
public class Board extends JFrame{
	
	private int board_[][];
	private int sol_[];
	private ArrayList<Solution> solutions_ = new ArrayList<Solution>();
	Clock clock_= new Clock();
	private ArrayList<Long> times_ = new ArrayList<Long>();
	
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
	
	public long getTime(int i){ return times_.get(i);}
	
	public String getAlgebaricNotation(int index) {

	}
	
	void queens(int k, ArrayList<Integer> col, ArrayList<Integer> diagAs, ArrayList<Integer> diagDes) {
		
		if(k == nQueens_) {
			Solution auxSol = new Solution();
			auxSol.setSolution(sol_);
			solutions_.add(auxSol);
			clock_.stop();
			times_.add(clock_.getElapsedTime());
		} else {
			for(int j = 1; j <= nQueens_; j++) {
				if(!content(col,j)&&(!content(diagAs,j+k))&&(!content(diagDes,j-k))) {
					sol_[k]=j;
					col.add(j);
					diagAs.add(j+k);
					diagDes.add(j-k);
					
					queens(k+1,col,diagAs,diagDes);
					
					col.remove(col.size()-1);
					diagAs.remove(col.size());
					diagDes.remove(col.size());
				}
			}
		}
		
	}
	
	boolean content(ArrayList<Integer> v, int val) {
		for(int i=0; i<v.size(); i++) {
			if(v.get(i)==val)
				return true;
		}
		return false;
	}
	
	public void visualBoard(Solution sol, JFrame frame){
		boolean isBlue = true;
		boolean oddRow = false;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setSize(800, 800);
        JButton boton1 = new JButton("Pulsar aqui para cerrar ventana");
        ImageIcon blueBoxImg = new ImageIcon(getClass().getResource("BlueBox_x128.jpg"));
        ImageIcon greenBoxImg = new ImageIcon(getClass().getResource("GreenBox_x128.jpg"));
        ImageIcon blueQueenImg = new ImageIcon(getClass().getResource("BlueQueen_x128.jpg"));
        ImageIcon greenQueenImg = new ImageIcon(getClass().getResource("GreenQueen_x128.jpg"));
        
        frame.setLayout(new GridLayout(8,8));
        
        for (int i = 0; i < size_; i++) {
			for (int j = 0; j < size_; j++) {
				if(isBlue) {
					if(sol.getSolution(i, j)==1) {
						JLabel label = new JLabel();
						label.setIcon(blueQueenImg);
						frame.add(label);
						isBlue=false;
					}else {
						JLabel label = new JLabel();
						label.setIcon(blueBoxImg);
						frame.add(label);
						isBlue=false;
					}
				}else {
					if(sol.getSolution(i, j)==1) {
						JLabel label = new JLabel();
						label.setIcon(greenQueenImg);
						frame.add(label);
						isBlue=true;
					}else {
						JLabel label = new JLabel();
						label.setIcon(greenBoxImg);
						frame.add(label);
						isBlue=true;
					}
				}
			}
			if(oddRow==true) {
				isBlue=true;
				oddRow=false;
			}else {
				isBlue=false;
				oddRow=true;
			}
			
		}
        frame.pack();
        frame.setVisible(true);
        
        
	}
	
}
