package gestionemerende;

import java.util.Vector;

public class Classe {
	
	private String nome;
	private Vector<Ordine> ordini;
	
	public Classe(String nome) {
		this.nome = nome;
		ordini = new Vector<Ordine>(1,1);
	}

	
	public String getNome() {
		return nome;
	}

	public Vector<Ordine> getOrdini() {
		return ordini;
	}
	
	public void addOrdine(Ordine o) throws Exception{
		boolean ordineEffettuato = false;
		for(Ordine q : ordini){
			if( q.getGiorno().isEqual(o.getGiorno()) ){
				ordineEffettuato = true;
			}
		}
		
		if( ordineEffettuato != true ){
			ordini.addElement(o);
		}else{
			throw new Exception("Non puoi effettuare 2 ordini nello stesso giorno");
		}
		
		
	}
	
}
