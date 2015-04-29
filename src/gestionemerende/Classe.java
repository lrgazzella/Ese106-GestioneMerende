package gestionemerende;

import java.util.Vector;

public class Classe {
	
	private String nome;
	private Vector<Ordine> ordini;
	
	public Classe(String nome) {
		if (nome != null)
			this.nome = nome;
		else
			throw new IllegalArgumentException("Il nome non può essere null");
		
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

	@Override
	public String toString() {
		return "Classe ["
				+ "nome=" + nome 
				+ ", numero ordini=" + getOrdini().size() 
				+ "]";
	}
	
}
