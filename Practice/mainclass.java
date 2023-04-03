package Practice;

public class mainclass
{
String emp_name;
int sal;
int emp_id;
public mainclass(String emp_name, int sal, int emp_id) {
	this.emp_name = emp_name;
	this.sal = sal;
	this.emp_id = emp_id;
}
}
class mainclass2
{
	public static void main(String[] args) {
		mainclass mainclass1 = new mainclass("Nagraj",25245,5456);
		mainclass mainclass2=new mainclass("Ramesh",665465,4542);
		mainclass mainclass3=new mainclass("Ramesh",665465,4542);
		
		
		
	}
}