import java.util.Scanner;
class checkcharcter
{
	public static void main(String[] args) {
		 
		char ch ;

		Scanner sc = new Scanner (System.in);
		System.out.println("enter the letter: ");
		ch = sc.next().charAt(0);

        String op = ((ch>='A'&& ch<='Z')||(ch>='a'&& ch <= 122))?((ch >= 'A'&& ch <='Z')?("it is an uppercase"):("it is a lowercase")):((ch >='0'&& ch <='9')?(ch+" is a digit"):(ch+ "is a special character"));

        System.out.println(op);
	}
}