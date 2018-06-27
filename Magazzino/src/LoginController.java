import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JOptionPane;

import javafx.scene.control.TextField;

public class LoginController implements ActionListener{
	LoginView vista;
	Login log;
	String user="";
	String UserPassEntr;
	
	public LoginController(LoginView vista,Login log) {
		this.vista=new LoginView();
		this.log=new Login();
	}
	
	public void updateView() {
		
		vista.frame.setVisible(true);
		vista.btn1.addActionListener(this); 
		vista.magazzino.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event) {
		
		
		 UserPassEntr=new String(vista.p1.getPassword());
		
         if (vista.magazzino.isSelected()) {
        	 user=log.getUtenti(1);
        	 vista.p1.setEnabled(true);
        	 if(UserPassEntr.equals(log.getPassword(1))) {
        		 vista.tf1.setText("PSW corretta");
        	 }
        	 else {
        		 vista.tf1.setText("PSW errata");
        	 }
        	
        	 
         } else if(vista.segreteria.isSelected()) {
        	 user=log.getUtenti(0);
        	 vista.p1.setEnabled(true);
        	 if(UserPassEntr.equals(log.getPassword(0))) {
        		 vista.tf1.setText("PSW corretta");
        	 }
        	 else {
        		 vista.tf1.setText("PSW errata");
        	 }
         }
         else {
        	 user=log.getUtenti(2);
        	 vista.p1.setEnabled(true);
        	 if(UserPassEntr.equals(log.getPassword(2))) {
        		 vista.tf1.setText("PSW corretta");
        	 }
        	 else {
        		 vista.tf1.setText("PSW errata");
        	 }
         }
		
	
	}
	
	public void ActionPerformed(ActionEvent ae) {
		 if (vista.magazzino.isSelected())
        	 vista.p1.setEnabled(true);
		
		
	}
	

	
		

	

}
