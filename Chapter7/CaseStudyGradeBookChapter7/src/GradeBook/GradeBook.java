package GradeBook;

public class GradeBook {
	private String courseName;
   private int[][] grades;
   public GradeBook(String courseName,int[][] grades) {
	   this.courseName=courseName;
	   this.grades=grades;
			   
   }
   public void setCourseName(String courseName) {
	   this.courseName=courseName;
   }
   public String getCourseName() {
	   return courseName;
   }
   public int getMaximum() {
	   int highGrade=grades[0][0];
	   for(int [] studentGrade : grades) {
		   for(int grade :studentGrade) {
			   if(highGrade<grade)
				   highGrade=grade;
		   }
	   }
	   
	   return highGrade;
   }
   public int getMinimum() {
	   int lowGrade=grades[0][0];
	   for(int [] studentGrade : grades) {
		   for(int grade :studentGrade) {
			   if(lowGrade>grade)
				   lowGrade=grade;
		   }
	   }
	   
	   return lowGrade;
   }
   public int getAverage(int [] setOfGrades) {
	  int average,total=0;
	   for(int grade :setOfGrades) {
		   total+=grade;
	   }
	   average=total/setOfGrades.length;
	   
	   return average;
   }
   public void outputBarChar() {
	   System.out.print("Overall grade Distribution");
	   int [] frequency=new int[11];
	   for(int [] studentGrades :grades) {
		   for(int grade :studentGrades) {
			   ++frequency[grade/10];
		   }
	   }
	   for(int count=0;count<frequency.length;count++) {
		   if(count==10)
			   System.out.printf("%5d :",100);
		   else
			   System.out.printf("%02d-%02d : ",count *10,count*10+9);
		   for(int stars=0;stars<frequency[count];stars++)
			   System.out.print("*");
		   System.out.println();
	   }
   }
   public void outputGrades() {
	   System.out.println("The grades are : ");
	   System.out.print("             ");
       for(int test=0;test<grades[0].length;test++) 
    	   System.out.printf("%5s %d ","Test",test+1);
       System.out.printf("%8s%n","Average");
       for(int student=0;student<grades.length;student++) {
    	   System.out.printf("Student %1d",student+1);
    	   for(int grade : grades[student])
    		   System.out.printf("%8d",grade);
    	   double average=getAverage(grades[student]);
    	   System.out.printf("%10.2f%n",average);
       }
   }
   public void processGrades() {
	   outputGrades();
	   System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is : ",getMinimum(),
			                                    "Highest grade in the grade book is : ",getMaximum());
	   outputBarChar();
   }
}
