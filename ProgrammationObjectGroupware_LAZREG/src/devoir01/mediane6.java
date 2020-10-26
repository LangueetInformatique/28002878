package devoir01;
/**
 * 
 * @author mustapha
 *
 */

public class mediane6 {
	/**
	 * Test sur plusieurs set de valeurs la fonction mediane
	 * 
	 * @param args les arguments de la console
	 * 
	 */
	public static void main(String[] args) {
		
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		
		System.out.println(mediane(p1,p2,p3,p4,p5));
		System.out.println(mediane(p2,p1,p3,p4,p5));
		System.out.println(mediane(p2,p3,p1,p4,p5));
		System.out.println(mediane(p5,p1,p3,p4,p2));
		System.out.println(mediane(p2,p4,p3,p1,p5));
		System.out.println(mediane(p3,p1,p2,p4,p5));
		System.out.println(mediane(p3,p2,p1,p4,p5));
	}
	
	/**
	 * Permet a partir de 5 entiers p1 à p5 de recuperer la médiane
	 * 
	 * @param p1 à p5 des valeurs entieres
	 * @return un entier, médiane des 5 entiers
	 */
	public static int mediane(int p1, int p2, int p3, int p4, int p5) {
		int p6=0;

		if(p1<p2) {
			if(p2<p3) {
				if(p3<p4) {
					if(p4<p5) {
						p6=p3;
					}else if(p5<p3) {
						p6=p3;
					}else if (p5<p2){
						p6=p5;
					}else {
						p6=p2;
					}
				}else if(p5<p4) {
					if(p2<p5) {
						p6=p5;
					}else if(p2<p4) {
						p6=p2;
					}else {
						p6=p4;
					}
				}else if(p5<p2) {
					p6=p5;
				}else {
					p6=p2;
				}
			}else if(p3<p1) {
				if(p2<p4) {
					if(p2<p5) {
						p6=p2;
					}else if(p5<p4){
						p6=p5;
					}else if(p1<p4) {
						p6=p4;
					}else {
						p6=p1;
					}
				}else if(p3<p4) {
					if(p5<p4) {
						p6=p4;
					}else if(p5<p1) {
						p6=p5;
					}else {
						p6=p1;
					}
				}else if(p3<p5) {
					p6=p3;
				}else {
					p6=p5;
				}
			}else if(p2<p4) {
				if (p2<p5) {
					p6=p2;
				}else if(p3<p5){
					p6=p5;
				}else {
					p6=p3;
				}
			}else if(p3<p5) {
				if(p5<p4) {
					p6=p5;
				}else if(p3<p4){
					p6=p4;
				}else {
					p6=p3;
				}
			}else if(p5<p4){
				p6=p5;
			}else if(p1<p4){
				p6=p5;
			}else {
				p6=p3;
			}
		}else if(p3<p1) {
			if(p1<p4) {
				if(p1<p5) {
					p6=p1;
				}else if(p5<p3){
					if(p2<p3) {
						p6=p3;
					}else {
						p6=p2;
					}
				}else if(p2<p5) {
					p6=p5;
				}else {
					p6=p2;
				}
			}else if(p3<p4) {
				if(p2<p4) {
					if(p4<p5) {
						p6=p4;
					}else if(p2<p3) {
						if(p5<p3) {
							p6=p3;
						}else {
							p6=p5;
						}
					}else if(p2<p5) {
						p6=p5;
					}else {
						p6=p2;
					}
				}else if(p2<p5) {
					p6=p2;
				}else if(p4<p5){
					p6=p5;
				}else {
					p6=p4;
				}
			}else if(p1<p5) {
				if(p3<p2) {
					p6=p2;
				}else {
					p6=p3;
				}
				}else if(p3<p5){
					if(p2<p5) {
						p6=p5;
					}else {
						p6=p2;
					}
				}else if(p2<p3) {
					p6=p3;
				}else {
					p6=p2;
				}
			}else if(p4<p2) {
				if(p5<p2) {
					p6=p2;
				}else {
					p6=p5;
				}
			}else if(p3<p4) {
				if(p3<p5) {
					p6=p3;
				}else if(p1<p5){
					p6=p5;
				}else{
					p6=p1;
				}
			}else if(p3<p5) {
				p6=p3;
			}else if(p5<p1) {
				p6=p5;
			}else {
				p6=p1;
			}

		return p6;
	}

}

