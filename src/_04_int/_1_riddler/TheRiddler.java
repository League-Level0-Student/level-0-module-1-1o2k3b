package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("what creature walks with four legs in the morning 2 legs in the afternoon and 3 legs at night");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
String answer = "a human";
if(answer.equals (riddle)) {
	score += 1;
	JOptionPane.showMessageDialog(null, "you passed the sphinx, so now you have to steal the ring from the gollum");
}
	else {
		score-=999;
		JOptionPane.showMessageDialog(null, "you never find the gollum because you solved the riddle incorrectly and the sphinx killed you");
	}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
JOptionPane.showInputDialog("the next, second and final riddle is: what is in my pocket");
String answer2 = "a ring";
if (answer.equals (answer2)) {
	JOptionPane.showMessageDialog(null, "you got the master ring from gollum and now you have to destroy it at the cracks of doom without getting killed by sauron the dark lord");
	score+=999;	
}
else {
	score-=999;	
	JOptionPane.showMessageDialog(null, "you we're killed by the gollum.");
}


		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, score);
	}
}

