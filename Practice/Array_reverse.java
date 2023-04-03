package Practice;

import java.util.Scanner;

public class Array_reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 10 array Elements");
	int arr[]=new int[10];
	int brr[]=new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("before reversing the array");
	for (int j = 0; j < arr.length; j++) {
		System.out.println(arr[j]);
	}
	for (int i=arr.length-1;i>=0;i--)
		for(int j=0;j<brr.length;j++)
		{
			brr[j]=arr[i];
		
	}
	System.out.println("After reversing the array");
	for (int i = 0; i < brr.length; i++) {
		System.out.println(brr[i]);
	}
}
}
