public class MantisShrimp extends Animal implements Walking, Swimming
{
    public MantisShrimp()
    {
        super("Name: Mantis Shrimp", "Description: The crustacean of many colors.");
    }
    
    public String eat()
    {
        return "Eats: live fish, crabs, worms, and shrimps (including other Mantis Shrimp)";
    }
    
    public String play()
    {
        return "Play: does not play. It can break glass even though \n      it only grows up to 10 centimeters.";
    }
    
    public String makeNoise()
    {
        return "Noise: *light tapping*";
    }
    
    public String walk()
    {
        return "Walk: Walks on ocean floor.";
    }
    
    public String swim()
    {
        return "Swim: Swims in ocean.";
    }
}