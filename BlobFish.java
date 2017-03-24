public class BlobFish extends Animal implements Swimming
{
    public BlobFish()
    {
        super("BlobFish" , "Ugly Fish.");
    }
    
    public String eat()
    {
        return "Eats microscopic bacteria silently.";
    }
    
    public String play()
    {
        return "floats around.";
    }
    
    public String makeNoise()
    {
        return "...";
    }
    
    public String swim()
    {
        return "floats around.";
    }
}