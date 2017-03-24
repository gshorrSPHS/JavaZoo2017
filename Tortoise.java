public class Tortoise extends Animal implements Walking 
{
    public Tortoise()
    {
        super("Tortoise", "Shelly reptilian" );
    }
    
    public Tortoise(String name, String description)
    {
        super(name, description);
    }
    
    public  String eat()
    {
        return "Tortoise: Nom Nom Lettuce\n";
    }
    public  String play()
    {
        return "Tortoise goes 'yayy' \n ";
    }
    
    public  String makeNoise()
    {
        return "Tortoise goes 'aarrrggghh' \n";
    }
    
    public String walk()
    {
        return "Tortoise walks around sloooooowly\n";
    }
    
    
    
}