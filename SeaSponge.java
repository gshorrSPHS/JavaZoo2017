
/**
 * Write a description of class SeaSponge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeaSponge extends Animal implements Swimming
{
    public SeaSponge()
    {
        super("Sea Sponge", "Motionless master of the sea.");
    }
    public SeaSponge(String name, String description)
    {
        super(name,description);
    }
    public String eat()
    {
        return "Savagely filters tiny plankton into its body";
    }
    public String play()
    {
        return "Spends several hours a day playing dead";
    }
    public String makeNoise()
    {
        return "bubble";
    }
    public String swim()
    {
        return "ERROR 404: swim not found";
    }
}
