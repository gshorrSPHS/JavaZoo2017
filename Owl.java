public class Owl extends Animal implements Flying
{
    public Owl(String name, String description)
    {
        super(name, description);
    }
    
    public Owl()
    {
        super("owl", "wise nocturnal predators with big glowing eyes");
    }
    
    public String eat()
    {
        return "they slyly hunt small animals in the dim night";
    }
    
    public String play()
    {
        return "they play hide and seek in the hallows of trees";
    }
    
    public String makeNoise()
    {
        return "hoo hoo";
    }
    
    public String fly()
    {
        return "";
    }
}
