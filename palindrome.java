import java.util.Scanner;
class palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the number: ");
		int num = sc.nextInt();
        int dup = num;   
		int rev =0;

		while(num>0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num/=10;
		}
		System.out.println(rev);
		System.out.println(dup);
        if (dup==rev)
        {
        	System.out.println("number is a palindrome");

        }
        else
        {
        	System.out.println("number is not a palindrome");
        }
	}
}