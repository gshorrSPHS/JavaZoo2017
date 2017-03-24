public class Zebra extends Animal implements walking
{
    public Zebra()
    {
        super("Zebra", "The Equines of the Savanna.");
    }
    public Zebra(String name, String description)
    {
        super(name, description);
    }
    public String getName()
    {
        return super.getName();
    }
    public String getDescription()
    {
        return super.getDescription();
    }
    
    public String eat()
    {
        return super.getName() + " eats the dry grass.";
    }
    
    public String makeNoise()
    {
        return "yip yip yip";
    }
    
    public String play()
    {
        return super.getName() + " playfully bumps his companion.";
    }
    
    public String walk()
    {
        return super.getName() + " takes a nice stroll through the savanna.";
    }
}