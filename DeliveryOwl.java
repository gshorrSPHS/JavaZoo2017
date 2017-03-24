public class DeliveryOwl extends Owl implements Flying
{
    public DeliveryOwl(String name, String description)
    {
        super(name, description);
    }
    
    public DeliveryOwl()
    {
        super("Delivery owl", "wise animals that use thier flight to deliver mail");
    }
    
    public String eat()
    {
        return "they slyly hunt small animals on their time off";
    }
    
    public String play()
    {
        return "they go on magical adventures with their friends";
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