package nintendo.model;

<<<<<<< Updated upstream
public abstract class Console {
=======
import java.time.LocalDate;

public class Console {
>>>>>>> Stashed changes

	private String nom;
	private int prix;
	private LocalDate dateDeSortie;

	

	public Console(String nom, int prix, LocalDate dateDeSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateDeSortie = dateDeSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public LocalDate getDateDeSortie() {
		return dateDeSortie;
	}

	public void setDateDeSortie(LocalDate dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", dateDeSortie=" + dateDeSortie + "]";
	}
	
}
