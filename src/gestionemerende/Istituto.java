package gestionemerende;

import java.util.Vector;

public class Istituto {
	
	private String nome;
	private Vector<Classe> classi;
	
	public Istituto(String nome) {
		if (nome != null)
			this.nome = nome;
		else
			throw new IllegalArgumentException("Il nome non può essere null");
		
		classi = new Vector<Classe>(1,1);
	}
	
	public String getNome() {
		return nome;
	}
	public Vector<Classe> getClassi() {
		return classi;
	}
	
	public void addClasse(Classe c){
		classi.addElement(c);
	}

	@Override
	public String toString() {
		return "Istituto ["
				+ "nome=" + nome 
				+ ", numero classi=" + getClassi().size()
				+ "]";
	}

}
