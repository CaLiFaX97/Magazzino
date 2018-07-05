import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NegozioView extends JFrame{
	JLabel l3;
	 JButton btn1;
	String title;
	 JFrame frame;
	 int[] qu = {1,2,3,4,5,6,7,8,9};


	 JComboBox listOrdini,quantita;
	
	 Magazziniere mg;
	 
	 public  NegozioView(Magazziniere mg) {
		 this.mg=mg;
		 

		 
		 frame=new JFrame("Segreteria");
		 
		  l3 = new JLabel();
		  listOrdini=new JComboBox();
		  quantita=new JComboBox();
		  for(int i=0;i<qu.length;i++) {
		  	quantita.addItem(qu[i]);
		  }
		  
		
		  btn1 = new JButton("Inserimento Ordine Articoli");
		  
		 
		  l3.setBounds(200, 80, 200, 30);
		  listOrdini.setBounds(30,120,370,20);
		  quantita.setBounds(400,120,60,20);
		  btn1.setBounds(120, 160, 200, 20);
		  
		  
		  frame.add(l3);
		  frame.add(listOrdini);
		  frame.add(quantita);
		  frame.add(btn1);
		
		  
		 
		  frame.setSize(800, 400);
		  frame.setLayout(null);
	 }
	 
	 
	 public void addActionListener(ActionListener e) {
		 btn1.addActionListener(e);
		 
	 }

}
