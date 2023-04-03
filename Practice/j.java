package Practice;

public class j
{
public static void main(String[] args) throws InterruptedException {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
		if(j==1||i==j||j==n)
		{
			System.out.print("*");
			Thread.sleep(100);
		}
		else
		{
			System.out.print(" ");
		}
		}
		System.out.println();
	}
	System.out.println("                ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==(n/2)+1||i==1||i==n)
				{
					System.out.print("*");
					Thread.sleep(200);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.println("               ");
	for(int i=1;i<=n;i++)
	{
	for(int j=1;j<=n;j++)
	{
	if(j==1||i==1||j==n||i==n)
	{
		System.out.print("*");
		Thread.sleep(300);
	}
	else
	{
		System.out.print(" ");
	}
    }
	System.out.println(" ");
}
	System.out.println("               ");
	for(int i=1;i<=n;i++)
	{
	for(int j=1;j<=n;j++)
	{
	if(j==1||j==n||i==(n/2)+1)
	{
		System.out.print("*");
		Thread.sleep(400);
	}
	else
	{
		System.out.print(" ");
	}
    }
	System.out.println(" ");
}
	System.out.println("               ");
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==(n/2)+1||i==1||i==n)
			{
				System.out.print("*");
				Thread.sleep(500);
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
	System.out.println("               ");
}
}
