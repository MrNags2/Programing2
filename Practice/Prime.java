package Practice;

public class Prime {
public static void main(String[] args) {
	int num=6;
	boolean flag=true;
	for (int i = 2; i <num; i++) {
	if(num%i==0)
	{
		flag=false;
		break;
	}
	}
	if(flag)
	{
		System.out.println("it is a prime number");
	}
	else
	{
		System.out.println("it is not a prime number");
	}
}
}
