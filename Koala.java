public class Koala extends Animal implements Walking
{
    public Koala()
    {
        super("Koala Bear", "The Most Adorable Tree Hugger in the World");
    }

    public Koala(String name, String description)
    {
        super(name, description);
    }

    public String eat()
    {
        return "leaves, leaves, and more leaves";
    }

    public String play()
    {
        return "sleep is better";

    }

    public String makeNoise()
    {
        return "too much effort";
    }

    public String walk()
    {
        return "never leaving my tree";
    }
}