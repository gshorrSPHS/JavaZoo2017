public class MaybeDropBear extends DropBear
{
    public MaybeDropBear()
    {
        super("Might be Thylarctos plummetus", "Could drop from trees to mutilate victim. "+
                                      "\nMight be more commonly known as Dropbear.");
    }
    public String makeNoise()
    {   
        return "The Dropbear's only noise might be the scream of his victims.";
    }
    public String play()
    {
        return "The DropBear might play.";
    }
    public String eat()
    {
        return "The DropBear might eat tourists exploring the brush of Australia.";
    }
    public String walk()
    {
        return "The DropBear might not walk but teleports from tree to victim\n and victim to tree";
    }
}