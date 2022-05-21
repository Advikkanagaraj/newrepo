package sample;

public class Captain implements New {

	@Override
	public void indianteam() {
		this.womensteam();
		int age =35;
		System.out.println("captain age is"+age);
		
		
		
	}

	@Override
	public void womensteam() {
		int age = 30;
		System.out.println("girs team captain age is "+age);
		this.age();
		
	}
	
	@Override
	public void age() {
		int u=25;
		System.out.println("coacher age is"+u);
		this.name();
		
	}

	@Override	
	public void name() {
		int f=30;
		System.out.println("caocher name is"+f);
	}

	
	public static void main(String[] args) {
		Captain a=new Captain();
		a.indianteam();
		//a.womensteam();
		
		//Coacher c=new Coacher();// cant create object for interface
		
		New g= new Captain();//we can create obj for interface and class
		g.age();
		g.womensteam();
		g.name();
		g.indianteam();
		
		//Captain p=new New();//cant create object for class and interface
		
		
		
		
		
	}

	
	
}
