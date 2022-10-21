package eccezioni;

public class Schiantarsi {
<<<<<<< HEAD
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
=======

	public static void main(String[] args) {
		

		int a = 7;
		int b = 1;
		
		try {
			String s = "clarissa";
			
			System.out.println(s.charAt(0)); 

			System.out.println(a / b);
			
			
			
		} catch (NullPointerException e) {
			System.err.println("si è verificata un'eccezione " + e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("si è verificata un'eccezione " + e.getMessage());
		} catch (Exception e) {
			System.err.println("si è verificata un'eccezione " + e.getMessage());
		}
		
		
		System.out.println("sei arrivato alla fine del programma");

	}

>>>>>>> fc39a57a445dc9984a0880455b8118a1c4221333
}
