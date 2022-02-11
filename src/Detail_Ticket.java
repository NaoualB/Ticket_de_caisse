import java.util.Scanner;

public class Detail_Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        System.out.println("--------------------------- Tiket de caisse ------------------------------");
		        System.out.println("|                                                                        |");
		        System.out.println("--------------------------------------------------------------------------");
		        
		        Scanner input = new Scanner(System.in);
		      
		        for(int i=1;i<=2;i++) {
		        System.out.print(" Entrez une description : ");
		        String description = input.nextLine();
		        }
		        
		        System.out.println(" Entrez une Quantite : ");
		        int quantite = input.nextInt();

		        System.out.print(" Saisir le prix : ");
		        Double prix = input.nextDouble();
		        
		       
		        Double total = (Double) ( quantite * prix);
		        System.out.println(" Montant total: "+ total + "€");
		        
		        

		        System.out.println("");
		        System.out.println("--------------------------- Merci de votre visite  ------------------------");
		        System.out.println("|                           et A Bientot                                  |");
		        System.out.println("---------------------------------------------------------------------------");
		    

	}

}
