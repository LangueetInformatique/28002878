package devoir04;

import java.lang.*;

public class Test {

	public static void main(String[] args) {
		Calendar2 c= new Calendar2();
		
		System.out.println(c.getCours());
		
		Thread t;
		try {
		Thread.sleep(2000);
		}catch (Exception e) {
            System.out.println(e);
         }
		
		c.duree();
		c.creation();
		c.afficher();
		

	}

}