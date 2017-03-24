public class StarNosedMole extends Animal implements Swimming
{
    private String size;
    
    public StarNosedMole(String name, String description, String size)
    {
        super(name, description);
    }
    
    public String eat()
    {
        return "nibble nibble nom nom";
    }
    public String play()
    {
        return "What fun! The star nosed mole is stretching a worm";
    }
    public String makeNoise()
    {
        return "EUURRGGHHH";
    }
    public String swim()
    {
        return "the star nosed mole wiggled and waddled and waddled and wiggled all the way home";
    }
    public String attack(String item)
    {
        return "the star nosed mole pushed through the dirt and sneezed on the " + item;
    }
}