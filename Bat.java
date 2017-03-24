public class Bat extends Animal implements Flying
{
    public Bat(String name, String description)
    {
        super(name, description);
    }
    
    public Bat()
    {
        super("Bat", "I sleep in dark and am creepy.");
    }
    
    public String eat()
    {
        return "I eat insects.";
    }
    
    public String play()
    {
        return "I fly around, bitting and scaring people.";
    }
    
    public String makeNoise()
    {
        return "I make a squeaking sound.";
    }
    
    public String fly()
    {
        return "I also fly.";
    }
}