package sample;

public class Cse extends It
{
	public void girls() {
		int girls=20;
		System.out.println("girls is  :"+girls);
		this.topper();
		//super.boys();
		//super.student();
		

	}
	
	public void topper() {
		int topper=2;
		System.out.println("topper student is  :"+topper);
		
		boys();
		student();
		
			}

	public static void main(String[] args) {
		// object create for parent class
		It a=new It();
		a.boys();
		//a.girls(); // cant call child class method using parent class obj
		
		//Cse c= new Cse();
		//c.boys();
		//c.topper();
		//c.girls();
		//c.student();//here using child class obj can call parent class methods.
		
		It v =new Cse();
		v.boys();
		//v.girls();
		v.student();
		//v.topper();// if we create object for parent and child class combination ,only parent class method will execute.
		
		//Cse q=new It();//here cant assign child class obj for parent class
		
		
		
		
		
		
		
	}
}
