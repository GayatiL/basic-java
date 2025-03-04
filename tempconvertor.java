import java.util.Scanner;
class tempconvertor
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("          TEMPERATURE CONVERTOR      ");
		System.out.println();
		System.out.println("enter the temperature in celcius: ");
		float temp = sc.nextFloat();
        System.out.println("1. franeinheite");
        System.out.println("2. kelvin");
        System.out.println("");

        System.out.println("choose one option: ");
        int op = sc.nextInt();

        switch(op){
        case 1:temp = "temperature in fahrenheit is  "+(temp*1.8)+32;
        }
	}



}