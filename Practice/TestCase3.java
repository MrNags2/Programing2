package Practice;

import java.util.Scanner;

public class TestCase3 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	if(num<21)
	{
		int diff=21-num;
		System.out.println(diff);
	}
	if(num>21)
	{
		int diff1=num-21;
		System.out.println(diff1*diff1);
	}
	if(num==21)
	{
		System.out.println(0);
	}
}
}
