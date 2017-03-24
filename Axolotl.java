public class Axolotl extends Animal implements Swimming, Walking
{
    private int numberOfLimbsGrown;
    
    public Axolotl(String name, String description, int numberOfLimbsGrown)
    {
        super(name, description);
        this.numberOfLimbsGrown = numberOfLimbsGrown;
    }
    
    public Axolotl()
    {
        super("Steve", "Cutest walkin fish in the sea");
        numberOfLimbsGrown = 49;
    }
    
    public String eat()
    {
        return "nom nom nom";
    }
    
    public String play()
    {
        return "roll over and swim around";
    }
    
    public String makeNoise()
    {
        return "grgr glug glug";
    }
    
    public String swim()
    {
        return "swims peacefully through the water";
    }
    
    public String walk()
    {
        return "Walks on the sea floor lookin cute af";
    }
    
}
