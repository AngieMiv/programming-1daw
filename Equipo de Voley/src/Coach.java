
public class Coach {
	
	// --- Coach data
	public String name;
	private int age;
	private int nAwards;
	
	// --- empty coach constructor
	public Coach() {}

	// --- coach Constructor
	public Coach(String name, int age, int nAwards) {
		super();
		this.name = name;
		this.age = age;
		this.nAwards = nAwards;
	} // end coach constructor

	// --- coach getters
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	public int getNumAwards() {return this.nAwards;}

	// --- coach setters
	public void setName(String coachName) {this.name = coachName;}
	public void setAge(int coachAge) {this.age = coachAge;}
	public void setNumAwards(int nCoachAwards) {this.nAwards = nCoachAwards;}
	
	/*
	 * public String infoCoach(Coach c) { String info = new String(getName() +
	 * getAge() + getNumAwards()); return info; }
	 */

	
	
} // end public class Coach
