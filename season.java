import java.util.Scanner;
class season
{
	public static void main(String[] args) {
		
		String sean;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the season: ");
		sean =sc.nextLine().toUpperCase();

		String op= (sean.equals("OCT")||sean.equals("NOV")||sean.equals("DEC")||sean.equals("JAN"))?sean+ " is winter season":
		(sean.equals("FEB")||sean.equals("MAR")|| sean.equals("APR")||sean.equals("MAY"))? sean + " is summer season":
		(sean.equals("JUNE")||sean.equals("JULY")|| sean.equals("AUG")||sean.equals("SEP"))? sean + " is rainy season":
		("invalid type");

		System.out.println(op);

	}
}