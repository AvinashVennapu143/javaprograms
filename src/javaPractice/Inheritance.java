package javaPractice;

public class Inheritance {

	public static void main(String[] args) {
		Puppy Puppy = new Puppy();
		Puppy.bark();
		NewBorn NewBorn= new NewBorn();
		NewBorn.bark();
	

	}

}
class Dog{
	public void bark() {
		System.out.println("its barking");
	}
}
class Puppy extends Dog{
	
	public void bark() {
		System.out.println("its barking in puppy class");
	}
	
}
class NewBorn extends Dog{
	
}