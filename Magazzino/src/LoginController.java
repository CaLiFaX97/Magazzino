import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JOptionPane;

import javafx.scene.control.TextField;

public class LoginController implements ActionListener{
	LoginView vista;
	SegreteriaView seView;
	SegreteriaController seCtrl;
	Login log;
	String user="";
	String UserPassEntr;
	
	public LoginController(LoginView vista,Login log,SegreteriaView seView,SegreteriaController seCtrl) {
		this.vista=new LoginView();
		this.log=new Login();
		this.seView=new SegreteriaView();
	    this.seCtrl=new SegreteriaController(seView);
		
	}
	
	public void updateView(boolean vision) {
		
		vista.frame.setVisible(vision);
		vista.btn1.addActionListener(this); 
		vista.segreteria.addActionListener(this);
		vista.magazzino.addActionListener(this);
		vista.gestoreMagazzino.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event) {
		
		
		 UserPassEntr=new String(vista.p1.getPassword());
		
         if (vista.magazzino.isSelected()) {
        	 user=log.getUtenti(1);
        	 vista.p1.setEnabled(true);
        	 if(event.getSource() == vista.btn1) {
        	 if(UserPassEntr.equals(log.getPassword(1))) {
        		 vista.tf1.setText("PSW corretta");
        	 }
        	 else {
        		 vista.tf1.setText("PSW errata");
        	 }
        	 }
        	
        	 
         } else if(vista.segreteria.isSelected()) {
        	 user=log.getUtenti(0);
        	 vista.p1.setEnabled(true);
        	 if(event.getSource() == vista.btn1) {
        	 if(UserPassEntr.equals(log.getPassword(0))) {
        		 vista.tf1.setText("PSW corretta");
        		 vista.frame.setVisible(false);
        		 seCtrl.updateView();
        		 
        	 }
        	 else {
        		 vista.tf1.setText("PSW errata");
        	 }
        	 }
         }
         else {
        	 user=log.getUtenti(2);
        	 vista.p1.setEnabled(true);
        	 if(event.getSource() == vista.btn1) {
        	 if(UserPassEntr.equals(log.getPassword(2))) {
        		 vista.tf1.setText("PSW corretta");
        	 }
        	 else {
        		 vista.tf1.setText("PSW errata");
        	 }
        	 }
         }
		
	
	}
	
	
	

	
		

	

}
