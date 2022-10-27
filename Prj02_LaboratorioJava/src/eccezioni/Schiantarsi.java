package eccezioni;

public class Schiantarsi {

	public static void main(String[] args) {

		int a = 7;
		int b = 0;
		
		try {
			String s = null;
			
			System.out.println(s.charAt(0));
			
			System.out.println(a/b);
		}catch (NullPointerException e) {
			System.err.println("si è verificato un'eccezione "+e.getMessage());
			
		} catch (ArithmeticException e) {
			System.out.println("si è verificato un'eccezione "+e.getMessage());
		}
		
		System.out.println("fine");
	}
}		
			
			
	
