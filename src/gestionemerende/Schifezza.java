package gestionemerende;

public class Schifezza extends Articolo{

	public Schifezza(String codice, String descrizione, double costoUnitario, double apportoCalorico) {
		super(codice, descrizione, costoUnitario, apportoCalorico);
	}

	@Override
	public String toString() {
		return "Schifezza [ " + super.toString() + "]";
	}
	
}
