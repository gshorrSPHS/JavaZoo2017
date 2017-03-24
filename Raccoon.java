public class Raccoon extends Animal implements Walking
{
    
    public Raccoon()
    {
        super("Raccoon", "Small masked animal that washes their food");
    }
    
    public Raccoon(String name, String description)
    {
        super(name, description);
    }
    
    public String eat()
    {
        return "Douses its food it found before eating";
    }
    
    public String play()
    {
        return "Invades homes and digs into trashcans";
    }
    
    public String makeNoise()
    {
        return "trllll trllll";//idk the sound of raccoons
    }
    
    public String walk()
    {
        return "Silently with its four paws... trying not to be spotted... camouflage in the dark... find free food.";
    }
}