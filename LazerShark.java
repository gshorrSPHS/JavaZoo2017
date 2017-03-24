public class LazerShark extends Animal implements Swimming, Walking
{
    private int numVictims;
    
    public LazerShark()
    {
        super("Lazer Shark", "G(old)");
        numVictims = 0;
    }
    
    public String eat()
    {
        numVictims++;
        return "The shark cruelly kills the victim with a blast from the lazer.";
    }
    
    public String play()
    {
        return "The shark patiently waits for its prey.";
    }
    
    public String makeNoise()
    {
        return "Pew! Pew!";
    }
    
    public String swim()
    {
        return "The shark advances to its next hiding. What would it do?";
    }
    
    public String walk()
    {
        return "The prey thought it escaped. But then SUDDENLY the lazer shark \nraced up the shore and devoured the poor creature.";
    }
    
    public int getVictims()
    {
        return numVictims;
    }
}