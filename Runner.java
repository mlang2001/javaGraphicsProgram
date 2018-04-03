import javax.swing.JFrame;
import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("1 - Day \n2 - Night");
		int background = kb.nextInt();
		System.out.println("1 - Clear Sky \n2 - Cloudy");
		int weather = kb.nextInt();

		JFrame frame = new JFrame("Scenery");
 
        Scenery canvas = new Scenery(background, weather, 650);
        frame.add(canvas);
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.pack();
 
        frame.setVisible(true);

        canvas.animate();
	}
}