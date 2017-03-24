public class Dolphine extends Animal implements Swimming
{
    public Dolphine()
    {
        super("Dolphine", "Very intelligent and cute marine animal!");
    }
    
    public Dolphine(String name, String des)
    {
        super(name, des);
    }
    
    public String eat()
    {
        return "They eat fishes";
    }
    
    public String play()
    {
        return "They play football with jellyfish and talk with their friend";
    }
    
    public String makeNoise()
    {
        return "BIIEEEEEEE";
    }
    
    public String swim()
    {
        return "They swim with very fast speed :o";
    }
    
    
    
    
    
    
}