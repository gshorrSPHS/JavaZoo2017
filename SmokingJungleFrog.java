public class SmokingJungleFrog extends SmokyJungleFrog
{
    public SmokingJungleFrog()
    {
        super("Smkoing Jungle Frog", "A branch of Smoky Jungle Frog that can smoke(which is not good).");
    }
    
    public SmokingJungleFrog(String name, String description)
    {
        super(name, description);
    }
    
    public String makeNoise()
    {
        return "meOWWWWW~~~~~~~~~";
    }
    
    public String eat()
    {
        return "This frog start to ear cigars.";
    }
    
    public String play()
    {
        return "It tosses the cigar in the air and catch it";
    }
    
    public String swim()
    {
        return "It jumps into the water and swims.";
    }
}