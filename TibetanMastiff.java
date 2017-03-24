
public class TibetanMastiff extends Animal implements Walking   
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class asd
     */
    public TibetanMastiff()
    {
        super("Tibetan Mastiff", "Gigantic and Hairy");
    }

    public TibetanMastiff(String name, String description)
    {
        super(name, description);
    }
    
    
    public String walk()
    {
        return "Walk like a boss!";
    }
    
    public String eat()
    {
        return "Eat a ton of meat and wipe his mouth with tongue";
    }
    
    public String play()
    {
        return "Play with sheep and roll on the grass";
    }
    
    public String makeNoise()
    {
        return "Wang Wang Wang Wang Wang Wang Wang Meow";
    }
    
    
}
