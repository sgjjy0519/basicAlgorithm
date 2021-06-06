package FibonacciNumbers;

public class Numbers {

	public static void main(String[] args) {
		int[] array = new int[100];  
		int total = 0;
		
		//An = An-1 + An-2; n>=3
		//a1 = 1, a2 = 1;
		
		array[1] = 1;
		array[2] = 1;
		
		for(int i=3; i<array.length; i++) {
			array[i] = array[i-1]+array[i-2];
			
			total = array[i];
			
			System.out.println(total);
			
			
		}
		
	}

}
