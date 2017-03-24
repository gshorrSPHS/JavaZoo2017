public class BabyHedgehog extends Hedgehog implements Walking
{
    public BabyHedgehog()
    {
        super("Baby Hedgehog:", "Cute baby hedgehog with soft needles.\n");
    }
    
    public String eat()
    {
        return "Baby Hedgehog eats fruits.\n";
    }
    
    public String play()
    {
        return "Baby Hedgehog plays with a toy and puts its head in a hole.\n";
    }
    
    public String makeNoise()
    {
        return "Baby Hedgehog purrs.\n";
    }
    
    public String walk()
    {
        return "Baby Hedgehog crawls.\n";
    }
}