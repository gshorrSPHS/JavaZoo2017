
public class Horse extends Animal implements Walking
{
    // instance variables - replace the example below with your own
    private int numOfMiles;

    /**
     * Constructor for objects of class Horse
     */
    public Horse()
    {
      super("Horse", "The most charismatic and the fastest animal.");
      numOfMiles = 0;
    }

    public Horse (String name, String description)
    {
        super(name, description);
        numOfMiles = 0;
    }
    
    public String walk()
    {
        numOfMiles++;
        return "I am walking a mile, but I can run as fast as a car if I want!";
        
    }
    
    public String eat()
    {
        return "Omnumnum. I love eating hay.";
        
    }
  
    public String makeNoise()
    {
        return "neighhh~neighhh~";
    }
    
    public String play()
    {
        return "ball! ball! I love playing with my ball!";
    }
}
