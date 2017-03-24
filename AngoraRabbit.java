public class AngoraRabbit extends Animal implements Walking, Jumping
{
    private String himHer;
    private String hisHer;
    
    public AngoraRabbit()
    {
        super("Angora Rabbit", "A particularly fluffy rabbit.");
    }
    public AngoraRabbit(char sex)
    {
        super("Angora Rabbit", "A particularly fluffy rabbit.");
        if (sex == 'F')
        {
            himHer = "her";
            hisHer = "her";
        }
        
        else if (sex == 'M')
        {
            himHer = "him";
            hisHer = "his";
        }
        
        else
        {
            himHer = "them";
            hisHer = "their";
        }
    
    }
    public AngoraRabbit(String name, String description, char sex)
    {
        super(name, description);
        if (sex == 'F')
        {
            himHer = "her";
            hisHer = "her";
        }
        
        else if (sex == 'M')
        {
            himHer = "him";
            hisHer = "his";
        }
        
        else
        {
            himHer = "it";
            hisHer = "its";
        }
    
    }
    
    public String eat()
    {
        return getName() + " softly munches on hay and " + hisHer + " own poop.";
    }
    
    public String play()
    {
        return getName() + " leisurely allows you to pet " + himHer + "."; 
    }
    
    public String makeNoise()
    {
        return "Munch munch munch.";
    }
    
    public String walk()
    {
        return getName() + " sprints in circles around the room.";
    }
    
    public String jump()
    {
        return getName() + " leaps onto the bed in a move you wouldn't expect from a rabbit of " + hisHer + " size.";
    }
    
    public String getHimHer()
    {
        return himHer;
    }
    
    public String getHisHer()
    {
        return hisHer;
    }
}