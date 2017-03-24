public class NiceHippo extends Hippo implements Walking 
{
    public NiceHippo(String name, String description)
    {
        super(name, description);
    }
    public NiceHippo()
    {
        super("Hippo", "NICE HOIPPOS DON'T EXIST!!");
    }
    public String eat()
    {
        return "NICE HIPPOS DON'T EAT CAUSE THEY AREN'T REAL!!!!!";
    }
    public String play()
    {
        return "NICE HIPPOS DON'T PLAY CAUSE THEY DON'T EXIST !!!!!";
    }
    public String makeNoise()
    {
        return "I AM NOT REAL!!!!!!!";
    }
    public String walk()
    {
        return "";
    }
}