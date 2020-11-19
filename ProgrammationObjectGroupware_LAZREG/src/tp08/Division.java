package tp08;

public class Division {

	private static int j;

	public static void main(String[] args) {
		int i = 1000;
		do{
			i--;
			try{j=1/i;}
			catch(ArithmeticException e) {
				System.out.println("Division par 0!!");
				break;
			}
		} while (true);
	}

}