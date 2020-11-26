package devoir05;

public class TroisDes {
	private String nom;
	private int a;
	private int b;
	private int c;
	
	public TroisDes(String nom,int a, int b,int c) {
		this.nom=nom;
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public String getName() {
		return nom;
	}
	
	public boolean isPresent(int nb) {
		return (nb==a || nb==b || nb==c);
	}
}
