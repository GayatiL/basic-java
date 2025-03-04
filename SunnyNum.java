class SunnyNum
{
	public static void main(String[] args) 
	{
		int num = 8;
		int inr = num+1;
		boolean flag = true;

		for(int i =1; i<=inr; i++)
		{
			if(i*i==inr)
			{
				flag = true;
				break;
			}
			else 
				flag = false;

		}
		if(flag)
		{
			System.out.println(num+" is sunny number");
		}
		else 
		{
			System.out.println(num+" is not sunny number");
		}
		
	}
}