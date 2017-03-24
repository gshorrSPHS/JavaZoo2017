public class Hel extends Loki implements Walking
{
    public Hel()
    {
        super("\nHel", "Child of Loki, Creator of Hel");
    }
    public Hel(String name, String description)
    {
        super(name, description);
    }
    public String play()
    {
        return "NO TIME TO PLAY";
    }
    public String makeNoise()
    {
        return "Speak like any of the other gods speak it's not too hard";
    }
    public String eat()
    {
        return "Just eat whatever I don't care.";
    }
    public String walk()
    {   
        return "Walk around the realm";
    }
}