public class JapaneseSpiderCrab extends Animal implements Walking 
{
   
    public JapaneseSpiderCrab(String name, String description)
    {
        super(name, description);
    }
    
    public String eat()
    {
        return "The crab stalks toward its prey, a mollusk. It is sad and hungry."; 
    }
    
    public String play()
    {
        return "The terrifying crab migrates around without any friends to match its size.";
    }
    
    public String makeNoise()
    {
        return "tap tap tap tap.... tap tap";
    }
    
    public String walk()
    {
        return "walks around clumsily...";
    }
}