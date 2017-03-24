public class Dolphin extends Animal implements Swimming
{
    public Dolphin()
    {
        super("Dolphin", "The Wiggle Baby of the Sea");
    }
    
    public Dolphin(String name, String description)
    {
        super(name, description);
    }
    
    public String eat()
    {
        return "Gobbles up fishies";
    }
    
    public String play()
    {
        return "Makes water tornadoes with the posse";
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