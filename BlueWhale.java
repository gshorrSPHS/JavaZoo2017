public class BlueWhale extends Animal implements Swimming
{
    private int milesMigrated=2000;
    
    public BlueWhale(String name, String description)
    {
        super(name, description);
        this.milesMigrated =milesMigrated;
        
    }
    
    public BlueWhale()
    {
        
        super("Blue Whale", "largest animal existing today.");
    }
    
    public String getDescription()
    {
        return super.getDescription()+".\n"+getMilesMigrated();
    }
    
    public String eat()
    {
        return "(Big silent) Munch.";
    }
    
    public String play()
    {
        return "do back flips";
    }
    
    public String makeNoise()
    {
        return "Eoooooon";
    }
    
    public String swim()
    {
        return "moves her tail and body, causing massive waves behind.";
    }
    
    public String getMilesMigrated()
    {
        
        return "The Blue Whale has traveles " + milesMigrated+ " miles each season.";
    }
}