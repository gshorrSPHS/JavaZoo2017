public class PetRock extends Animal implements Walking, Swimming, Flying
{
    public PetRock()
    {
        super("Rocky Balboa", "The Pet Rock (petram domesticus) does nothing. Literally nothing.");
    }
    
    public PetRock(String name, String description)
    {
        super(name, description);
    }
    
    public String eat()
    {
        return "You toss it a carrot. The carrot sits there, slowly decaying." + 
               "\nYou question your sanity.";
    }
    
    public String play()
    {
        return "You toss a ball at it. It does nothing. It judges you.";
    }
    
    public String makeNoise()
    {
        return "It sits there, silently. It stares into your soul.";
    }
    
    public String fly()
    {
        return "You toss it into the air. It falls to the ground.";
    }
    
    public String walk()
    {
        return "You tie a leash around it. The leash slips off." +
               "\nIt sits there, unmoving.";
    }
    
    public String swim()
    {
        return "It lies in the surf. It is being slowly rounded by the waves.";
    }
}