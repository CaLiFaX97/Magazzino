import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MagazziniereView extends JFrame{
	JLabel l3;
	 JButton btn1;
	 TextField tf1;
		JTable table;
		DefaultTableModel model;
		JScrollPane scrollPane;
	 JFrame frame;
	public MagazziniereView() {
		frame=new JFrame("Magazzino");
		btn1=new JButton("");
		
		 //actual data for the table in a 2d array
        //create table with data
    	frame=new JFrame();
    	model = new DefaultTableModel();
        JTable table = new JTable(model);

        model.addColumn("Col1");
        model.addColumn("Col2");
        model.addColumn("Col3");

        model.addRow(new Object[] { "Data spedizione", "Numero spedizione","codice articolo" });

         
        //add the table to the frame
    	scrollPane = new JScrollPane(table);
    	table.setFillsViewportHeight(true);
    	frame.add(table);
         
        frame.setTitle("Ordini");
        frame.setSize(400,400);
        frame.setVisible(false);

  }
		
		
	}


