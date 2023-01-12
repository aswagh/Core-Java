package examples.ExceptionHandling;


public class NestedExceptionsHandling {

	public static void main(String[] args) {

		try {
			try {
				try {
					
					int i = 30/0;
					int arr[]= {10,20};
					System.out.println(arr[10]);
				}
				catch(ArithmeticException e) {
					System.out.println("Inner try block 2");
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Inner try block 1");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer try block ");
		}
		
		
	}

}
