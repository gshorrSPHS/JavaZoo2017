public class Hedgehog extends Animal implements Walking
{
    public Hedgehog ()
    {
        super("Hedgehog:", "Cute animal with needles.");
    }
    
    public Hedgehog (String name, String description)
    {
        super(name, description);
    }
    
    public String eat()
    {
        return "Hedgehog eats veggies.\n";
    }
    
    public String play()
    {
        return "Hedgehog rolls up into a ball.\n";
    }
    
    public String makeNoise()
    {
        return "Hedgehog squeals.\n";
    }
    
    public String walk()
    {
        return "Hedgehog walks.\n";
    }
}