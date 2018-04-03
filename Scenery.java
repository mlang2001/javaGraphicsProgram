import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
 
public class Scenery extends JPanel
{
	int background, weather, sun;

	public Scenery(int background, int weather, int sun)
	{
		this.background = background;
		this.weather = weather;
        this.sun = sun;
	}
	public Dimension getPreferredSize() 
    {
        //Sets the size of the panel
        return new Dimension(800,600);
    }
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);

        Color colorDarkBlue = new Color(0, 0, 75);
        Color colorLightBlue = new Color(0, 0, 255);
        Color colorDarkGreen = new Color(0, 75, 0);
        Color colorDarkerGreen = new Color(0, 45, 0);
        Color colorLightGreen = new Color(0, 255, 0);
        Color colorLightGray = new Color(160, 160, 160);
        Color colorDarkGray = new Color(90, 90, 90);
        Color colorYellow = new Color(255, 255, 0);
        Color colorOrange = new Color(255, 190, 0);
        Color colorGray = new Color(60, 60, 60);
        Color colorLightBrown = new Color(145, 115, 60);
        Color colorDarkBrown = new Color(80, 65, 30);
        if ( background == 1)
        {
			g.setColor(colorLightBlue);
        	g.fillRect(0, 0, 800, 600);
        	g.setColor(colorLightGreen);
        	g.fillRect(0, 500, 800, 100);

        	g.setColor(colorYellow);
        	g.fillOval(sun, 20, 100, 100);
        	g.setColor(colorOrange);
        	g.fillOval(sun + 25, 45, 50, 50);

        	g.setColor(colorDarkGreen);
        	g.fillRect(300, 475, 10, 25);
        	g.setColor(colorOrange);
        	g.fillOval(295, 450, 25, 25);
        	g.setColor(colorYellow);
        	g.fillOval(302, 457, 10, 10);

            g.setColor(colorDarkGreen);
            g.fillOval(100, 460, 70, 50);
            g.fillOval(130, 450, 50, 40);
            g.fillOval(140, 470, 60, 40);

        	int x = -50;
        	while (x <= 800)
        	{
        		g.setColor(colorLightBrown);
        		g.fillRect(x + 100, 400, 40, 100);
        		g.setColor(colorDarkGreen);
        		g.fillOval(x + 50, 350, 75, 90);
        		g.fillOval(x + 80, 330, 80, 70);
        		g.fillOval(x + 100, 350, 75, 80);
        		x = x + 170;
        	}
        	
            g.setColor(colorDarkGreen);
            g.fillOval(500, 460, 60, 50);
            g.fillOval(530, 450, 40, 30);
            g.fillOval(540, 470, 70, 40);

        	if (weather == 2)
        	{
        		g.setColor(colorLightGray);
        		g.fillOval(100, 50, 75, 40);
        		g.fillOval(125, 75, 50, 30);
        		g.fillOval(130, 35, 60, 30);
        		g.fillOval(150, 50, 75, 40);
        		g.fillOval(155, 70, 50, 30);

        		g.fillOval(300, 170, 75, 40);
        		g.fillOval(325, 195, 50, 30);
        		g.fillOval(330, 155, 60, 30);
        		g.fillOval(350, 170, 75, 40);
        		g.fillOval(355, 190, 50, 30);

        		g.fillOval(600, 70, 75, 40);
        		g.fillOval(625, 95, 50, 30);
        		g.fillOval(630, 55, 60, 30);
        		g.fillOval(650, 70, 75, 40);
        		g.fillOval(655, 90, 50, 30);
        	}
        }
        else if ( background == 2)
        {
        	g.setColor(colorDarkBlue);
        	g.fillRect(0, 0, 800, 600);
        	g.setColor(colorDarkGreen);
        	g.fillRect(0, 500, 800, 100);

        	g.setColor(colorLightGray);
        	g.fillOval(sun, 20, 100, 100);
        	g.setColor(colorDarkGray);
        	g.fillOval(sun + 50, 50, 25, 25);
        	g.fillOval(sun + 20, 80, 20, 20);

        	g.setColor(colorDarkerGreen);
        	g.fillRect(300, 475, 10, 25);
        	g.setColor(colorOrange);
        	g.fillOval(295, 452, 25, 25);
        	g.setColor(colorYellow);
        	g.fillOval(302, 459, 10, 10);

            g.setColor(colorDarkerGreen);
            g.fillOval(100, 460, 70, 50);
            g.fillOval(130, 450, 50, 40);
            g.fillOval(140, 470, 60, 40);

        	int x = -50;
	        while (x <= 800)
	        {
	     		g.setColor(colorDarkBrown);
	        	g.fillRect(x + 100, 400, 40, 100);
	        	g.setColor(colorDarkerGreen);
	        	g.fillOval(x + 50, 350, 75, 90);
	       		g.fillOval(x + 80, 330, 80, 70);
	       		g.fillOval(x + 100, 350, 75, 80);
	       		x = x + 170;
	        }

            g.setColor(colorDarkerGreen);
            g.fillOval(500, 460, 60, 50);
            g.fillOval(530, 450, 40, 30);
            g.fillOval(540, 470, 70, 40);

        	if (weather == 2)
        	{
        		g.setColor(colorGray);
        		g.fillOval(100, 50, 75, 40);
        		g.fillOval(125, 75, 50, 30);
        		g.fillOval(130, 35, 60, 30);
        		g.fillOval(150, 50, 75, 40);
        		g.fillOval(155, 70, 50, 30);

        		g.fillOval(300, 170, 75, 40);
        		g.fillOval(325, 195, 50, 30);
        		g.fillOval(330, 155, 60, 30);
        		g.fillOval(350, 170, 75, 40);
        		g.fillOval(355, 190, 50, 30);

        		g.fillOval(600, 70, 75, 40);
        		g.fillOval(625, 95, 50, 30);
        		g.fillOval(630, 55, 60, 30);
        		g.fillOval(650, 70, 75, 40);
        		g.fillOval(655, 90, 50, 30);
        	}
        }
    }
    public void animate()
    {
        while(true)
        {
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            if (sun >= 800)
            {
                sun = -50;
            }
            sun = sun + 1;
            repaint();  
        }
    }
}