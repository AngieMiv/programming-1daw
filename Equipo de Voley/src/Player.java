//import java.time.Instant;
//import java.time.LocalDate;

public class Player { 

	// --- player data
	private String name;
	private int age;
	//private Instant dateOfBirth;
	private Position position;
	private int number;
	private int points;
	private boolean isActive = true;

	// --- empty player constructor
	public Player() {};

	// --- player constructor
	public Player(String name, int age /*String dob*/, Position position, int number, int points, boolean isActive) {
		this.name = name;
		this.age = age;
		//this.dateOfBirth = Instant.parse(dob);
		this.position = position;
		this.number = number;
		this.points = points;
		this.isActive = isActive;

	} // end player constructor

	// --- player getters
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	//public Instant getDateOfBirth() {return this.dateOfBirth;}
	public Position getPosition() {return this.position;}
	public int getNumber() {return this.number;}
	public int getPoints() {return this.points;}
	public boolean getIsActive() {return this.isActive;}

	// --- player setters
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
	//public Instant setDateOfBirth(this.dateOfBirth = dob);
	public void setPosition(Position position) {this.position = position;}
	public void setNumber(int number) {this.number = number;}
	public void setPoints(int points) {this.points = points;}
	public void setIsActive(boolean isActive) {this.isActive = isActive;}

}
