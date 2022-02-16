package mod3Week1Day3AfternoonLab;

public class Dog extends Animal implements AnimalBehavior {

	public void bestPet() {
		super.bestPet();
		System.out.println("I have the best Dog");
	}
	
	@Override 
	public void makeNoise() {
		System.out.println("Woof Woof");
	}


	
	
}
