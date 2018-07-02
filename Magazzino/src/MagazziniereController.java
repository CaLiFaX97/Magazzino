import java.util.ArrayList;

public class MagazziniereController {
	tipoArticolo prod;
	Magazziniere mg;
	SegreteriaController segCrtl=new SegreteriaController(mg);
		
	
	
	
	public MagazziniereController(tipoArticolo prod,Magazziniere mg) {
		this.prod=segCrtl.objVal();
		this.mg=mg;
		
	}
	
	public void addObj(ArrayList arr) {
		
	}
	

}
