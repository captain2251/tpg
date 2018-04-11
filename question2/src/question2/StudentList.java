package question2;

import java.util.Arrays;
import java.util.List;

public class StudentList {
	
	static Student stud1 = new Student("33","Tina","3.68");
	static Student stud2 = new Student("85","Louis","3.85");
	static Student stud3 = new Student("56","Samil","3.75");
	static Student stud4 = new Student("19","Samar","3.75");
	static Student stud5 = new Student("22","Lorry","3.76");
	
	private static List<Student> studentList = Arrays.asList(stud1,stud2,stud3,stud4,stud5);

	public static List<Student> getStudentList() {
		return studentList;
	}


}
