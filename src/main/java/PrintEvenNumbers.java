
public class PrintEvenNumbers {
	
	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,15,19,21,22,25,30};
		
		for (int i = 0; i <= a.length; i++) {
			   //if number%2 == 0 it means its an even number
			   if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			   }
			}
	}

}
