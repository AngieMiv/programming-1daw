
public class Subject {

	private int code;
	private String name;

	// Subject CONSTRUCTOR
	public Subject(int code, String name) {
		this.code = code;
		this.name = name;
	}

	// -- getters -- //
	public int getCode() {return this.code;}
	public String getName() {return this.name;}

	// -- setters -- //
	public void setCode(int code) {this.code = code;}
	public void setName(String name) {this.name = name;}
	
	//Subject toString
	public String toString() {
		String str;
		str = this.code + ", " + this.name + ".\n";
		return str;	
	}
}
