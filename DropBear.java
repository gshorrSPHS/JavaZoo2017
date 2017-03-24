public class DropBear extends Animal implements Walking
{
    public DropBear()
    {
        super("Thylarctos plummetus", "Drops from trees to mutilate victim. "+
                                      "\nMore commonly known as Dropbear.");
                                     
    }
    public DropBear(String name, String description)
    {
        super(name, description);
    }
    public String makeNoise()
    {   
        return "The DropBear's only noise is the screams of its victims.k";
    }
    public String play()
    {
        return "The DropBear does not play.";
    }
    public String eat()
    {
        return "The DropBear eats tourists exploring the brush of Australia.";
    }
    public String walk()
    {
        return "The DropBear does not walk but teleports from tree to victim\n and victim to tree";
    }
}