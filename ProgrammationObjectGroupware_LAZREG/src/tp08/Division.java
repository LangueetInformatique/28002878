package tp08;

public class Division {


	public static void main(String[] args) {
		int i = 1000,j;
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