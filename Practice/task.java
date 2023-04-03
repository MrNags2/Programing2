package Practice;

public class task {
public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <n; i++) {
		for (int j = 0; j <n; j++) {
			//if(j+j==2 && i+j==5 && i+j==8 && i+j==6 && i+j==7 && i+j==8)
			//{
				int f0=0;
				int f1=1;
				int f2=0;
				for(int z=0;z<55;z++)
				{
					f2=f1+f2;
					f0=f1;
					f1=f2;
					if(j+j==2 && i+j==5 && i+j==8 && i+j==6 && i+j==7 && i+j==8)
					{
					System.out.print(f2);
				    }
					else
					{
						System.out.println(" ");
					}
			
			
			{
				System.out.print(" ");
			}
			
		}
		System.out.println(" ");
	}
	}
}
}


