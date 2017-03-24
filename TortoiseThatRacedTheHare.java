public class TortoiseThatRacedTheHare extends Tortoise implements Walking 
{
    public TortoiseThatRacedTheHare()
    {
        super("Tortoise that raced the Hare", "Tortoise that appears in Aesop's 'Toroise and the Hare'" );
    }
    
    
    public  String eat()
    {
        return "Tortoise eats to prepare for the race\n";
    }
    public  String play()
    {
        return "Tortoise practices running \n ";
    }
    
    public  String makeNoise()
    {
        return "Tortoise goes 'Yayy, I won!' \n";
    }
    
    public String walk()
    {
        return "Tortoise walks without stopping to beat the hare!\n ";
    }
    
    
    
}