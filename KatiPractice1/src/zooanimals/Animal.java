package zooanimals;

public abstract class Animal {          // no main method


	String name;
	int age;
	private boolean vegetarian;
    private String eats;
    private int noOfLegs;
 
    public Animal(){}
 
    public Animal(String nameOfAnimal, boolean veg, String food, int legs){
    	this.name = nameOfAnimal;
    	//this.age = ageOfAnimal;
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String nameOfAnimal) {
        this.name = nameOfAnimal;
    }
    
    public boolean isVegetarian() {
        return vegetarian;
    }
 
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
 
    public String getEats() {
        return eats;
    }
 
    public void setEats(String eats) {
        this.eats = eats;
    }
 
    public int getNoOfLegs() {
        return noOfLegs;
    }
 
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
 
	// scope return type method name
	public void eat() {
          System.out.println("animal eat");                       
	}
	
	public void drinking() {
		System.out.println("animal drinking");  
    }
	
	public abstract void move();  //not use any curly brackets with abstract methods! 
        //the method is abstract in the superclass, subclasses MUST implement the method.


}
