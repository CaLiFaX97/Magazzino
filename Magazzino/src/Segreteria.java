import java.util.ArrayList;

public class Segreteria {
	tipoArticolo art;
	Magazziniere mg;
	SegreteriaController segCtrl=new SegreteriaController(mg);
	tipoArticolo ogg=segCtrl.objVal();
	ArrayList arrayArt=new ArrayList();
	
	public Segreteria(Magazziniere mg) {
		this.mg=mg;
		
		
		
	}
	

}
