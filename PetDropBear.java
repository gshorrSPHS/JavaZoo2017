public class PetDropBear extends DropBear
{
    public PetDropBear(String name, String description)
    {
        super(name, description);
    }
    public String makeNoise()
    {   
        return "meow";
    }
    public String play()
    {
        return "The DropBear plays with organs";
    }
    public String eat()
    {
        return "The DropBear eats cats exploring the brush of Australia.";
    }
    public String walk()
    {
        return "The DropBear does not walk but teleports for the affection of\ntheir owner";
    }
}