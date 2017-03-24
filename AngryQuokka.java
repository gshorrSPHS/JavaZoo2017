public class AngryQuokka extends Quokka
{
    public AngryQuokka()
    {
        super("An Angery Quokka", "Not the happiest animal in the world.");
    }
    
    public AngryQuokka(String name, String description)
    {
        super(name, description);
    }
    
    public String makeNoise()
    {
        return "Eeeee! >:(";
    }
    
    public String play()
    {
        return "The angry quokka angrily screeches into the void.";
    }
    
    public String eat()
    {
        return "The angry quokka furiously tears away at some leaves.";
    }
    
    public String walk()
    {
        return "The angry quokka angrily skitters across the tall grass.";
    }
    
    public String attack()
    {
        return "A group of angry quokkas angrily line up in formation and charges at their target.";
    }
}