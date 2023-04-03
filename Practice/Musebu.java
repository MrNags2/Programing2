package Practice;

public class Musebu {
public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=n; j++) {
			int f1=0;
			int f2=1;
			int f3=0;
			
				if(j==n || i==n||i+j==n+1)
				{for (int k = 1; k <=10; k++) {
					f3=f1+f2;
					f1=f2;
					f2=f3;
					System.out.print(f3);
				}}else
				{
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
}

