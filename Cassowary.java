public class Cassowary extends Animal implements Walking, Flying
{
    public Cassowary()
    {
        super("I am a Cassowary.\n" ,"I am the bird incarnation of Satan if he" + 
        " wanted to incarnate himself as a bird.\n");
    }
    
    public Cassowary(String name, String description)
    {
        super(name, description);
    }

    public String eat()
    {
        return "I om nom nom any small bugs or fruits that I can get into my mouth." +
        " \nAnd from time to time I also eat foolish tourists who think I'm friendly.\nLOL jk\n";
    }
    
    public String play()
    {
        return "I attack ANYTHING that moves, with my sword feet and club head.\n";
    }
    
    public String makeNoise()
    {
        return "AHHHHHHHHHHHHHHHHHHHHHH\n";
    }
    
    @Override
    public String walk()
    {
       return "I charge and the jump kick you\n";
    }
    
    @Override
    public String fly()
    {
       return "You think you're safe from me on you flight back from \nAustralia/Kiwi-land"
       + " but you're not. \nI can fly by jumping really high and then rotating my neck around"
       + " in a circle really quickly.\n";
    }
    
}