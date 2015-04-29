package ese106;

import java.time.LocalDateTime;

import gestionemerende.*;

public class Ese106 {

	public static void main(String[] args) throws Exception {
		
		Istituto avolta = new Istituto("ITTS A.Volta");
		Classe informatica = new Classe("4ainf");
		LocalDateTime data = LocalDateTime.of(2015, 04, 29, 18, 13);
		Ordine primoOrdine = new Ordine(data, informatica);
		//Ordine secondoOrdine = new Ordine(data, informatica);
		Bibita acqua = new Bibita("01", "Acqua gassata", 0.5, 10, 0.5);
		Panino sandwich = new Panino("02", "Panino con salame", 1.2, 50, false, true);
		Schifezza patatine = new Schifezza("03", "Patatine San Carlo", 1.0, 70);
		
		avolta.addClasse(informatica);
		informatica.addOrdine(primoOrdine);
		//informatica.addOrdine(secondoOrdine);
		
		
		primoOrdine.addArticolo(acqua);
		primoOrdine.addArticolo(sandwich);
		primoOrdine.addArticolo(patatine);
		
		
		
		
		for(Classe c : avolta.getClassi()){
			System.out.println(c);
			for(Ordine o : c.getOrdini()){
				System.out.println(o);
				for(Articolo a : o.getArticoli()){
					System.out.println(a);
				}
			}
		}
		
		
		
		
	}

}
