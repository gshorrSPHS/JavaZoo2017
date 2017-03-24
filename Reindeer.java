public class Reindeer extends Animal implements Walking, Swimming, Flying
{
    public Reindeer(String name, String description)
    {
        super(name, description);
    }
    
    public Reindeer()
    {
        super("Reindeer", "A magical creature that flies through the sky \n" +    
              "on the night of Christmas Eve to help Santa deliver gifts \n" + 
              "to the children of the world.");
    }
    
    public String eat()
    {
        return "I love carrots. Carrots are like candy to me.";
    }
    
    public String play()
    {
        return "I love to fly around Santa's workshop with my friends \n" +
                "while singing Christmas carols!";
    }
    
    public String makeNoise()
    {
        return "meow";
    }
    
    public String walk()
    {
        return "Doo-doo-doo-doo-doo. Yay, I am walking.";
    }
    
    public String swim()
    {
        return "swimmy swim swim";
    }
    
    public String fly()
    {
        return "Eee! I'm flying!";
    }
}

