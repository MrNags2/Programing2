package Practice;

public class test {
	public static void main(String[] args) {
		String str1="AXSD";
		char[] ch=str1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			int x=(int)ch[i];
			char b=(char)(x+1);
			System.out.print(b+" ");
		}
	}
	}
