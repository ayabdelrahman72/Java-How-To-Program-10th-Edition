package GradeBook;

public class GradeBookTest {

	public static void main(String[] args) {
		int [][] gradesArray= {{87,96,70},
				                 {68,87,90},
				                 {94,100,90},
				                 {50,65,68}
		};
		GradeBook gradebook= new GradeBook("CS101 Introduction to Java Programming",gradesArray);
		System.out.printf("Welcome to the grade book for %s %n",gradebook.getCourseName());
		gradebook.processGrades();

	}

}
