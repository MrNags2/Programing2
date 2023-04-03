package Practice;

import java.util.Scanner;

public class Testcase5 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int[] arr={2,3,4,5,6,7,8,9,10,23,15,17,21};
	System.out.println("Enter the Target");
	int Target=sc.nextInt();
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
		if(arr[i]+arr[j]==Target)
		{
			System.out.println(arr[i]+"+"+arr[j]+"="+Target);
		}
	}
	
}}
}
