
public class Tiket {


	private String description;
	private int  quantite;
	private double prix;
	private double total;
	
	// constructeur 
	
	public Tiket() {
		
	}
	public Tiket( String Description,  int Quantite, double Prix, Double Total) {
		// intenciation this= l'objet  parametre pour
		
		this.description = Description;
		this.quantite = Quantite;
		this.prix= Prix;
		this.total=Total;
		
	
		
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(String string) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}


	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	

}
