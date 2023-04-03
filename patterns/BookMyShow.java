package patterns;

import java.util.Scanner;

class Theater
{
	void Tickets()
	{
		System.out.println("Tickets are available");
	}
	void Karnthi()
	{
		System.out.println("tickets are Avilable for Kranthi");
	}
}

public class BookMyShow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Movie Do you want to watch");
		System.out.println("1.Kranthi");
		System.out.println("3.Haa Rathri");
		System.out.println("4.Ant Man");
		System.out.println("Enter the movie Number");
		int number=sc.nextInt();
		Theater theater=new Theater();
		BookTickets(theater);
		
		System.out.println("Want to book the Tickets......");
		String yes=sc.next();
		System.out.println("How many Tickets");
		int Seat=sc.nextInt();
		PhonePay(Seat);
		
		
	}
	
	private static void PhonePay(int seat) {
		int res=seat*250;
		System.out.println("Total Amount="+res);
		
	}

	private static void BookTickets(Theater theater2) {
		
		theater2.Tickets();
	}
	}

