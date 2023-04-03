package Practice;

public class Palindrome_String {
public static void main(String[] args) {
	String str1="MOOM";
	String str2=" ";
	String copy=str1;
	for (int  i= str1.length()-1;i>=0;i--) {
		str2=str2+str1.charAt(i);
	}
if(copy.equals(str2))
{
	System.out.println("it is an plaindrome");
}
else
{
	System.out.println("it is not an palindrome");
}
}
}