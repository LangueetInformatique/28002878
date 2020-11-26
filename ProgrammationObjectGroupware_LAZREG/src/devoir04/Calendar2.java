package devoir04;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

/**
 * Classe heritage GregorianCalendar
 * 
 * @author mustapha
 *
 */

public class Calendar2 extends GregorianCalendar {
	private boolean cours;
	
	public Calendar2() {
		super();
		if(this.get(Calendar.DAY_OF_WEEK)==5 && this.get(Calendar.HOUR_OF_DAY)<12 && (this.get(Calendar.HOUR_OF_DAY)>9 && this.get(Calendar.MINUTE)>30)) {
			cours=true;
		}else {
			cours=false;
		}
	}
	
	/**
	 * affichage  de la date et l'heure
	 * 
	 * @param gCalendar un GregorianCalendar
	 */
	public void affiche(GregorianCalendar gCalendar) {
		System.out.println(gCalendar.get(Calendar.DAY_OF_MONTH)+"/"+(gCalendar.get(Calendar.MONTH)+1)+"/"+gCalendar.get(Calendar.YEAR));
		System.out.println(gCalendar.get(Calendar.HOUR)+":"+gCalendar.get(Calendar.MINUTE)+":"+gCalendar.get(Calendar.SECOND));
	}
	
	/**
	 *
	 * @return l'attribut cours
	 */
	public boolean getCours() {
		return cours;
	}
	
	//Affiche la date et heure de la creation du calendar2
	 
	
	public void creation() {
		affiche(this);
	}
	
	//Affichage de la date et l'heure actuelle
	 
	
	public void afficher() {
		GregorianCalendar gCalendar=new GregorianCalendar();
		affiche(gCalendar);
	}
	
	//Affichage de la durée en seconde depuis la creation du Calendar2


	public void duree() {
		GregorianCalendar gCalendar=new GregorianCalendar();
		int nbs=(gCalendar.get(Calendar.HOUR)-this.get(Calendar.HOUR))*60*60+(gCalendar.get(Calendar.MINUTE)-this.get(Calendar.MINUTE))*60+gCalendar.get(Calendar.SECOND)-this.get(Calendar.SECOND);
		System.out.println(nbs);
	}
	
}
