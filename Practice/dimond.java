package Practice;

import java.util.Scanner;

public class dimond {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter the odd Digit Number");
	int n=sc.nextInt();
	int star=1;
	int space=n/2;
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=space; j++) {
			System.out.print("  ");
			
		}
		for (int k = 1; k <=star; k++) {
			if(k%2==0)
			System.out.print("# ");
			else
				System.out.print("* ");
		}
		System.out.println();
		if(i<=(n/2))
		{
		space--;
		star=star+2;
		}
		else
		{
			space++;
			star=star-2;
		}
	}
	
}
}
