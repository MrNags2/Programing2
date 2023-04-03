package Practice;

public class Abcd {
public static void main(String[] args) {
	String str="ABCD";
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		int x=(int)ch;
		char bh=(char)(x+3);
		System.out.print(bh);
	}
}
}
