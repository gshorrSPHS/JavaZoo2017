public  class StarFish extends Animal implements Swimming
{
    private int patrick;
    
    public StarFish()
    {
        super("Star Fish", "Patrick the Star Fish.");
       
    }
    
    public String getName()
    {
        return "Star Fish";
    }
    
    public String getDescription()
    {
        return "Patrick the Star Fish under the rock";
    }
    
    public String eat()
    {
       return "eat Krabby Patty"; 
    }
    
    public String play()
    {
       return "play with spongebob"; 
    }
    
    
    public String makeNoise()
    {
       return "silent";
    }
    
    public String swim()
    {
        return "Swim";
    }
}