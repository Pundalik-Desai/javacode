class Year
{
	public static void main(String arg[])
	{
		int a=2024;
		if(a%100==0)
		{
			if(a%400==0)
			System.out.println(a+"is not a leap year");
		}
		else if (a%4==0)
		System.out.println(a+"is not a leap year");
		else
		System.out.println(a+"is not a leap year");
	}
}