package Practice;

import java.util.Arrays;

public class Maximumarr {
public static void main(String[] args) {
	int[] arr={10,4,25,65,24,3668};
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
	
	}
	System.out.println("minimum array element is"+arr[0]);
	System.out.println("Maximum array element is"+arr[arr.length-1]);
}
}
