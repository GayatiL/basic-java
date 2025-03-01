import java.util.Scanner;
class bmi
{
	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);

		System.out.println("enter your weight : ");
		double w = sc.nextDouble();
		w = w*0.45359237;   //kg

		System.out.println("enter your height: ");

		double h = sc.nextDouble();
		h= h*0.0254;       //meter

		double bmi = w/h;

		System.out.println("bmi is "+bmi);
	}
}