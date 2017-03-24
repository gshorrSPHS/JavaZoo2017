public class Girafee extends Animal implements Walking, Swimming
{
    public Girafee(String name, String description)
    {
        super(name, description);
    }
    
    public String makeNoise()
    {
        return "SLUUUUUUUUrρ";
    }
    
    public String play()
    {
        return "The girafee wanders in circles and chases tail like a dog.";
    }
    
    public String eat()
    {
        return "SLOBBERSLURPNOM";
    }
    
    public String walk()
    {
        return "Girafee walks in a circle.";
    }
    
    public String swim()
    {
        return "Girafee walks into water and stands with head sticking out.";
    }
}