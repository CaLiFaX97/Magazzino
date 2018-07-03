import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SegreteriaController implements ActionListener{
	SegreteriaView seView=new SegreteriaView();
	tipoArticoloView artView=new tipoArticoloView();
	tipoArticolo obj=new tipoArticolo("","",100);
	Magazziniere mg=new Magazziniere();
	String stringa="";
	int prezzo;
	public SegreteriaController() {	
		
		
	}
	
	public void updateView() {
		seView.frame.setVisible(true);
		seView.addActionListener(this);
		artView.addActionListener(this);
		
	}
	public tipoArticolo objVal() {
		return obj;
		
	}
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == seView.btn1) {
			seView.frame.setVisible(false);
			artView.frame.setVisible(true);
			
		}
		if(event.getSource() == artView.btn2) {
			seView.frame.setVisible(true);
			artView.frame.setVisible(false);
		}
		
		if(event.getSource() == artView.btn1) {
			if(!artView.tf2.getText().equals("")) {
				stringa=artView.tf2.getText();
				obj.nomArt=stringa;
						
			}
			
			if(!artView.tf3.getText().equals("")) {
				stringa=artView.tf3.getText();
				obj.desc=stringa;
			}
			
			if(!artView.tf4.getText().equals("")) {
				stringa=artView.tf4.getText();	
				prezzo=Integer.parseInt(stringa);	
				obj.prezzo=prezzo;
			}
			artView.tf2.setText("");
			artView.tf3.setText("");
			artView.tf4.setText("");
			
			
			mg.addValueList(obj);
			
			
			
		}
		
		if(event.getSource() == seView.btn2) {
			mg.seeList();
			
			
		}
		
		
	}

}
