public class Chameleon extends Animal implements Walking
{
    public Chameleon()
    {
        super("Chameleon", "Unseen Gaurdian of the Green.");
    }
    public Chameleon(String name, String description)
    {
        super(name,description);
    }
    public String eat()
    {
        return "\n Uses its long tongue to pluck delicious demons from the heights of the trees.";
    }
    public String play()
    {
        return "\n Does not play, solely devoted to protection of the green.";
    }
    public String makeNoise()
    {
        return "\n The Chameleon is a silent assailent, unheard and unseen by all." + sneak() + spook();
    }
    public String sneak()
    {
        return "\n *Forest Sounds*";
    }
    public String spook()
    {
        return "\n A tap on your shoulder. You turn around but there is nothing. you turn back around"+
        "\n  and suddenly he strikes a blow to the chest with his powerful tongue is all it takes. your"+
        " \n eyes fade. the last thing you hear is his silent cackle. Your time is up in this world."+
        "\n You slowly sink down to the floor and you see him over you still cackling in the moonlight."+
        "\n Your eyes slide shut that image forever burned in them , never to open again.";
    }
    public String walk()
    {
        return "\n He walks so silently no one has ever heard him";
    }
}