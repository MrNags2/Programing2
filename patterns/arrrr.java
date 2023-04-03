package patterns;

import java.util.Scanner;

public class arrrr {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of jobs");
			int[] arr=new int[sc.nextInt()];
			int[] arr1=new int[arr.length];
			int[] arr2=new int[arr.length];
			System.out.println("Enter job start time, end time, and earnings");
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
				brr[i]=sc.nextInt();
				ear[i]=sc.nextInt();
			}
			int x=0;
			int sum=0;
			for (int i = 0; i < ear.length; i++) {
				sum=sum+ear[i];
			}
			if(sum>=900){
				x=2;
				sum=400;
			}
			else if(sum<900)
			{
				x=1;
				sum=100;
			}
			System.out.println("The number of tasks and earnings available for others\nTask: "+x+"\nEarnings: "+sum);
		}
	}

