
public class Produit {
	
	public String desc;
	public Integer qte;
	public Double prix;
	
	public Produit() {
		
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getQte() {
		return qte;
	}
	public void setQte(Integer qte) {
		this.qte = qte;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Produit(String desc, Integer qte, Double prix) {
		super();
		this.desc = desc;
		this.qte = qte;
		this.prix = prix;
	}
	
	

}
