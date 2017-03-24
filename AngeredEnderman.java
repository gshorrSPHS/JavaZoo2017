public class AngeredEnderman extends Enderman
{
    public AngeredEnderman (String name, String description)
    {
        super(name, description);
    }
    
    public AngeredEnderman ()
    {
        super();
    }
    
    public String play()
    {
        return "When provoked through force or eye contact, endermen will turn violent\n"+
                "and will attempt to attack the provoker with a terrifying vigor.";
    }
    
    public String makeNoise()
    {
        return "When provoked, endermen screeches will become louder and\n"+
                "more frequent. The provoker will hear a strange static noise\n"+
                "when being chased by an enderman";
    }
}