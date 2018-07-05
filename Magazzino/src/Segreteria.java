import java.util.ArrayList;

public class Segreteria {
	Magazziniere mg;
	
	private ArrayList<Negozio>negozi=new ArrayList<Negozio>();
	
	public Segreteria(Magazziniere mg) {
		this.mg=mg;
		
	}
	
	public void addNeg(Negozio neg) {
		negozi.add(neg);
		//System.out.println(negozi.get(0).toString());
		
	}
	
	public void seeNeg() {
		for(int i =0;i<negozi.size();i++) {
		System.out.println(negozi.get(i).toString());
		System.out.println(negozi.get(i).cod);
		
		}
		
	}
	
	public ArrayList getNegozio() {
		
		return negozi;
	}
	

}
