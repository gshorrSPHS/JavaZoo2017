public class SandWyrm extends Animal implements Walking
{
    public SandWyrm()
    {
        super("Shai-Hulud", "A titantic beast capable of consuming starships.");
    }
    public SandWyrm(String name, String description)
    {
        super(name, description);
    }
    public String eat()
    {
        return "Opening a maw bigger than a building, it swallows it's prey, grinding the unlucky victim agains rows of razor sharp teeth.";
    }
    public String makeNoise()
    {
        return "Silence...then the sound of a thousand tortured souls grinding in it's maw.";
    }
    public String play()
    {
        return "Sandriders stand atop the massive beast, guiding it's motion with their maneuvering hooks.";
    }
    public String walk()
    {
        return "Nothing but a tunneling mound of sand until the beast erupts from deep underground, attracted only to the rhythic thumping upon the sands.";
    }
}