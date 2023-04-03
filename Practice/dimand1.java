package Practice;

import java.util.Scanner;

public class dimand1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the odd Digit Number");
	int n=sc.nextInt();
	int star=5;
	int space=2;
	for(int i=1;i<=n;i++)
	{
		for(int j=0;j<=space;j++)
		{
			System.out.print("  ");
		}
		for (int k = 1; k <=star; k++) {
			System.out.print(k+" ");
			
		}
		System.out.println(" ");
		if(i<=(n/2))
		{
			space++;
		star=star-2;
		}else
		{	space--;
		star=star+2;
		}
		
	}
	
}
}
