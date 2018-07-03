import java.util.ArrayList;

public class Magazziniere {
	public ArrayList prodotti=new ArrayList();
	tipoArticolo art1;
	int numOrd=0;
	private static Magazziniere mag = null;
	
	public Magazziniere() {
		
	}
	
	
	public void addValueList(tipoArticolo art) {
		prodotti.add(new tipoArticolo(art.nomArt,art.desc,art.prezzo));	
	}
	public void NumberOfTypes() {
		numOrd++;
		
	}
	
	 public static Magazziniere getInstance( ) {
	      if (mag == null)
	          mag=new Magazziniere();
	      return mag;
	   }
	
	public void seeList() {
		System.out.println("Oggetti inseriti:");
		System.out.println("-----------------");
		for (int i = 0; i < prodotti.size(); i++) {
			art1=((tipoArticolo) (prodotti.get(i)));
			System.out.println(art1.nomArt);
			System.out.println(art1.desc);
			System.out.println(art1.prezzo);
			System.out.println("----------");
			
		}
	}

}
