package question2;

import java.util.Comparator;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.println("Before Sort");
		StudentList.getStudentList().forEach(student -> System.out.println(student.getId()+" " +student.getName() +" " + student.getScore()));
		StudentList.getStudentList().sort(Comparator.comparing(Student::getScore, Comparator.reverseOrder()).thenComparing(Student::getName));
		System.out.println("\nAfter Sort");
		StudentList.getStudentList().forEach(student -> System.out.println(student.getId()+" " +student.getName() +" " + student.getScore()));
	}

}
