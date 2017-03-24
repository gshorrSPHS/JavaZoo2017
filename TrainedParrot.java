public class TrainedParrot extends Parrot implements Flying, Walking
{
    private String name;
    private String description;
    private int cm;
  
    public String  eat()
    {
        return "The parrot crushes a nut between its beak\n and swallows it.";
    }
    public String play()
    {
        return "It plays with you. At least it didn't mock you this time.";
    }
    public String makeNoise()
    {
        return "HELLO.";
    }
    public String fly()
    {
        return "The trained parrot does a spin in the air.";
    }
    public String walk()
    {
        cm +=5;
        return "The parrot walks " + cm +" cm.";
    }
}