package com.homework.Map;

import javax.swing.JOptionPane;

public class FillVocabulary {
	
	Translate trans = new Translate();
	
	public static void fillMapDefault() {
		Translate trans = new Translate();
		trans.setVocabulary("hey", "xей");
		trans.setVocabulary("cripple", "роздовбаний");
		trans.setVocabulary("creek", "річковий");
		trans.setVocabulary("ferry", "паром");
		trans.setVocabulary("butting", "проривається");
		trans.setVocabulary("through", "крізь");
		trans.setVocabulary("the", "");
		trans.setVocabulary("overhanging", "нависають");
		trans.setVocabulary("trees", "дерева");
		trans.setVocabulary("make", "робить");
		trans.setVocabulary("way", "шлях");
		trans.setVocabulary("for", "для");
		trans.setVocabulary("waters", "води");
		trans.setVocabulary("going", "біжать");
		trans.setVocabulary("down", " вниз");
		trans.setVocabulary("it’s", "це");
		trans.setVocabulary("a", "");
		trans.setVocabulary("mighty", "могутній");
		trans.setVocabulary("tight", "хват");
		trans.setVocabulary("squeeze", "стискає");
		trans.setVocabulary("all", "весь");
		trans.setVocabulary("alone", "на самоті");
		trans.setVocabulary("captain", "капітан");
		trans.setVocabulary("stands", "стоїть");
		trans.setVocabulary("hasn’t", "не");
		trans.setVocabulary("heard", "чує");
		trans.setVocabulary("from", "з");
		trans.setVocabulary("his", "його");
		trans.setVocabulary("deck", "палуби");
		trans.setVocabulary("hands", "руки");
	}
	
	public void addWords() {
			String strEng = null;
			String strUkr;
			
			try {
				strEng = JOptionPane.showInputDialog("Enter eglish word, please");
				strUkr = JOptionPane.showInputDialog("Enter ukrainian traslation of '" + strEng + "'");
				
				trans.setVocabulary(strEng, strUkr);
			} catch (NullPointerException e) {
				e.getMessage();
			}
			
			
		
	}	
}