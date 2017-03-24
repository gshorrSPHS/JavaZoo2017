public class Mosquito extends Animal implements Flying, Walking
{
   public Mosquito()
   {
       super("mosquito", "likes to suck blood");
    }
    public Mosquito(String name, String description)
    {
        super(name, description);
    }
    public String eat()
   {
    return "eats blood"; 
    }
    public String play()
    {
      return "plays by sucking blood\n";  
    }
    public String makeNoise()
    {
       return "makes a blood sucking noise\n";
    }
    public String fly()
    {
        return "flys with its tiny wings fly\n";
    }
    public String walk()
    {
       return "walks by sucking blood"; 
    }
}