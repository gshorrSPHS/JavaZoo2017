public class MeanHippo extends Hippo implements Walking
{
    
    public MeanHippo(String name, String description)
    {
        super(name, description);
    }
    public MeanHippo()
    {
        super("Hippo", "Friendly looking animals who are secretly the devil and will chomp your face off.");
    }
    public String eat()
    {
        return "Mean hippos eat whatever they want. Especially faces.";
    }
    public String play()
    {
        return "Mean Hippos don't play, they just pout.";
    }
    public String makeNoise()
    {
        return "I AM A VERY MEAN HIPPO!!!!!";
    }
    public String walk()
    {
        return "";
    }
}