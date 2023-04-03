package Practice;

public class ArrayPrime {
public static void main(String[] args) {
	int[] arr={1,5,7,11,13,15,16};
	for (int i = 0; i < arr.length-1; i++) {
		if(arr[i]>0)
		{
			boolean flag=true;
			for (int j = 2; j < arr[i]; j++) {
				if(arr[i]%j==0)
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.println(arr[i]);
			
			}
		}
	}
}
}
