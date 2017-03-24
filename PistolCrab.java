public class PistolCrab extends Animal implements Swimming, Flying
{
    private int shotsFired;
    
    public PistolCrab()
    {
        super("Pistol Crab", "The terror of the sea floor.");
        shotsFired = 0;
    }
    
    public PistolCrab(String name, String description)
    {
        super(name, description);
        shotsFired = 0;
    }
    
    public String play()
    {
        return "Silently lurks in the shadows awaiting prey.";
    }
    
    public String eat() 
    {
        shotsFired++;
        return "Sends a shockwave at a shrimp and leisurely devours it.";
    }
    
    public String makeNoise()
    {
        return "pew pew";
    }
    @Override
    public String getDescription()
    {
        return super.getDescription() + "\nShots Fired: " + shotsFired;
    }
}