package zooanimals;

public class Cat extends Animal {

	private String color;
	
	public Cat(){
		
	}
	 
    public Cat(String nameOfAnimal, boolean veg, String food, int legs) {
        super(nameOfAnimal, veg, food, legs);
        this.color="White";
    }
 
	
    public Cat(String nameOfAnimal, boolean veg, String food, int legs,String color){
        super(nameOfAnimal,veg, food, legs);
        this.color=color;
    }
 
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
    
    /*If you don't implement the abstract methods from the superclass in your subclasses, 
    your subclasses will have an error. 
    You MUST implement the abstract methods!!!!
    */
    
    public void move(){
		System.out.println("fooling around");
	}

}
