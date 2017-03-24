public class SatinAngoraRabbit extends AngoraRabbit
{
    public SatinAngoraRabbit()
    {
        super("Satin Angora Rabbit", "A particularly shiny Angora Rabbit.", 'X');
    }
    public SatinAngoraRabbit(String name, String description, char sex)
    {
        super(name, description, sex);

    }
    public SatinAngoraRabbit(char sex)
    {
        super("Satin Angora Rabbit", "A particularly shiny Angora Rabbit.", sex);
    }
    
    public String play()
    {
        return getName() + " leisurely allows you to pet " + getHisHer() + " silky fur."; 
    }
    
    public String castSpell()
    {
        return getName() + " entrances you with " + getHisHer() + " beady eyes before capturing you in " + getHisHer() + " mass of silky fluff.";
    }
}