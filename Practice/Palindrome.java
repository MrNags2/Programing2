package Practice;

public class Palindrome {
public static void main(String[] args) {
	int num=12;
	int rev=0;
	int copy=num;
	while(num!=0)
	{
		int d=num%10;
		rev=rev*10+d;
		num=num/10;
	}
	if(rev==copy)
	{
		System.out.println("It is a perfect number");
	}
	else
	{
		System.out.println("it is not a perfect number");
	}
}
}
