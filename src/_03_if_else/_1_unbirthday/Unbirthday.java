package _03_if_else._1_unbirthday;
import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String bday = JOptionPane.showInputDialog(null, "what is your birhtday's date");
	if (bday.equals("10/10")) {
		JOptionPane.showMessageDialog(null, "happy, merry, exciting, fun birthday to you");
	}
	else {
		JOptionPane.showMessageDialog(null, "no bday to you!!! OOFF!!!");
	}
}
}
