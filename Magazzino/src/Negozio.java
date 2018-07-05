
import java.lang.Math;
public class Negozio {
	String nomNeg="";
	String sede="";
	String addrNeg="";
	String codResponsabile="";
	int cod;
	
	public Negozio(String nomNeg,String sede,String addrNeg,String codResponsabile) {
		this.nomNeg=nomNeg;
		this.sede=sede;
		this.addrNeg=addrNeg;
		this.codResponsabile=codResponsabile;
		cod = Math.abs(hashCode());
		
		
	}
	
	public String toString() {
		String s= nomNeg+" "+sede+" "+addrNeg+" "+codResponsabile;
		return s;
		
	}
	
	@Override
	public int hashCode() {
		
		return nomNeg.hashCode()^sede.hashCode()^addrNeg.hashCode()^codResponsabile.hashCode();
	}

	
	

}
