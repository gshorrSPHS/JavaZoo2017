public class MemoryParasite extends Animal implements Walking
{
    private String memory;
    
    public MemoryParasite(String name, String description, String memory)
    {
        super(name, description);
        this.memory = memory;
    }
    
    public String eat()
    {
        return super.getName() + "has now infected your memories, making you\nrememeber all the fun times you never had.";
    }
    
    public String play()
    {
        return "Remember that time when " + memory;
    }
    
    public String makeNoise() 
    { 
        return "Realizing that " + super.getName() + " was a parasite,\n" +
               "you shoot him, make some kind of death scream. Good shot!";
    }
    
    public String walk() { return super.getName() + " is now walking and talking about their favorite memories."; }
}