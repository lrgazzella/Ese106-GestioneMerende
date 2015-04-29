package gestionemerende;

public class Panino extends Articolo{
	
	private boolean vegetariano;
	private boolean carneSuina;
	
	public Panino(String codice, String descrizione, double costoUnitario, double apportoCalorico, boolean vegetariano, boolean carneSuina) {
		super(codice, descrizione, costoUnitario, apportoCalorico);
		this.vegetariano = vegetariano;
		this.carneSuina = carneSuina;
	}

	
	public boolean isVegetariano() {
		return vegetariano;
	}

	public boolean isCarneSuina() {
		return carneSuina;
	}


	@Override
	public String toString() {
		return "Panino ["
				+ "vegetariano=" + vegetariano 
				+ ", carneSuina=" + carneSuina 
				+ ", " + super.toString() + "]";
	}
	
	
}
