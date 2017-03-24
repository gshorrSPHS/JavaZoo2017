public class SeaWorldKillerWhale extends KillerWhale implements Swimming
{
    public SeaWorldKillerWhale()
    {
        super("SeaWorld Killer Whale","This killer whale performs in shows hourly");
        
        

    
    }
    
    public String eat()
    {
        return "SeaWorld killer whales eat squid";
    }
    
    public String play()
    {
        return " SeaWorld killer whales are too sad to play";
    }
    
    public String makeNoise()
    {
        return "cries";
    }
    
    public String swim()
    {
        return "SeaWorld killer whales have no room to swim";
    }
}