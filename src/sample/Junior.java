package sample;

public class Junior extends PracticeAbst {

	@Override
	public void csestudent( ) {
		int a= 100 ;
		System.out.println("total cse student is"+a );
		//this.Itstudent();
		
		
	}

	@Override
	public void Itstudent() {
		//super.totalstudent();
		int student = 75;
		
		System.out.println("total  it student is "+student);
		
	}
	
	
	public static void main(String[] args) {
		
		//Junior j=new Junior();
		//j.csestudent();
		
		//PracticeAbst p =new PracticeAbst();// cant create obj for abstract class
		
		PracticeAbst p=new Junior();// we can create object for combination of abstract class and child class
		p.csestudent();
		p.Itstudent();
		p.totalstudent();
		
		//Junior j= new PracticeAbst();// cant create object for cobination of child and abstract class
		
		
		
	}

	
}
