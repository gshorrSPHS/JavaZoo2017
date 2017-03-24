public class Parrot  extends Animal implements Flying, Walking
{
    private String name;
    private String description;
    private int cm;
    public Parrot()
    {
        super("Parrot", "Pirate's best friend.");
    }
    
    public String  eat()
    {
        return "The parrot crushes a nut between its beak\n and swallows it.";
    }
    public String play()
    {
        return "It imitates and mocks you. You feel sad.";
    }
    public String makeNoise()
    {
        return "SQQQQUUAAAAAWWWKKKKKKK";
    }
    public String fly()
    {
        return "The parrot flies. What did you expect?";
    }
    public String walk()
    {
        cm +=3;
        return "The parrot walks " + cm +" cm.";
    }
}