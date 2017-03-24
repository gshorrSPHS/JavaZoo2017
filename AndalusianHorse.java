
public class AndalusianHorse extends Horse
{
    // instance variables - replace the example below with your own
    
    public AndalusianHorse()
    {
        super("Andalusian Horse", "The most powerful horse in the world.");
        
    }

    @Override
    public String play()
    {
       return "I pull carts and wagons using my strong legs!";
    }
    
    
    @Override
    public String walk()
    {
      return "Walk? I don't walk. I run.";
        
    }
    
    
}
