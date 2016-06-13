package primitive.types;

public class Primitives {

	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i);
		
		int z;
		z = 20;
		System.out.println(z);
		
		boolean isKatiHappy = true;
		System.out.println(isKatiHappy);
		
		if (isKatiHappy){
			System.out.println("Yes i am very happy.");
			
		}else{
			System.out.println("no i am not very happy.");
		}
		
		int k = (int) Math.pow(2, 32); //2 to the power of 32
		System.out.println(k);
		
		long j =  2147483747l;      //l
		System.out.println(j);
		
		
		float f = 3.456677f;        //f
		System.out.println(f);
		
		double d = 3.456677;     
		System.out.println(d);
		
		
		char a = 'a';
		System.out.println((int)a);
		
		char space = ' ';
		System.out.println((int)space);


		
	}

}
