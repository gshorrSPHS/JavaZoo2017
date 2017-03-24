public class Magikarp extends Animal implements Swimming, Walking
{
    private int flopAmount;
    
    public Magikarp()
    {
        super("Magikarp", "Some worthless pokemon that everyone hates");
        flopAmount = 0;
    }
    
    public Magikarp(String name, String description)
    {
        super(name, description);
        flopAmount = 0;
    }
    
    public String walk()
    {
        return "Flops";
    }
    
    public String swim()
    {
        return "Floats with the current in an attempt to get somewhere";
    }
    
    public String eat()
    {
        flopAmount+= 2;
        return "Nibbles at a piece of lint and then flops twice.";
    }
    
    public String play()
    {
        flopAmount+= 3;
        return "Attempts to flop toward you and only makes it half way before it gives up.";        
    }
    
    public String makeNoise()
    {
        flopAmount++;
        return "Makes some weird noise and flops in the process.";
    }
    
    public String evolve()
    {
        if(flopAmount >= 50)
        {
            return "Magikarp starts to flop wildly. It starts to glow brighter and brighter till" + 
            " you are forced to cover your eyes. You hear a really loud roar and as your eyes recover"
            + " there is a Gyrados in front of you. Except it is on land and flopping like mad.";
        }
        else
        {
            flopAmount+= 2;
            return "Magikarp flops twice and makes some weird sound you've never heard before.";
        }
    }
}