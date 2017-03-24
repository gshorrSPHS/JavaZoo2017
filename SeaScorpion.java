public class SeaScorpion extends Animal implements Swimming
{
    public SeaScorpion()
    {
        super("Dennis",
        "Straight-edge stay at home dad that shops at the vans store.");
    }
    
    public SeaScorpion(String name, String description)
    {
        super(name, description);
    }
    
    @Override
    public String swim()
    {
        return "*Swoosh Swoosh*";
    }
    
    @Override
    public String eat()
    {
        return "*Feasts upon soul*";
    }
    
    @Override
    public String makeNoise()
    {
        return "*Squeek*";
    }
    
    @Override
    public String play()
    {
        return "*Stares intently*";
    }
}