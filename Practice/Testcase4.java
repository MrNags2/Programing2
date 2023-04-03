package Practice;

import java.util.Scanner;

public class Testcase4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int input1=sc.nextInt();
	System.out.println("enter the Second number");
	int input2=sc.nextInt();
	if(input1 != input2)
	{
		System.out.println(input1+input2);
	}
	else
	{
		int res=(input1+input2)*2;
		System.out.println(res);
	}
}
}
