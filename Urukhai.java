public class Urukhai extends Animal implements Walking
{
    public Urukhai()
    {
        super("Uruk-hai", "The great soldier-orcs of Mordor and Isengard.") ;
    }
    
    public Urukhai(String name, String description)
    {
        super(name, description);
    }
    
    public String eat()
    {
        return "The Uruk-hai eat several types of flesh, \n" + 
        "including human, hobbit, and dwarven flesh."; 
    }
    
    public String play()
    {
        return "Though they spend most of their leisure time \nslaughtering innocent people, " +
        "they are also \navid players of Words with Friends.";
    }
    
    public String makeNoise()
    {
        return "They make a variety of noises, such as \n'ARGHHHHH', 'BLEHHHHH', and 'GURRRRRR'.";
    }
    
    public String walk()
    {
        return "Contrary to popular belief, the Uruk-hai \nDO simply walk into Mordor.";
    }
}