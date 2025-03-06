class BouncyNum
{
	public static void main(String[] args) 
	{
		System.out.println(isBouncy(112));
		
	}

	public static boolean isBouncy(int num)
	{
		int last = num%10;
		num/=10;
		int seclast = num%10;

		boolean inc = false, dec = false;

		while(num>0)
		{
			if(last<seclast)
			{
				inc = true;
			}
			else if(last>seclast)
			{
				dec = true;
			}

			last = seclast;
			num/=10;
			seclast=num%10;

			if(inc && dec)
			{
				break;
			}
		}
		return inc && dec;

	}
}