import java.util.Scanner;
class marks
{
	public static void main(String[] args) {
		
		float marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks: ");
		marks = sc.nextFloat();
		
		float per = (marks*100)/600;

	    String op = (per>=70)?("your grade is A"):
	                (per<=70 && per>=50)?("your grade is B"):
	                (per<=50 && per>=30)?("your grade is C"):
	                ("you are fail");
	    System.out.println("you got " +per+ " percentage");
	    System.out.println(op);
	}
}