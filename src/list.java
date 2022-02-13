
import java.util.ArrayList;
import java.util.Scanner;

public class list {

	
  
	static Scanner scan;
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
        ArrayList<Produit> listDeProduit = new ArrayList<Produit>();
		
		 System.out.println(" Entrez une quantite : ");
		 Integer qte = Integer.parseInt(scan.nextLine());
		 System.out.println(" Afficher quantite : " +qte);
		 
		 Integer index=0;
		 Double total= 0.0;
		 
		 while (index!=qte){
			     System.out.print(" Entrez une description : ");
		        String description = scan.nextLine();
		        
		        System.out.println(" Entrez une Quantite : ");
		        Integer quantite = Integer.parseInt(scan.nextLine());
		     

		        System.out.print(" Saisir le prix : ");
		        Double prix = Double.parseDouble(scan.nextLine());
		        	
		         total += (Double) ( quantite * prix);
		        System.out.println(" Montant total: "+ total + "€");
		        
		        
		        
		        //Ici on utilise le principe de class en ajoutant un objet produit ds la liste des produits.
		        
		        listDeProduit.add(new Produit(description, quantite, prix));

		        
		        index ++;
			 
			 
		 }
		
		 
		 for(Produit produit: listDeProduit) {
			 System.out.println("Le prix : "+produit.getPrix() + " ");
		 }
		 
			 
		 }
		 
		 
		 

	}
	
	
	


