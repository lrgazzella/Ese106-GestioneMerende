package gestionemerende;

public class Articolo {
	
	private String codice;
	private String descrizione;
	private double costoUnitario;
	private double apportoCalorico;
	
	public Articolo(String codice, String descrizione, double costoUnitario, double apportoCalorico) {
		if (codice != null)
			this.codice = codice;
		else
			throw new IllegalArgumentException("Il codice non può essere null");
		
		if (descrizione != null)
			this.descrizione = descrizione;
		else
			throw new IllegalArgumentException("La descrizione non può essere null");
		
		if (costoUnitario >= 0)
			this.costoUnitario = costoUnitario;
		else
			throw new IllegalArgumentException("Il costo unitario deve essere maggiore o uguale a 0");
		
		if (apportoCalorico > 0)
			this.apportoCalorico = apportoCalorico;
		else
			throw new IllegalArgumentException("L'apporto calorico deve essere maggiore a 0");
		
		
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

	@Override
	public String toString() {
		return "Articolo ["
				+ "codice=" + codice 
				+ ", descrizione=" + descrizione
				+ ", costoUnitario=" + costoUnitario 
				+ ", apportoCalorico=" + apportoCalorico + "]";
	}
	
}
