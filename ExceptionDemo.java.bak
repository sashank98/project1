public class ExceptionDemo {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		try{ //contains stmts which likely to cause an exception
			int d = x / y;
			System.out.println("The result is:"+d);
		}catch(ArithmeticException e){ //handle exceptions
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			return;
		}finally{ //always executed even through there is a 'return' statement
			System.out.println("finally block");
		}
		System.out.println("End of main method");
	}
}
