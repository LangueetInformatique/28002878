package devoir05;

import tp08.aleat;

public class PileFace {
	public static void main(String[] args) {
		aleat a=new aleat(2);
		
		int pile=0;
		int face=0;
		for(int i =0; i<1000; i++) {
			if(a.get()==1) {
				pile++;
			}else {
				face++;
			}
			try {
				lancerDés("Toto");
			}catch(E421 e) {
				
			}
		}
		System.out.println("moyenne pile: "+(pile/10)+"%");
		System.out.println("moyenne face: "+(face/10)+"%");


	}
	
	public static TroisDes lancerDés(String nom) throws E421{
		aleat a=new aleat(6);
		TroisDes t=new TroisDes(nom,a.get(),a.get(),a.get());

			if(t.isPresent(4)&& t.isPresent(2) && t.isPresent(1)) {
				throw new E421(t);
			}
		return t;
		
	}
}
