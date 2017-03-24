public class Mink extends Animal implements Swimming, Walking
{
    private String minky;
    
    public Mink()
    {
        super("one mink","Minks are cute.");
        minky = "other minks";
    }
    
    public Mink(String name, String desc, String minky)
    {
        super(name, desc);
        this.minky = minky;
    }
    
    @Override
    public String makeNoise()
    {
        return "Ahhhzhzhzhzhz!";
    }
    
    public String play()
    {
        return "The " + super.getName() + " plays with the " + minky + ".";
    }
    
    public String eat()
    {
        return "The minks hunt and eat fish.";
    }
    
    @Override
    public String swim()
    {
        return "The minks swim in order to hunt for fish.";
    }
    
    public String walk()
    {
        return "The minks walk with their four legs.";
    }
}