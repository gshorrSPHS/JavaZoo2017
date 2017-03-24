public class Enderman extends Animal implements Walking, Swimming
{
    public Enderman (String name, String description)
    {
        super(name, description);
    }
    
    public Enderman ()
    {
        super();
    }
    
    public String eat()
    {
        return "The Enderman has not been observed to consume anything.";
    }
    
    public String play()
    {
        return "Endermen are aloof creatures who spends their time in the presence\n" +
                "of the Ender Dragon in the End dimension whenever possible.";
    }
    
    public String makeNoise()
    {
        return "Endermen create something similar to a high pitched \n" +
                "yet soft screech.";
    }
    
    public String walk()
    {
        return "While Endermen do walk, their main form of movement comes from\n" +
                "teleportation.";
    }
    
    public String swim()
    {
        return "Endermen can not swim as they are sensitive creatures\n" +
                "that can not expose themselves to water.";
    }
    
}