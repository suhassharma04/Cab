import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("*Welcome Dear Customer*\n Availabe Booking options are");
		System.out.println("1.UberGo\n 2.UberXL\n 3.Uberpool");
		System.out.println("Please Enter Your Choice Number");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		Bookcab b=new Bookcab();
		switch(choice)
		{
		case 1:b.Bookcab(new UberGo());
		break;
		case 2:b.Bookcab(new UberXL());
		break;
		case 3:b.Bookcab(new Uberpool());
		break;
		default: System.out.println("Invalid Choice");
		}
	}

}

