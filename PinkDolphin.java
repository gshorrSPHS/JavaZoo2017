public class PinkDolphin extends Dolphin
{
    public PinkDolphin()
    {
        super("Pink Dolphin", "The Most Beautiful of Them All");
    }
    
    public PinkDolphin(String name, String description)
    {
        super(name, description);
    }
    
    public String eat()
    {
        return "Gobbles up pink fishies";
    }
    
    public String play()
    {
        return "Makes pink water tornadoes with the pink posse";
    }
    
    public String makeNoise()
    {
        return "High screeching sounds";
    }
    
    public String swim()
    {
        return "Wiggle, swim, wiggle, swim";
    }
}