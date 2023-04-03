package Practice;

public class FactorsArray {
public static void main(String[] args) {
	int[] arr={10,20,3,45};
	for (int i = 0; i < arr.length; i++) {
		for (int j = 1; j < arr[i]; j++) {
			if(arr[i]%j==0)
			{
				System.out.println(arr[i]+"--->"+j);
			}
			
		}
	}
}
}
