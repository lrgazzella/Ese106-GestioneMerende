package gestionemerende;

import java.time.LocalDateTime;
import java.util.Vector;

public class Ordine {
	
	private LocalDateTime data;
	private Classe classe;
	private Vector<Articolo> articoli;
	 
	public Ordine(LocalDateTime data, Classe classe) {
		if (data != null)
			this.data = data;
		else
			throw new IllegalArgumentException("La data non può essere null");
		
		if (classe != null)
			this.classe = classe;
		else
			throw new IllegalArgumentException("La classe non può essere null");
		
		articoli = new Vector<Articolo>(1,1);
	}

	public LocalDateTime getGiorno() {
		return data;
	}
	public Classe getClasse() {
		return classe;
	}
	public Vector<Articolo> getArticoli() {
		return articoli;
	}	
	public double getCostoTotale(){
		double costo = 0;
		for(Articolo q : articoli){
			costo += q.getCostoUnitario();
		}
		return costo;
	}
	public int getNumeroArticoli(){
		return getArticoli().size();
	}
	public String getCodice(){ 
		
		int anno = getGiorno().getYear();
		int mese = getGiorno().getMonthValue();
		int giorno = getGiorno().getDayOfMonth();
		
		return getClasse().getNome() + "-" + anno + mese + giorno;
		 
	}
	
	public void addArticolo(Articolo a){
		articoli.addElement(a);
	}

	@Override
	public String toString() {
		return "Ordine ["
				+ "data=" + data 
				+ ", classe=" + classe
				+ ", costo totale=" + getCostoTotale()
				+ ", numero articoli=" + getNumeroArticoli()
				+ ", codice=" + getCodice() 
				+ "]";
	}
	
}
