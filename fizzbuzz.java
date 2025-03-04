import java.util.Scanner;
class fizzbuzz
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number: ");
		int num = sc.nextInt();

		System.out.println((num%3==0)?((num%5==0)?("fizzbuzz"):("fizz")):((num%5==0)?("buzz"):("not fizzbuzz")));
	}
}