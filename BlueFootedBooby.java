public class BlueFootedBooby extends Animal implements Flying
{
    public BlueFootedBooby()
    {
        super("Blue Footed Booby", "Flies down and swoops away the prey.");
    }
    
    public BlueFootedBooby(String name, String description)
    {
        super(name, description);
    }
    
    
    public String fly()
    {
        return "The Blue Footed Booby flies towards the sun.";
    }
    
    public String eat()
    {
        return "nom nom nom";
    }
    
    public String makeNoise()
    {
        return "erk erk erk onk erk erk";
    }
    
    public String play()
    {
        return "Blue Footed Booby plays with another Booby... another Blue Footed Booby.";
    } 
}