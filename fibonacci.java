import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the range of series: ");
		int num = sc.nextInt();
        int num1=0;
        int num2=1;

        System.out.print(num1+" ");
        System.out.print(num2+" ");


        for(int i=1; i<=num;i++)
        {
        	int num3 = num1+num2;
        	System.out.print(num3+" ");

        	num1=num2;
        	num2=num3;
        }



	}
}