
public class HelloWorld {

	public static void main(String[] args) {
		
		// System.out.println("Hello World"); pour afficher hello world
		
		System.out.println("Hello World");
		//java language typer
		String chaine = "histoire";
		int num2 = 6;
		System.out.println(chaine + num2 *3);
		
		// la boucle if
		
		if(num2<5) {
			
			System.out.println("weweteb12");
		}
		else {
			System.out.println("naoual");
		}
			
			// creer un tableeau String[]
		
			String[] apprenants = new String [14];  // cre mes objet dans un tableau
			apprenants [0] = "ibrahim";
			apprenants [1] = "kevin";
			apprenants [2] = "yasmine";
			apprenants [3] = "soumaya";
			
			// afficher tout les apprenant
			//la boucle for pour parcourir le tableau
			
			for (int i = 0; i < apprenants.length; i++){
	
			//faire apparaitre l'apprenant num3
			System.out.println(apprenants [i]);
			}
			//boucle wile 
			// Et la solution c'est la boucle while ! Un peu d'anglais tout d'abord ! while veut dire "tant que". 
			//La boucle while est un peu un intermédiaire entre le boucle for et l'instruction if .
			//La boucle while est une boucle donc elle permet de répéter des instructions comme la boucle for.
			
			//boucle foreach pour chaque element du tableau
			for (String  UnApprenants:apprenants){// : est issu des different apprenant
				System.out.println(UnApprenants);
			}
			// importe de la class personne + instanciation lde la class de Personne
			
			Personne bobby=  new Personne("bobby", "kotick", "homme", 45, 104, 156);
			System.out.println(bobby.getFirsname());
			bobby.setFirsname("naoual");
			System.out.println(bobby.getFirsname());
			
	
	}}

	
