public class BlueDragon extends Animal implements Swimming
{
    public BlueDragon()
    {
        super("Blue Dragon", "Chills and floats around.");
    }
    
    public BlueDragon(String name, String description)
    {
        super(name, description);
    }
    
    public String swim()
    {
        return "The Blue Dragon swims into the sunlight.";
    }

    @Override public String eat()
    {
        return "Slurpy slurp";
    }
    
    @Override public String makeNoise()
    {
        return "Hssss...";
    }
    
    @Override public String play()
    {
        return "The Blue Dragon tries to breathe fire, but instead makes a couple innocent bubbles.";
    }
}