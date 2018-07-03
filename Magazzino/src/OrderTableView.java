import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javafx.scene.control.TableColumn;

public class OrderTableView extends JFrame{
	JFrame frame;
	JTable table;
	DefaultTableModel model;
	JScrollPane scrollPane;
	
    public OrderTableView() {
    	//headers for the table
        
         
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
