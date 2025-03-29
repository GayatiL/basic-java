import java.util.Scanner;
class PythagorusTriplet
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter base:");
		int base = sc.nextInt();

		System.out.println("enter height:");
		int height = sc.nextInt();

		System.out.println("enter hypotaneous:");
		int hypo = sc.nextInt();

		int sum = (base*base) +(height*height);

		if(sum== hypo*hypo)
		{
			System.out.println(base+" "+height+" "+hypo+" are Pythagorus Triplet");
		}
		else 
		{
			System.out.println(base+" "+height+" "+hypo+" are not Pythagorus Triplet");
		}
		
	}
}