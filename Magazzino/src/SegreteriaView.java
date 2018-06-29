import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class SegreteriaView extends JFrame {
	JLabel l3;
	 JButton btn1,btn2,btn3;
	 JFrame frame;
	 public  SegreteriaView() {
		 frame=new JFrame("Segreteria");
		 
		  l3 = new JLabel("Segreteria");
		  btn1 = new JButton("Inserimento Articoli");
		  btn2 = new JButton("Movimenti Magazzino");
		  btn3= new JButton("Registro Ordini");
		 
		  l3.setBounds(180, 110, 200, 30);
		
		  btn1.setBounds(100, 160, 200, 20);
		  btn2.setBounds(100, 180, 200, 20);
		  btn3.setBounds(100, 200, 200, 20);
		  
		  frame.add(l3);
		  frame.add(btn1);
		  frame.add(btn2);
		  frame.add(btn3);
		  
		 
		  frame.setSize(400, 400);
		  frame.setLayout(null);
	 }
	 
	 
	 public void addActionListener(ActionListener e) {
		 btn1.addActionListener(e);
		 btn2.addActionListener(e);
	 }

}
