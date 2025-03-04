import java.util.Scanner;
class EvilNum
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = sc.nextInt();

		String bin="";

        int cnt=0;
		for(int i =num; i>0; i/=2)
		{
			bin = (i%2)+bin;
		}
		
		 for(int i =0; i< bin.length(); i++)
		 {
		 	char ch = bin.charAt(i);
		 	if(ch=='1')
		 	{
		 		cnt++;
		 	}
		 }
		 	
		 if(cnt%2==0)
		 {
		 	System.out.println(num+" is evil number");

		 }
		 else 
		 {
		 	System.out.println(num+" is not an evil number");
		 }

	

		
	}


}