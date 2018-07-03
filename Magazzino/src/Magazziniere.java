import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Magazziniere {
	public ArrayList prodotti=new ArrayList();
	tipoArticolo art1;
	int numOrd=0;
	String today;
	Calendar calendar;
	java.util.Date date;
	String strDate;
	static int i=0;
	Negozio neg=new Negozio();
	private static Magazziniere mag = null;
	
	public Magazziniere() {
		
	}
	
	
	public void addValueList(tipoArticolo art) {
		prodotti.add(new tipoArticolo(art.nomArt,art.desc,art.prezzo));	
	}
	public void NumberOfTypes() {
		numOrd++;
		
	}
	
	public void  addToTable(OrderTableView tab) {
		
		
			
		tab.model.addRow(new Object[] {getDate(), ((tipoArticolo)(prodotti.get(i))).desc,String.valueOf(((tipoArticolo)(prodotti.get(i))).prezzo) });
		i++;
		
			
	}
	
	public void addOrderToMag() {
		
	}
	
	public String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    
	    Date storedDate = new Date();
	    String strDate = dateFormat.format(storedDate);
        return strDate;  
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
