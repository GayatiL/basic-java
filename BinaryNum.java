class BinaryNum
{
	public static void main(String[] args) {
		
		int num =12;
		String bin ="";

		for(int i =num; i>0; i/=2)
		{
			bin = (i%2)+bin;

		}
		System.out.println(num+":"+bin);

	}
}