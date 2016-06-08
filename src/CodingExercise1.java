import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot r2d3 = new Robot();
		r2d3.setSpeed(10);
		String color = JOptionPane.showInputDialog("What color would you like your square? Yellow or Blue?");
		if (color.equals("Blue")) {
			r2d3.setPenColor(000, 225, 150);
		} else if (color.equals("Yellow")) {
			r2d3.setPenColor(225, 225, 000);
		}
		r2d3.setPenWidth(10);
		r2d3.penDown();
		for (int i = 0; i < 4; i++) {
			r2d3.move(400);
			r2d3.turn(-90);
		}
	}
	//Oscar Acevedo Final Exam

}