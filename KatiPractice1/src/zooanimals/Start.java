package zooanimals;

public class Start {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.eat();
		dog1.age = 7;
		dog1.name = "Bogyo";
		System.out.println(dog1.name);
		
		dog1.eat("Bogyo");
		dog1.drinking();
	    dog1.drinking("Topszli");
		
		
		Cat cat1 = new Cat("Poppy", false, "milk", 4);
		System.out.println(cat1.getColor()); 
		
		Cat cat2 = new Cat("Poppy", false, "milk", 4, "black");
		System.out.println(cat2.getColor()); 
		System.out.println(cat2.getName()); 
		System.out.println("Cat is Vegetarian?" + cat2.isVegetarian());
		System.out.println(cat2.getEats());
		System.out.println(cat2.getNoOfLegs());
		
		//Animal animal1 = new Animal();   //Cannot instantiate the type Animal
		
		
		
		dog1.move();
		cat2.move();
		
		
		Animal a = new Cat();
		a.move();
		
		a = new Dog();
		a.move();
		

	}

}
