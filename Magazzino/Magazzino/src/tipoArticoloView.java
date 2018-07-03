import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tipoArticoloView extends JFrame {
	
		JLabel l1,l2,l3,l4;
		 JButton btn1,btn2;
		 JTextField tf2,tf3,tf4;
		 JFrame frame;
		 public  tipoArticoloView() {
			 frame=new JFrame("Tipo Articolo");
			 
			  l1 = new JLabel("Inserire i dettagli sul articolo");
			  l2 = new JLabel("Nome articolo");
			  l3 = new JLabel("descrizione articolo");
			  l4 = new JLabel("prezzo articolo");
			  
			 
			  tf2 =new JTextField(30);
			  tf3 =new JTextField(100);
			  tf4 =new JTextField(15);
			  
			  btn1 = new JButton("Inserimento Articoli");
			  btn2 = new JButton("Indietro");
			 
			 
			  l1.setBounds(180, 80, 200, 30);
			  l2.setBounds(80, 130, 200, 30);
			  l3.setBounds(80, 150, 200, 30);
			  l4.setBounds(80, 170, 200, 30);
			  
			
			  tf2.setBounds(250,135,200,20);
			  tf3.setBounds(250,155,400,20);
			  tf4.setBounds(250,175,100,20);
			
			  btn1.setBounds(80, 200, 200, 20);
			  btn2.setBounds(280, 200, 150, 20);
			  
			  frame.add(l1);
			  frame.add(l2);
			  frame.add(l3);
			  frame.add(l4);
			  
			
			  frame.add(tf2);
			  frame.add(tf3);
			  frame.add(tf4);
			  
			  
			  frame.add(btn1);
			  frame.add(btn2);
			  
			  
			 
			  frame.setSize(700, 400);
			  frame.setLayout(null);
			  frame.setVisible(false);
		 }
		 
		 public void addActionListener(ActionListener e) {
			 btn1.addActionListener(e);
			 btn2.addActionListener(e);
			 
		 }

		
	
	

}
