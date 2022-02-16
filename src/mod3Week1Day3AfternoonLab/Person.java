package mod3Week1Day3AfternoonLab;

public class Person {	
	String name;
	
	public void Talk() {
		System.out.println("Hello " + name );
	}
	
	public void talk(String name) {
		System.out.println("Hello " + name + "  and "+ this.name );
	}

}
