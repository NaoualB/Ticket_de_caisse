
/**
 * @author NBech
 *
 */
public class Personne {

	// initiation des variables
	
	private String firsname;
	private String lastname;
	private String sex;
	private int age;
	private int  weight;
	private int height;
	
	// constructeur 
	
	public Personne( String Firsname, String Lastname, String Sex, int Age, int Weight, int Height ) {
		// intenciation this= l'objet  parametre pour
		this.setFirsname(Firsname);
		this.setLastname(Lastname);
		this.setSex(Sex);
		this.setAge(Age);
		this.weight =(Weight);
		this.setHeight(Height);
		
}
	// getter modifier une variable definit

	public String getFirsname() {
		return firsname;
	}

	public void setFirsname(String firsname) {
		this.firsname = firsname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

	
	
}

