public class Giraffe extends Animal implements Walking
{
    private int neckHeight;
    public Giraffe()
    {
        super("Giraffe", "They have long necks.");
        neckHeight = 6;
    }
    public Giraffe(String name, String description)
    {
        super(name, description);
    }
    public String neckHeight()
    {
        return "The average neck height is " + neckHeight + " feet long!";
    }
    public String eat()
    {
        return "They use their long tongues for eating off of tall trees.";
    }
    public String play()
    {
        return "They run around in circles and play with other giraffes.";
    }
    public String makeNoise()
    {
        return "They make a peculiar noise.";
    }
    public String walk()
    {
        return "They walk slowly on all fours.";
    }
}