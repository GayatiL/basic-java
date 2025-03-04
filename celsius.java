import java.util.Scanner;
class celsius
{
	public static void main(String[] args) {
		double celsius ;

		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the temperature in celsius: ");
		celsius =sc.nextDouble();
		double frahn = (9/5)*celsius+32;

		System.out.println(celsius + "in fahrenheit is "+frahn);

	}
}