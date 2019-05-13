/**
* @author Philippe Truillet (Philippe.Truillet@irit.fr)
* @version 0.1 du 05/01/2019
*/

package fr.irit.elipse.project;

import java.util.*;

class ThotGrammar {
	
	private String mot;
	private String evenement;
	private String balise;
	
	public ThotGrammar() {
		this.mot="";
		this.evenement="";
		this.balise="";
	}
	
	public ThotGrammar(String mot){
		this.mot = mot;
		this.evenement="";
		this.balise="";		
	}
	
	public void setMot(String mot) {
		this.mot = mot;
	}
	public void setEvenement(String mot) {
		this.evenement = evenement;
	}
	public void setBalise(String mot) {
		this.balise = balise;
	}
	public String getMot() {
		return(this.mot);
	}
	public String getEvenement() {
		return(this.evenement);
	}
	public String getBalise() {
		return(this.balise);
	}	
}