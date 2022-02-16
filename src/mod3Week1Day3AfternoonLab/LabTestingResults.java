package mod3Week1Day3AfternoonLab;

public class LabTestingResults {


		
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Teo";
	
		p1.Talk();
		p1.talk("Oussama");
		
		Dog cody = new Dog ();
		cody.makeNoise();
		Animal bird = new Animal();
		bird.makeNoise();
		Husky max = new Husky();
		max.makeNoise();
		max.bestPet();
		max.eat();
		
	}

}
