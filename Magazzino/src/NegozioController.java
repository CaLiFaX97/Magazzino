import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class NegozioController implements ActionListener {
	NegozioView ngView;
	Magazziniere mg;
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
			JOptionPane.showMessageDialog(null, "Quantita' selezionata"+" = "+quant);
			}
		}
	}


