public class Mudkip extends Animal implements Walking,Swimming
{
    public Mudkip()
    {
        super("Mudkip","The best water type in all of history");
    }
    public String eat()
    {
       return "if feast on the fear of its fows." ;
    }
    public String play()
    {
        return "You battle some 10 year old with the almighty Mudkip \nMudSlaping your way to victory.\n The 10 year old hands you $200 how he got the money I don't know.";  
    }
    public String makeNoise()
    {
        return "The Mudkip simpily states 'Mudkip'";
    }
    public String walk()
    {
       return "it walks knowing that it is better than you." ;
    }
    public String swim()
    {
        return "it swims knowing that it is better than you.";
    }
    public Mudkip(String name, String description)
    {
        super(name , description);
    }
}