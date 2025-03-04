import java.util.Scanner;
class stringpalindrome
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String str = sc.next();
		String dup = str;
		String rev = "";
		for(int i = 0; i<str.length(); i++)
		{
			rev = str.charAt(i) + rev;

		}
		System.out.println(rev);
		if (rev==str)
		{
			System.out.println("String " + dup + " is a palindrome");
		}
		else 
		{
			System.out.println("String " + dup + "  is not a plaindrome ");
		}
	}
}