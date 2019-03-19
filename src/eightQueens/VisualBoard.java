package eightQueens;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Sergio González Guerra
 *
 */
public class VisualBoard extends JFrame{
	
	private static final int size_ = 8;
	int k=-1;
	
	public VisualBoard(Board b) {
		ImageIcon blueBoxImg = new ImageIcon(getClass().getResource("img/BlueBox_x64.jpg"));
        ImageIcon greenBoxImg = new ImageIcon(getClass().getResource("img/GreenBox_x64.jpg"));
        ImageIcon blueQueenImg = new ImageIcon(getClass().getResource("img/BlueQueen_x64.jpg"));
        ImageIcon greenQueenImg = new ImageIcon(getClass().getResource("img/GreenQueen_x64.jpg"));
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(8,8));
		JPanel p2 = new JPanel(new BorderLayout());
		JPanel pTexto = new JPanel(new BorderLayout());
		// HACER MENU
		JButton buttonNext = new JButton("NEXT");
		buttonNext.addActionListener(new ActionListener() {@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
			boolean isBlue = true;
			boolean oddRow = false;
			if(k<b.getNumberOfSolutions()-1) {
				k++;
			}else {
				k=0;
			}
			
			Solution sol = b.getSolution(k);
			pTexto.removeAll();
			pTexto.revalidate();
			p1.removeAll();
			p1.revalidate();
			JLabel texto1 = new JLabel("   Solución Nº: " + k + "    ");
			JLabel texto2 = new JLabel(b.getTime(k) + " ms    ");
			JLabel texto3 = new JLabel(b.getAlgebaricNotation(k));
			pTexto.add(texto1, BorderLayout.WEST);
			pTexto.add(texto2, BorderLayout.CENTER);
			pTexto.add(texto3, BorderLayout.EAST);
			 for (int i = 0; i < size_; i++) {
					for (int j = 0; j < size_; j++) {
						if(isBlue) {
							if(sol.getSolution(i, j)==1) {
								JLabel label = new JLabel();
								label.setIcon(blueQueenImg);
								p1.add(label);
								isBlue=false;
							}else {
								JLabel label = new JLabel();
								label.setIcon(blueBoxImg);
								p1.add(label);
								isBlue=false;
							}
						}else {
							if(sol.getSolution(i, j)==1) {
								JLabel label = new JLabel();
								label.setIcon(greenQueenImg);
								p1.add(label);
								isBlue=true;
							}else {
								JLabel label = new JLabel();
								label.setIcon(greenBoxImg);
								p1.add(label);
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
		}});
		p2.add(pTexto, BorderLayout.EAST);
		p2.add(buttonNext);
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b = new Board();
        ArrayList<Integer> col = new ArrayList<Integer>();
		ArrayList<Integer> diagAs = new ArrayList<Integer>();
		ArrayList<Integer> diagDes = new ArrayList<Integer>();
		Clock t= new Clock();
		t.start();
		b.queens(0, col, diagAs, diagDes, t);
		
		VisualBoard frame = new VisualBoard(b);
		frame.setTitle("Chess");
		frame.setSize(540,580);
		//frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
