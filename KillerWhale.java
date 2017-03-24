public class KillerWhale extends Animal implements Swimming
{

    public KillerWhale()
    {
        super("Killer Whale", "Killer whales are dolphins not whales");
    }
    
    public KillerWhale(String name, String description)
    {
        super(name, description);
    }

    public String eat()
    {
        return "Killer whales eat fish and other small dolphins.";
    }

    public String play()
    {
        return "Splashes in water";
    }

    public String makeNoise()
    {
        return "Squeek";
    }

    public String swim()
    {
        return "Killer whales swim a hundred miles a day";

    }

}