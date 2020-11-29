package devoir03;

public class Test {

	public static void main(String[] args) {
		Reptile r= new Reptile("reptile",0,true);
		Phyllodactylidae g= new Phyllodactylidae(80);
		Crocodile c= new Crocodile();
		
		r.presente();
		r.alimentation();
		c.presente();
		c.alimentation();
		System.out.println(c.dents());
		g.presente();
		g.alimentation();
		g.gagnePoids(75);
		g.perdPoids(100);
		
	}

}
