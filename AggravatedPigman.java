public class AggravatedPigman extends Animal implements Walking, Swimming
{
    private int numAngryPigmen;

    public AggravatedPigman()
    {
        super("Aggravated Pigman", "They're coming!");
        numAngryPigmen = 0;
    }

    public String eat()
    {
        numAngryPigmen = numAngryPigmen + (int) (Math.random() * 1001);
        return "They are hungry. Run or your lives!";
    }

    public String makeNoise()
    {
        return "oooooooo... ooooooooo...";
    }

    public String play()
    {
        if (numAngryPigmen > 0)
        {
            numAngryPigmen--;
        }
        return "They are happy and swimming in the lava.";
    }

    public String walk()
    {
        return "Numerous aggravated pigmen marched to their next target!";
    }
    
    public String swim()
    {
        return "Swimming in the lava. Another day as a pigman.";
    }
}