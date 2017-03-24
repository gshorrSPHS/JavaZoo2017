public class SmokyJungleFrogJr extends SmokingJungleFrog
{
    public SmokyJungleFrogJr()
    {
        super("Smoky Jungle Frog Jr. ", "The son of Smoking Jungle Frog, but it quits smoking.");
    }
    
    public SmokyJungleFrogJr(String name, String description)
    {
        super(name, description);
    }
    
    public String makeNoise()
    {
        return "MEEEOOOOWWWW MEOw MEow Meow meow...";
    }
    
    public String eat()
    {
        return "This frog eats lizards, snake, and small birds!";
    }
    
    public String play()
    {
        return "It disappears, apparently it does not really like you.";
    }
    
    public String swim()
    {
        return "It jumps into the water and swims.";
    }
}