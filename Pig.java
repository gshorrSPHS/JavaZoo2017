public class Pig extends Animal implements Walk
{
    public Pig()
    {
        super("Pigster", "King of the farm.");
    }
    public Pig(String name, String description)
    {
        super(name, description);
    }
    public String walk()
    {
        return "Pigster trots across the field.";
    }
    @Override public String eat()
    {
        return "nom nom.";
    }
    @Override public String makeNoise()
    {
        return "oink.";
    }
    @Override public String play()
    {
        return "Pigster cooks some bacon.";
    }
}