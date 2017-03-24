public class PufferFish extends Animal implements Swimming
{
    public PufferFish()
    {
        super("Puffer Fish", "The Balloon that Pokes");
    }
    public PufferFish(String name, String description)
    {
        super(name, description);
    }
    public String eat()
    {
        return "I don't even know... maybe plankton?";
    }
    public String play()
    {
        return "Bounces off other fish";
    }
    public String makeNoise()
    {
        return "Puff, puff, puff!";
    }
    public String swim()
    {
        return "Wiggle, puff, wiggle, puff";
    }
}