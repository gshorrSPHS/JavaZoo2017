public class Griffon extends Animal implements Flying, Walking
{
    public Griffon()
    {
        super("Griffon", "Soaring beast from up above");
    }
    
    public Griffon(String name, String description)
    {
        super(name, description);
    }
    
    public String eat()
    {
        return "Swoops from above and pecks it prey, which is anything that moves.";
    }
    
    public String play()
    {
        return "Races jets to see which is faster.";
    }
    
    public String makeNoise()
    {
        return "High pitched screech that can break your eardrums.";
    }
    
    public String walk()
    {
        return "Walks on clouds.";
    }
    
    public String fly()
    {
        return "Soars through the sky.";
    }
}