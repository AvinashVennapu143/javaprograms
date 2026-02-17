
public class InheritanceExample {

	public static void main(String[] args) {
		SecondBorn p = new SecondBorn();
		p.bark();
		
	}
	}
	class Dog{
		public void bark() {
			System.out.println("its barking...");
		}
	}
	class Puppy extends Dog{
		
	}
	class NewBorn extends Puppy{
		
	}
	class SecondBorn extends NewBorn{
		
	}


