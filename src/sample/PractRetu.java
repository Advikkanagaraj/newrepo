package sample;

public class PractRetu {

    private int student( int fee) {
		System.out.println("student fee is ");
		return fee+1000;

	}
	
    private int college(int extrafee) {
		System.out.println("college sfee is "+extrafee);
		return extrafee+2000;

	}
    
    private String pricipal(int i) {
		System.out.println("announce name list"+i);
		return "after one week";

	}
    public static void main(String[] args) {
		PractRetu a=new PractRetu();
		int student = a.student(1000);
		System.out.println(student);
		int college = a.college(1000);
		System.out.println(college);
		String pricipal = a.pricipal(15000);
		System.out.println(pricipal);
	}
}
