package gestionemerende;

public class Bibita extends Articolo{
	
	private double quantita;

	public Bibita(String codice, String descrizione, double costoUnitario, double apportoCalorico, double quantita) {
		super(codice, descrizione, costoUnitario, apportoCalorico);
		this.quantita = quantita;
	}

	public double getQuantita() {
		return quantita;
	}

	@Override
	public String toString() {
		return "Bibita ["
				+ "quantita=" + quantita
				+ ", " + super.toString() + "]";
	}
	
	
	
}
