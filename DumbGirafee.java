
public class DumbGirafee extends Girafee implements Flying
{
    public DumbGirafee(String name, String description)
    {
        super(name, description);
    }
    
    @Override
    public String walk()
    {
        return "The dumb girafee walks while dragging its face along the floor.";
    }
    
    public String fly()
    {
        return "The dumb girafee twirls its neck around so fast it flies.";
    }
    
    @Override
    public String play()
    {
        return "The dumb girafee wanders in circles and chases tail like a dog.";
    }
    
    @Override
    public String swim()
    {
        return "The dumb girafee blows bubbles in the water and pretends to be a crocodile...";
    }
}
