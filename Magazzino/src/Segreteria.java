
public class Segreteria {
	private String[]oggetto=new String[10];
	private double[]prezzo=new double[10];
	public Segreteria() {
		
	}
	public double getPrezzo(int pos) {
		return prezzo[pos];
	}
	public String getOrdine(int pos) {
		return oggetto[pos];
	}

}
