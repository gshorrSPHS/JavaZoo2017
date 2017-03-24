public class HarpSeal extends Animal implements Swimming
{
    private String smile, noise;
   
    public HarpSeal()
    {
        super("Harp Seal", "Always smile");
    }
    
    public String makeNoise()
    {
       return "Qew";
    }
    
    public String play()
    {
        return "Roll";
    }
    
    public String eat()
    {
        return "small fishes";
    }
    
    public String swim()
    {
        return "yes";
    }
    

}

