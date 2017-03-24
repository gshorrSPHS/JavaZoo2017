public class Loki extends Animal implements Walking
{
    public Loki()
    {
        super("\nLoki", "Deciever of the gods");
    }
    public Loki(String name, String description)
    {
        super(name, description);
    }
    public String play()
    {
        return "Shift shapes and stuff";
    }
    public String makeNoise()
    {
        return "REEEEEEEEEEEEEE";
    }
    public String eat()
    {
        return "I don't know Loki just eats whatever";
    }
    public String birth()
    {
        return "Take form of Sleipnir, the eight-legged mare, and birth Jörmungandr, Fenrir, and Hel";
    }
    public String walk()
    {   
        return "Just walk";
    }
}