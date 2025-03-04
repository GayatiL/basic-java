class ArmstrongNum
{
	public static void main(String[] args) 
	{
		for(int st = 1; st<=1000; st++)
		{
			if(isArmstrong(st))
	        {
			   System.out.println(st);
		    }

		}
		
		
			
		
	}

	public static int count(int num)
	{
		int len =0;
		for(int i = num; i>0; i/=10)
		{
			len++;
		}
		return len;
	}

	public static int power(int digit , int len)
	{

			int power= 1;
			for(int j = 1; j<=len; j++)
			{
				power*=digit;
			}
			return power;	
	}

	public static boolean isArmstrong(int num)
	{
		int ct = count(num);
		int sum =0;
		for(int i =num; i>0; i/=10)
		{
			int rem = i%10;
			int pw = power(rem, ct);
			sum+=pw;
		}
		return sum==num;
	}
}

 
