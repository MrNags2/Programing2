package Practice;

public class perfect {
	public static void main(String[] args) {
		int num=6;
		int sum=0;
		int copy=num;
		for (int i = 1; i <=num; i++) {
			if(num/i==0)
			{
				sum =sum+i;
			}
			
		}
		if(sum==copy)
		{
			System.out.println("it is a perfect number");
		}
		else
		{
			System.out.println("it is not a perfect number");
		}
		
	}

}
