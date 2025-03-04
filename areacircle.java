import java.util.Scanner;
class areacircle

{
	public static void main (String [] args)
	{
	float r;
	
	final float pi =22/7;

	Scanner sc = new Scanner(System.in);
	System.out.println();
	 r = sc.Nextfloat();
    
     float area = pi*(r*r);

    System.out.println("area of circle is :"+area+"cm^2");
    }

}