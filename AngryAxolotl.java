public class AngryAxolotl extends Axolotl implements Swimming, Walking
{
    private int Axolotlsbeatenup;
    
    public AngryAxolotl(String name, String description, int numberOfLimbsGrown, int Axolotlsbeatenup)
    {
        super(name, description, numberOfLimbsGrown);
        this.Axolotlsbeatenup = Axolotlsbeatenup;
    }
    
    public AngryAxolotl()
    {
        super("Steve", "Angriest walkin fish in the sea", 700);
        Axolotlsbeatenup = 8;
    }
    
    public String eat()
    {
        return "nom nom nom give me more!";
    }
    
    public String play()
    {
        return "I dont want to play";
    }
    
    public String makeNoise()
    {
        return "grgr grrrr grrrr!!!";
    }
    
    public String swim()
    {
        return "swims angerily through the water";
    }
    
    public String walk()
    {
        return "Walks on the sea floor lookin angry af";
    }
    
}
