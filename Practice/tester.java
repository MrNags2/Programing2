package Practice;

public class tester {
public static int GetJumpcount(int input1,int input2,int input3,int[] input4)
{
	int jumps=0;
	for(int i=0;i<input3;i++)
	{
		int reach=input1;
		int jump=1;
		while(reach<input4[i])
		{
			reach+=(input1-input2);
					jump+=1;
			
		}
		jumps+=jump;
	}
	return jumps;
}
public static void main(String[] args) {
	int input1=5;
	int input2=1;
	int input3=2;
	int input4[]={9,10};
	System.out.println(GetJumpcount(input1,input2,input3,input4));
}
}
