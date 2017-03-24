public class Bear extends Animal implements Walking, Swimming
{
    private String furColor;
    public Bear()
    {
        super("Bear", "Not as scary as you think.");
    }

    public Bear(String name, String description)
    {
        super(name, description);
    }

    public String furColor()
    {
        return "Mostly brown, but polar bears have white fur.";
    }

    public String eat()
    {
        return "Catches fish in a river and collects honey on land.";
    }

    public String play()
    {
        return "Can play games with its cubs.";
    }
    
    public String makeNoise()
    {
        return "Roar!";
    }

    public String walk()
    {
        return "Walks on all fours.";   
    }

    public String swim()
    {
        return "Can swim in shallow waters.";
    }
}