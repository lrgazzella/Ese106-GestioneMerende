package gestionemerende;

import java.time.LocalDateTime;
import java.util.Vector;

public class Ordine {
	
	
	private LocalDateTime giorno;
	private Classe classe;
	private Vector<Articolo> articoli;
	 
	public Ordine(LocalDateTime giorno) {
		this.giorno = giorno;
		articoli = new Vector<Articolo>(1,1);
	}

	public LocalDateTime getGiorno() {
		return giorno;
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
		String codice;
		codice = getClasse() + "-" + getGiorno().toString();
		return codice;
	}
	
	public void addArticolo(Articolo a){
		articoli.addElement(a);
	}
	
	
}
