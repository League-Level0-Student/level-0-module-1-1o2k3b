package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String dad = "my dad, Mark is a biker, surfer, and a really great dad";
	String mom = "my mom, Sandra is swiss, snowboarder, and a really great mom";
	String malu = "my little sister, Malu is fun, annoying, and a really great little sister";
			// 2. Ask the user to enter a name. Store their answer in a variable
	String question = JOptionPane.showInputDialog("put in this: family");
	if (question.equals ("family")); {
		JOptionPane.showMessageDialog(null, dad);
	}
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if (question.equals ("family")); {
		JOptionPane.showMessageDialog(null, mom);
	}		
		if (question.equals ("family")); {
			JOptionPane.showMessageDialog(null, dad);
	}

}
}
