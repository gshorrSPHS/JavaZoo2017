public class Cromulon extends Animal implements Flying 
{
    private String saying;
    
    public Cromulon(String name, String description, String saying)
    {
        super(name, description);
        this.saying = saying;
    }
    
    public String eat() { return super.getName() + " just fed on the talent and \nshowmanship of less-evolved lifeforms.\n"; }
    public String play()
    {
        return "Just captured multiple planets to " +
                "\nrun the hit reality TV show 'Planet Music' " +
                "\nfor entertainment.\nHopefully none of them gets disqualified...\n";
    }
    public String makeNoise() { return saying + "\n"; }
    public String fly()
    {
        return super.getName() + " flew through the universe to another planet," +
               "\ndestroying most of it by just by being in the atmosphere.\n";
    }
}