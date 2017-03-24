public class Rhino extends Animal implements Walking
{
    private double hornLength; 

    public Rhino()
    {
        super("Tiny", "Gladiator of Africa");
    }
    
    public Rhino(String name, String description, double hornLength)
    {
        super(name, description); 
        this.hornLength = hornLength; 
    }
    
    public String walk()
    {
        return "A rhino is pretty crazy- it walks on all fours.";
    }
    
    public String eat()
    {
        return "It uses its lips to pluck leaves and fruit from the branches.";
    }
    
    public String play()
    {
        return "It practices sparring and head-tossing techniques.";
    }
    
    public String makeNoise()
    {
        return "It sounds like a balloon while air escapes";
    }
    
    
}