
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class LoginView extends JFrame{
	 JLabel l3;
	 JButton btn1;
	 TextField tf1;
	 JPasswordField p1;
	 JFrame frame;
	 JRadioButton segreteria,magazzino,negozio,gestoreMagazzino;
	 public LoginView() {
	  frame = new JFrame("Login");
	  
	 
	  segreteria =new JRadioButton("Segreteria");
	  magazzino =new JRadioButton("Magazzino");
	  negozio =new JRadioButton("Negozio");
	  gestoreMagazzino =new JRadioButton("Gestore Magazzino");
	  
	  ButtonGroup bG =new ButtonGroup();
	  bG.add(segreteria);
	  bG.add(magazzino);
	  bG.add(negozio);
	  bG.add(gestoreMagazzino);
	  
	  tf1=new TextField();
	  l3 = new JLabel("Password");
	  p1 = new JPasswordField();
	  btn1 = new JButton("Login");
	 
	  l3.setBounds(80, 110, 200, 30);
	  p1.setBounds(300, 110, 200, 30);
	  btn1.setBounds(150, 160, 100, 30);
	  segreteria.setBounds(75, 70, 100, 30);
	  magazzino.setBounds(175, 70, 100, 30);
	  negozio.setBounds(275,70,70,30);
	  gestoreMagazzino.setBounds(365, 70, 200, 30);
	  tf1.setBounds(75,40,100,30);
	 
	  frame.add(segreteria);
	  frame.add(magazzino);
	  frame.add(negozio);
	  frame.add(gestoreMagazzino);
	  frame.add(tf1);
	  frame.add(l3);
	  frame.add(p1);
	  frame.add(btn1);
	  
	 
	  frame.setSize(800, 400);
	  frame.setLayout(null);
	  p1.setEnabled(false);
	 
	 }
	 
	 public void addActionListener(ActionListener e) {
		
		 btn1.addActionListener(e);
		 segreteria.addActionListener(e);
		 magazzino.addActionListener(e);
		 negozio.addActionListener(e);
		 gestoreMagazzino.addActionListener(e);
		 
	 }

	
	
	
}
	 
	 
