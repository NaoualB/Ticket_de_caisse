import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

static Scanner scanOne=new Scanner(System.in);
		
		public static void main(String[] args) {
			
	List<Tiket> des = new ArrayList<>();
	String answer;
	
	 System.out.println(" ajouter : ");
	 answer = scanOne.nextLine();
	 
	 do {Tikett aTiket = new Tiket();
	 
	 System.out.println(" Entrez une description : ");
	 aTiket.setDescription(scanOne.nextLine());
	 System.out.println(" Entrez une quantite : ");
	 aTiket.setDescription(scanOne.nextLine());
	 System.out.println(" Entrez un prix : ");
	 aTiket.setDescription(scanOne.nextLine());
	 System.out.println(" Entrez une description : ");
	 aTiket.setDescription(scanOne.nextLine());
	 
	 

			 ArrayList<Integer> quantite = new ArrayList<>();
			 ArrayList<Double> prix = new ArrayList<>();
			 
			 for(int i=1;i<=5;i++) {
				 
				 System.out.println(" Entrez une description : ");
				 description.add(scan.nextLine());
				 
				 System.out.println(" Entrez une Quantite : ");
				 quantite.add(scan.nextInt());
				 
				 System.out.println(" Entrez un prix : ");
				 prix.add(scan.nextDouble());
			 }
			 
			 
				 
			 

	}

}
