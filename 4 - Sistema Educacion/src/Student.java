
public class Student {

	public Student() {}

	private char[] idStudent = new char[9];
	private String name;
	private String surname;
	private String email;		

	// Student CONSTRUCTOR
	public Student(char[] idStudent, String name, String surname, String email) {
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	// -- getters -- //
	public char[] getIdStudent() {return this.idStudent;}
	public String getName() {return this.name;}
	public String getSurname() {return this.surname;}
	public String getEmail() {return this.email;}

	// -- setters -- //
	public void setIdStudent(char[] idStudent) {this.idStudent = idStudent;}
	public void setName(String name) {this.name = name;}
	public void setSurname(String surname) {this.surname = surname;}
	public void setEmail(String email) {this.email = email;}

	// Student toString
	public String toString() {
		String str;
		str =  String.valueOf(this.idStudent) + ", " + this.name + ", " +
				this.surname + ", " + this.email + ".\n";
		return str;
	}
}
