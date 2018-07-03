
public class NegozioController {
	NegozioView ngView;
	Magazziniere mg;
	public NegozioController(Magazziniere mg) {
		this.mg=mg;
		ngView=new NegozioView(mg);
		
	}
	
	public void updateView() {
		ngView.frame.setVisible(true);
		
	}
	
	public void addComboBox() {
		for(int i=0;i<mg.numOrd;i++) {
		ngView.listOrdini.addItem((mg.prodotti.get(i)).toString());
		}

	}
}
