class fascinatingnum1
{
	public static void main(String[] args) {
		int num = 327;
		int temp = num;
		for(int i =2; i<=3;i++)
		{
			num = (num*1000)+(temp *i);

		}
		System.out.println(temp);
		System.out.println(num);
	}
}