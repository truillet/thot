/**
* @author Philippe Truillet (Philippe.Truillet@irit.fr)
* @version 0.1 du 05/01/2019
*/

package fr.irit.elipse.project;

import javax.swing.table.AbstractTableModel;
import java.util.*;

class ThotTable extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	private final String[] entetes = { "Mots-Balises", "Type d'\u00e9v\u00e9nement", "Concept associ\u00e9" };;
	private ArrayList<ThotGrammar> liste;
	
	public ThotTable() {
		liste = new ArrayList<>();
	}
	
	public int getColumnCount() {
		return entetes.length;
	}
	
	public String getColumnName(int columnIndex) {
		return entetes[columnIndex];
	}
	
	public int getRowCount() {
		return liste.size();
	}

	public String getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
			case 0: 
				return ((liste.get(rowIndex)).getMot());
			case 1: 
				return ((liste.get(rowIndex)).getEvenement());
			case 2: 
				return ((liste.get(rowIndex)).getBalise());
			default:
				return("");
		}
	}
	
	public void add(String mot) {
		ThotGrammar t = new ThotGrammar(mot);
		liste.add(t);
	}
}