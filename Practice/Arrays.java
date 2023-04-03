package Practice;

public class Arrays {
	int[] arr=null;
public void singleDimentio(int size)
{
	arr=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=Integer.MIN_VALUE;
		System.out.println(arr[i]);
	}
}
public static void main(String[] args) {
	Arrays arrays =new Arrays();
	arrays.singleDimentio(5);
}
}
