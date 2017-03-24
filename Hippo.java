public class Hippo extends Animal implements Walking 
{
    public Hippo(String name, String description)
    {
        super(name, description);
    }
    public Hippo()
    {
        super("Hippo", "Friendly looking animals who have a secret mean side.");
    }
    public String eat()
    {
        return "Hippos are herbivores that enjoy land and aquatic grasses. They eat around 88 pounds a day.";
    }
    public String play()
    {
        return "Hippos enjoy swimming and lying around in their free time. But don't get them angry or they will chomp your face off.";
    }
    public String makeNoise()
    {
        return "Huffs, Puffs, and Grunts.";
    }
    public String walk()
    {
        return "";
    }
}