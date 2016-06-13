package zooanimals;

public class Dog extends Animal{
	
	// scope return type method name
		public void eat() {
	          System.out.println("dog eat");                       
		}
		
		//overloading
		public void eat(String whoEating) {
	          System.out.println( whoEating + " eating");                       
		}
		
		
		public void drinking(String dogName) {
			System.out.println(dogName  +"drinking");  
	    }
		
		public void move(){
			System.out.println("running");
		}

}
