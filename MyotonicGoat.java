public class MyotonicGoat extends Animal implements Walking
{
    private int faintNumber;
    
    public MyotonicGoat()
    {
        super("Mytonic Goat", "Goats that appear to faint when startled");
        faintNumber = 0;
    }
    
    public String getName()
    {
        return super.getName();
    }
    
    public String getDescription()
    {
        return super.getDescription();
    }
    
    public String play()
    {
        faintNumber++;
        return "Goat runs around until a loud laugh causes it to faint" +
        "\nNumber of times fainted today: " + faintNumber;
    }
    
    public String eat()
    {
        return "Goat munches on whatever it can find";
    }
    
    public String makeNoise()
    {
        return "Whatsup";
    }
    
    public String walk()
    {
        return "Goat saunters about, fainting every time another animal frightens it";
    }
    
    
    
}