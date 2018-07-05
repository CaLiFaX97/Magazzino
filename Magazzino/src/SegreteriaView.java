import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SegreteriaView extends JFrame {
	JLabel l3;
	 JButton btn1,btn2,btn3,btn4;
	 JFrame frame;
	 JPanel south;
	
	 public  SegreteriaView() {
		 
		  l3 = new JLabel("Segreteria");
		 
		  frame= new JFrame("Segreteria");
		
		  
		  
	      
	      
	      

		  
		  btn1 = new JButton("Inserimento Articoli");
		  btn2 = new JButton("Movimenti Magazzino");
		  btn3= new JButton("Inserisci negozio");
		  btn4 = new JButton("Logout");
		  
		  south = new JPanel();
		
		  
		  south.add(l3);
		  south.add(btn1);
		  south.add(btn1);
		  south.add(btn2);
		  south.add(btn3);
		  south.add(btn4);
		  
		  
		  
		  
		  
		 
		  
		  l3.setBounds(180, 110, 200, 30);
		
		  btn1.setBounds(100, 160, 200, 20);
		  btn2.setBounds(100, 180, 200, 20);
		  btn3.setBounds(100, 200, 200, 20);
		  btn4.setBounds(100,250,200,20);
		  
		  frame.add(south,BorderLayout.CENTER);
		  
		  
		 // frame.add(l3);
		  //frame.add(btn1);
		  //frame.add(btn2);
		  //frame.add(btn3);
		 // frame.add(btn4);
		  
		  
		  south.setLayout(null);
		 
		  south.setPreferredSize(new Dimension(400,400));
		
		  south.setVisible(true);
		 
		  frame.setSize(800, 800);
		  frame.pack();
		 
		  //frame.setLayout(null);
		 
	 }
	 
	 
	 public void addActionListener(ActionListener e) {
		 
		 btn1.addActionListener(e);
		 btn2.addActionListener(e);
		 btn3.addActionListener(e);
		 btn4.addActionListener(e);
	 }
		 

}
