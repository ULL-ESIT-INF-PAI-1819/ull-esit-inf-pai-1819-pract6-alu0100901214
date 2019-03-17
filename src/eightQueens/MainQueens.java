/**
 * 
 */
package eightQueens;

import javax.swing.*;

import com.sun.glass.events.KeyEvent;

import javafx.event.ActionEvent;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Sergio González Guerra
 *
 */
public class MainQueens extends JFrame{
	
	JButton button1;
	BorderLayout scheme;
	private static int i=-1;
	static Boolean otro = false;
	
	public MainQueens() {
		super("Menu");
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
		button1 = new JButton("North");
		button1.addActionListener (new ActionListener(){@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
			// TODO Auto-generated method stub
			i++;
			if(otro==false) {
				otro = true;
			}
		} });
		
		add(button1, BorderLayout.NORTH);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub     
        Board b = new Board();
        ArrayList<Integer> col = new ArrayList<Integer>();
		ArrayList<Integer> diagAs = new ArrayList<Integer>();
		ArrayList<Integer> diagDes = new ArrayList<Integer>();
		Clock times = new Clock();
		times.start();
		b.queens(0, col, diagAs, diagDes);
		Solution sol;
    	//Scanner scanner = new Scanner(System.in);
	    //int i=0;
	    //System.out.println("Que solución quiere mostrar?: ");
	    //String readString = scanner.nextLine();
	    //sol = b.getSolution(Integer.parseInt(readString));
		new MainQueens();
		boolean check=false;
		while(i<=90) {
			System.out.println(i);
			if(otro) {
				System.out.println(i);
				JFrame frame= new JFrame("Chess");
				System.out.println(i);
				System.out.println(b.getTime(i));
				sol = b.getSolution(i);
				
			    b.visualBoard(sol,frame);
			    otro=false;
			}
		}
		
		
		
		
	}

}
