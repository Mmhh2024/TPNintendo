package nintendo.model;

public class Boutique {
	private String nom;
	private Adresse adresse;
	
	public Boutique(String nom, Adresse adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + adresse + "]";
	}

}
