package Practice;

public class Armstromg {
public static void main(String[] args) {
	int num=154;
	int copy=num;
	int sum=0;
	
	while(num!=0)
	{
		int d=num%10;
		sum=sum+power(d,count(copy));
		num=num/10;
	}
	if(sum==copy)
	{
		System.out.println("it ia an amstrong number");
	}
	else
	{
		System.out.println("it is not an Amstrong number");
	}
}
private static int power(int base, int exp) {
	int mul=1;
	while(exp!=0)
	{
		mul=mul*base;
		exp--;
	}
	return mul;
}
static int count(int copy)
{
	int count=0;
	while(copy!=0){
		copy=copy/10;
		count++;
	}
	return count;
}
}
