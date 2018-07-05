import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoginController implements ActionListener{
	LoginView vista;
	SegreteriaView seView;
	SegreteriaController seCtrl;
	tipoArticoloView artView;
	Login log;
	String user="";
	String UserPassEntr;
	Magazziniere mg;
	NegozioController ng;
	Segreteria seg;
	ArrayList<Negozio> codNeg;
	
	
	public LoginController() {
		vista=new LoginView();
		log=new Login();
		this.seg=new Segreteria(mg);
		seView=new SegreteriaView();
		artView=new tipoArticoloView();
		this.mg = Magazziniere.getInstance();
	    seCtrl=new SegreteriaController(mg,seg);
	    ng=new NegozioController(mg);
		
	}
	
	public void updateView(boolean vision) {
		
		vista.frame.setVisible(vision);
		vista.addActionListener(this); 
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
         
         else if(vista.negozio.isSelected()) {
        	 codNeg=seg.getNegozio();
        	 user=log.getUtenti(2);
        	 vista.p1.setEnabled(true);
        	 if(event.getSource() == vista.btn1) {
        		 for(int i=0;i<codNeg.size();i++) {
        	 if(UserPassEntr.equals(codNeg.get(i).codResponsabile)) {
        		 vista.tf1.setText("PSW corretta");
        		 vista.frame.setVisible(false);
        		 ng.ngView.l3.setText(codNeg.get(i).nomNeg);
        		 ng.updateView();
        		 ng.addComboBox();
        		 
        	 }
        		 
        	 else {
        		 vista.tf1.setText("PSW errata");
        	 }
        	 }
        	 }
         }
         else {
        	 user=log.getUtenti(3);
        	 vista.p1.setEnabled(true);
        	 if(event.getSource() == vista.btn1) {
        	 if(UserPassEntr.equals(log.getPassword(3))) {
        		 vista.tf1.setText("PSW corretta");
        	 }
        	 else {
        		 vista.tf1.setText("PSW errata");
        	 }
        	 }
         }
		
	
	}
	
	
	

	
		

	

}
