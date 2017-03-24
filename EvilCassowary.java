public class EvilCassowary extends Cassowary
{
    public EvilCassowary()
    {
        super("I am a EEEEEEEEEEEEvil Cassowary.\nMUHAHAHAHAHAHAHAHAHAH \n" ,"I am the lord of the dark" 
        + "I lurk in the darkest shawdows, waiting to strike.");
    }
    
    @Override
    public String eat()
    {
        return "I dine exclusively on foolish tourists who think I'm \"friendly\".\n";
    }
    
    @Override
    public String play()
    {
        return "I attack ANYTHING that moves, and even things that don't.\n";
    }
    
    @Override
    public String makeNoise()
    {
        return "MUHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHA\n";
    }
    
    @Override
    public String walk()
    {
       return "I lurk/prowel in the darkness just like a velociraptor";
    }
    
    @Override
    public String fly()
    {
       return "I don't fly, I float.That way I can more easily attack you, even in the air \n"
       +"\nYou are safe no where..... NOOOOOOO WHERE!!";
    }
    
}