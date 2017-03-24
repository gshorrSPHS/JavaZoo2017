public class PolarBear extends Animal implements Walking
{
    public PolarBear()
    {
        super("Polar Bear", "Very cute, but the most dangerous animal");
    }
    
    public PolarBear(String name, String description)
    {
        super(name, description); 
    }
    
    public String eat()
    {
        return "Polar bear eats EVERYTHING! (grass,meat)";
    }
    
    public String play()
    {
        return "Polar bear play with their friend/family";
    }
    
    public String makeNoise()
    {
        return "GRUHHHHH";
    }
    
    public String walk()
    {
        return "walk with 4 legs...It runs very fast!!";
    }
}