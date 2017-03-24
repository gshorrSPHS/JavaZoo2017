public class Toucan extends Animal implements Flying, Walking
{
    public Toucan()
    {
        super("Toucan", "Toucans are members of the Ramphastidae family. \nThe Ramphastidae family is most closely related to the American barbets. \nThey are brightly marked and have large, often-colorful bills.");
    }
    
    public Toucan(String name, String description)
    {
        super(name, description);
    }
    
    public String eat()
    {
        return "The toucan peacefully picks off fresh fruit off the tree with it's long, colorful bill";
    }
    
    public String play()
    {
        return "The toucan splashed about in a nearby water fountain";
    }
    
    public String makeNoise()
    {
        return "//*SQUAK!/ //*SQUUUAAAAAAAAK!!!/";
    }
    
    public String fly()
    {
        return "The toucan flys elegantly around the glassed enclosure.";
    }
    
    public String walk()
    {
        return "The toucan derply walks around like a derpy toucan does.";
    }
}