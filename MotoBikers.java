import java.util.*;
public class MotoBikers
{
	static float S1,S2,S3,S4,S5;
	static float AvgSpeed;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter speed of Five Bikers");
		S1 =sc.nextInt();
		S2 =sc.nextInt();
		S3 =sc.nextInt();
		S4 =sc.nextInt();
		S5 =sc.nextInt();
		AvgSpeed=(S1+S2+S3+S4+S5)/5;
		System.out.println("average speed="+AvgSpeed);
		if(S1>AvgSpeed)
		System.out.println("The speed of Qualifying Racer is"+S1);
		if(S2>AvgSpeed)
		System.out.println("The speed of Qualifying Racer is"+S2);
		if(S3>AvgSpeed)
		System.out.println("The speed of Qualifying Racer is"+S3);
		if(S4>AvgSpeed)
		System.out.println("The speed of Qualifying Racer is"+S4);
		if(S5>AvgSpeed)
		System.out.println("The speed of Qualifying Racer is"+S5);
	}
}
