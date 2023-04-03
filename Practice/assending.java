package Practice;

public class assending {
public static void main(String[] args) {
	int[] arr={2,5,6,3,1,4};
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length; j++) {
			
	     if(arr[j]>arr[j+1])
	     {
	    	 int temp=arr[j];
	    	 arr[j]=arr[j+1];
	    	 arr[j+1]=temp;
	    	 System.out.println(arr[j]);
	     }
	    
	}
}
}
}
