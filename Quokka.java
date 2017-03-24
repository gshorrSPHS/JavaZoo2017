public class Quokka extends Animal implements Walking
{
    private int treesClimbed = 0;
    
    public Quokka(String name, String description)
    {
        super(name, description);
    }
    
    public Quokka()
    {
        super("Quokka", "The happiest animal in the world.");
    }
    
    public String makeNoise()
    {
        return "Eeeee :3c";
    }
    
    public String play()
    {
        treesClimbed++;
        return "The quokka happily climbs a tree with its friends." +
               "\nThis quokka has climbed " + treesClimbed + " tree(s).";
    }
    
    public String eat()
    {
        return "The quokka happily crunches on some leaves.";
    }
    
    public String walk()
    {
        return "The quokka happily walks around in the tall grass";
    }
}