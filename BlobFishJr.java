public class BlobFishJr extends BlobFish
{
    private String name;
    private String description;
    public BlobFishJr(String name, String description)
    {
        name = "BlobFishJr";
        description = "still ugly fish.";
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