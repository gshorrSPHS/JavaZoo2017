public class TheRock extends PetRock
{
    public TheRock()
    {
        super("Dwayne Johnson", "Dwayne \"The Rock\" Johnson is an American actor," +
                                "\nproducer, singer, and professional wrestler.");
    }
    
    public String eat()
    {
        return "Can you smell what The Rock is cooking?";
    }
    
    public String play()
    {
        return "He knocks you down to the ground and plummets onto you.";
    }
    
    public String makeNoise()
    {
        return "He sings \"You're Welcome\" from the movie Moana.";
    }
    
    public String fly()
    {
        return "He jumps onto you from the top rope.";
    }
}