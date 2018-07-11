import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SegreteriaController implements ActionListener{
	SegreteriaView seView=new SegreteriaView();
	Segreteria seg;
	tipoArticoloView artView=new tipoArticoloView();
	tipoArticolo obj=new tipoArticolo("","",100);
	Negozio neg= new Negozio("SportPrinc","via roma","Verona","ANDREA1");
	Negozio neg1= new Negozio("Sport1","via roma","Verona","ANDREA2");
	Negozio neg2= new Negozio("Sport2","via roma","Verona","ANDREA3");
	LoginController logCtrl;
	String stringa="";
	int prezzo;
	OrderTableView tab;
	Magazziniere mg;
	
	public SegreteriaController(Magazziniere mg,Segreteria seg,LoginController logCtrl) {	
		this.tab=new OrderTableView();
		this.mg=mg;
		this.seg=seg;
		this.logCtrl=logCtrl;
		seg.addNeg(neg);
		seg.addNeg(neg1);
		seg.addNeg(neg2);
		
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
			mg.NumberOfTypes();
			mg.addToTable(tab);
			
			
			
		}
		
		if(event.getSource() == seView.btn2) {
			
			tab.frame.setVisible(true);
			
			
			
			
		}
		
		if(event.getSource()==seView.btn3) {
			
			seg.seeNeg();
			
			
		}
		
		if(event.getSource()==seView.btn4) {
			
			seView.frame.setVisible(false);
			logCtrl.updateView(true);
			
		}
		
		
	}

}
