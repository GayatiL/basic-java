class krishnum
{
	public static void main(String[] args) {
		int num = 145 , sum =0;
		

		for( int i = num ;num>0 ; num/=10)
		{
			int rem = i%10;
			int fact = 1;
			for(int j = 1; j<=rem; j++)
			{
				fact*=j;
				sum+=fact;
			}
	

			
			
		}
		System.out.println(num==sum?"krish num":"not krish number");
	}
}