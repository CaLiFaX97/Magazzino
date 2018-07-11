import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class NegozioController implements ActionListener {
	NegozioView ngView;
	Magazziniere mg;
	tipoArticolo art;
	LoginController logCtrl;
	MagazziniereView magView;
	public NegozioController(Magazziniere mg,MagazziniereView magView,LoginController logCtrl) {
		this.mg=mg;
		this.magView=magView;
		this.logCtrl=logCtrl;
		ngView=new NegozioView(mg);
		
	}
	
	public void updateView() {
		ngView.frame.setVisible(true);
		ngView.addActionListener(this);
		
	}
	
	public void addComboBox() {
		for(int i=0;i<mg.numOrd;i++) {
		ngView.listOrdini.addItem((mg.prodotti.get(i)).toString());
		}

	}
	public void actionPerformed(ActionEvent event) {
		int quant=(Integer) (ngView.quantita.getSelectedItem());
		int id;
		int index=ngView.listOrdini.getSelectedIndex();
		if(event.getSource()==ngView.btn1) {
			
			
			
			if(index<0) {
				JOptionPane.showMessageDialog(null, "Oggetto non selezionato");
			}
			else {
			tipoArticolo art=mg.prodotti.get(index);
			mg.addOrderToMag(art, quant);
			mg.addToTableMag(magView,mg.getDate(),mg.hmap,art);
			
			JOptionPane.showMessageDialog(null, "Oggetto selezionato = "+art.toString()+"/nQuantita' selezionata = "+quant);
			}
			}
		if(event.getSource()==ngView.btn2) {
			ngView.frame.setVisible(false);
			logCtrl.updateView(true);
			
		}
		}
	}


