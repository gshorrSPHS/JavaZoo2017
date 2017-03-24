public class SmokyJungleFrog extends Animal implements Swimming
{
    public SmokyJungleFrog()
    {
        super("Smoky Jungle Frog ", "It is a brown jungle frog that make special noises");
    }
    
    public SmokyJungleFrog(String name, String description)
    {
        super(name, description);
    }
    
    public String makeNoise()
    {
        return "meow Meow MEow MEOw MEEEOOOOWWWW";
    }
    
    public String eat()
    {
        return "This frog eats lizards, snake, and small birds!";
    }
    
    public String play()
    {
        return "It only knows how to play hide and seek.";
    }
    
    public String swim()
    {
        return "It jumps into the water and swims.";
    }
}