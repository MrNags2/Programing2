package Practice;

import java.util.ArrayList;

public class collection {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(9);
		a.add(10);
		a.add(18);
		a.add(19);
		a.add(23);
		a.add(33);
		System.out.println(a);
		System.out.println(a.subList(0, 3));
		System.out.println(a.subList(3,a.size()));
		
		
	}

}
