class HappayNum
{
	public static void main(String[] args) 
	{
		for(int j =isHappy(19);j>=1;j++)
		{

		}
		
	}

	public static int isHappy(int num)
	{
		int sum =0;
		for(int i =num; i>0; i/=10)
		{
			int rem = i%10;
			int sqr = rem *rem;
			sum+=sqr;

		}
		return sum;

	}
}