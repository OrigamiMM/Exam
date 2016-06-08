
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they were born. If they are over 30, tell them
 * they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int year = Integer.parseInt(age);
		int year1 = 2016-year;  
		JOptionPane.showMessageDialog(null, "You were born around "+ year1);
		if (year>=30) {
			JOptionPane.showMessageDialog(null, "Aren't you a liitle too old for this game?");
		}else if(year<30){
			JOptionPane.showMessageDialog(null, "Enjoy your youth before you are 30");
		}
	}
}
//Oscar Acevedo Final exam