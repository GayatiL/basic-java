import java.util.Scanner;
class vowel
{
	public static void main(String[] args) {
		
		char c ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the charcter: ");
		c = sc.next().charAt(0);

		String op= (c =='a'||c =='A'||c=='e'||c=='i'||c=='0'||c=='u'||c=='E'||c=='I'||c=='O'||c=='U')?("Character is a vowel "):("character is a consonent");
		System.out.println(op);

	}
}