package Practice;

public class Testcase6 {
	public static void main(String[] args) {
		int[] arr={2,3,4,5};
		int l=5;
		int r=7;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			//for (int j = 0; j < arr.length; j++) {
				int x=arr[i]+arr[i+1];
				if(x>=l && x<=r)
				{
					count++;
					System.out.println(arr[i]+"+"+arr[i+1]+"= "+x);
					
				}
				
			}
		System.out.println(count);	
		}
//		System.out.println(count);	
	}

