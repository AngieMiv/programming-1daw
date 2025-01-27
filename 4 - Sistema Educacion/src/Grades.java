
public class Grades {

	private int trimester[] = new int[]{1, 2, 3};
	private int course;
	private Student student;
	private Subject subject;
	private int grade[] = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	public Grades(int trimester[], int course, Student student, Subject subject, int grade[]) {
		this.trimester = trimester;
		this.course = course;
		this.student = student;
		this.subject = subject;
		this.grade = grade;
	}

	// -- getters -- //
	public int[] getTrimester() {return this.trimester;}
	public int getCourse() {return this.course;}
	public Student getStudent() {return this.student;}
	public Subject getSubject() {return this.subject;}
	public int[] getGrade() {return this.grade;}

	// -- setters -- //
	public void setTrimester(int trimester[]) {this.trimester = trimester;}
	public void setCourse(int course) {this.course = course;}
	public void setStudent(Student student) {this.student = student;}
	public void setSubject(Subject subject) {this.subject = subject;}
	public void setGrade(int grade[]) {this.grade = grade;}

	// Grades toString
	public String toString() {
		String str;
		str = String.valueOf(this.trimester) + ", " + this.course + ", " +
				this.student + ", " + this.subject + ", " + String.valueOf(this.grade) + ".\n";
		return str;
	}

}
