package Practice;

public class Factorial {
public static void main(String[] args) {
	int[] arr={2,3,5,6,8,9};
	
	for (int i = 0; i < arr.length; i++) {
		int fact=1;
		for (int j = 1; j < arr[i]; j++) {
			fact=fact*j;
		}
		System.out.println(arr[i]+"---->"+fact);
	}
}
}
