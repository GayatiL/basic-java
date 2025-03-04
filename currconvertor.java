import java.util.Scanner;
class currconvertor
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println(       "  CURRENCY CONVERTOR      ");
	    System.out.println();
        System.out.println("enter the amount in INR ");
        float inr = sc.nextFloat();
        System.out.println();

        System.out.println("   LIST OF CURRENCY ");
        System.out.println("USD");
        System.out.println("EUR");
        System.out.println("GBP");
        System.out.println("PKR");
        System.out.println("JPY");
        System.out.println("KOREAN");

        System.out.println("enter your currency: ");
        String opt = sc.nextInt();
        
        float concurr = 0; 
        if(opt.equals("USD"))
        {
        	concurr = inr/86.55f;
        	System.out.println(inr + "INR = "+concurr "USD");

        }
        else

        




        	}
}