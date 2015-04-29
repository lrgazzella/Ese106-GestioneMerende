package gestionemerende;

public class Articolo {
	
	private String codice;
	private String descrizione;
	private double costoUnitario;
	private double apportoCalorico;
	
	public Articolo(String codice, String descrizione, double costoUnitario, double apportoCalorico) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.costoUnitario = costoUnitario;
		this.apportoCalorico = apportoCalorico;
	}

	
	public String getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public double getApportoCalorico() {
		return apportoCalorico;
	}
	

}
