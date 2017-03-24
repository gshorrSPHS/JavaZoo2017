public class PacuFish extends Animal implements Swimming
{
    public PacuFish()
    {
        super("Pacu Fish", "The human teethed fish.");
    }
    public PacuFish(String name, String description)
    {
        this();
    }
    public String makeNoise()
    {
        return "Blub blub, I am a fish.";
    }
    public String play()
    {
        return "To play, Pacu Fish enjoy fighting to the death.";
    }
    public String eat()
    {
        return "Pacu Fish eat plants. That is why they have gross teeth.";
    }
    public String swim()
    {
        return "Pacu Fish swim in the waters of the Amazon.";
    }
}


