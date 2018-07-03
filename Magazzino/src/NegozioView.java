import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NegozioView extends JFrame{
	JLabel l3;
	 JButton btn1;
	 JFrame frame;
	 JComboBox listOrdini;
	 Magazziniere mg;
	 public  NegozioView(Magazziniere mg) {
		 this.mg=mg;
		 

		 
		 frame=new JFrame("Segreteria");
		 
		  l3 = new JLabel("Negozio");
		  listOrdini=new JComboBox();
		  btn1 = new JButton("Inserimento Ordine Articoli");
		  
		 
		  l3.setBounds(200, 80, 200, 30);
		  listOrdini.setBounds(120,120,200,30);
		  btn1.setBounds(120, 160, 200, 20);
		  
		  
		  frame.add(l3);
		  frame.add(listOrdini);
		  frame.add(btn1);
		
		  
		 
		  frame.setSize(400, 400);
		  frame.setLayout(null);
	 }
	 
	 
	 public void addActionListener(ActionListener e) {
		 btn1.addActionListener(e);
		 
	 }

}
