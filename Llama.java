public class Llama extends Animal implements Walking, Swimming
{
    public Llama()
    {
        super("Llama", "Fun and Furry");
    }
    
    public String walk()
    {
        return "Llama walks with confidence.";
    }
    
    public String swim()
    {
        return "Llama swims as a llama would swim.";
    }
    
    public String eat()
    {
        return "Llama eats some grass";
    }
    
    public String play()
    {
        return "Llama jumps arounds and rolls in grass";
    }
    
    public String makeNoise()
    {
        return "Bark!";
    }
}