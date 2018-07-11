import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class NegozioController implements ActionListener {
	NegozioView ngView;
	Magazziniere mg;
	tipoArticolo art;
	public NegozioController(Magazziniere mg) {
		this.mg=mg;
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
		if(event.getSource()==ngView.btn1) {
			int quant=(Integer) (ngView.quantita.getSelectedItem());
			int id;
			
			int index=ngView.listOrdini.getSelectedIndex();
			if(index<0) {
				JOptionPane.showMessageDialog(null, "Oggetto non selezionato");
			}
			else {
			tipoArticolo art=mg.prodotti.get(index);
			
			JOptionPane.showMessageDialog(null, "Oggetto selezionato = "+art.toString()+"/nQuantita' selezionata = "+quant);
			}
			}
		}
	}


