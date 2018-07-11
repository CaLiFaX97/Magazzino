import java.util.ArrayList;

public class MagazziniereController {
	tipoArticolo prod;
	Magazziniere mg;
	Segreteria seg;
	LoginController logCtrl;
	SegreteriaController segCrtl=new SegreteriaController(mg,seg,logCtrl);
	
		
	
	
	
	public MagazziniereController(tipoArticolo prod,Magazziniere mg) {
		this.prod=segCrtl.objVal();
		this.logCtrl=logCtrl;
		this.mg=mg;
		
	}
	
	
	

}
