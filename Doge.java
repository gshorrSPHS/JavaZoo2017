import java.awt.*;
import javax.swing.*;
import java.net.URL;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.sound.sampled.*;

public class Doge extends Animal
{

    public Doge()
    {
        super("Doge", "The supreme Shibe");
    }

    public String eat()
    {
        new Thread(()->
            {
                try
                {
                    JFrame frame = new JFrame("DOGE");
                    frame.setSize(640, 640);
                    frame.setLocationRelativeTo(null);
                    frame.setResizable(false);
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    frame.setAlwaysOnTop(true);

                    BufferedImage img = ImageIO.read(new URL("http://i.imgur.com/4i6bsu0.jpg"));
                    JLabel label = new JLabel(new ImageIcon(img));
                    frame.add(label);

                    frame.setVisible(true);

                    while (true) {
                        frame.setLocation((int)(Math.random()*1000), (int)(Math.random()*1000));
                        Thread.sleep(350);
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }).start();
        return "";
    }

    public String play()
    {
        String[] prefix = {"so", "such", "many", "much", "very"};
        String[] suffix = {"wow", "respect", "amaze", "excite"};
        new Thread(()->
            {
                try
                {
                    while(true)
                    {
                        System.out.println(prefix[(int)(Math.random()*prefix.length)] + " " + suffix[(int)(Math.random()*suffix.length)]);
                        Thread.sleep(500);
                    }
                } 
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }).start();
        return "";
    }

    public String makeNoise()
    {
        return "bark.";
    }

}
