public class JacksonsChameleon extends Chameleon
{
    public JacksonsChameleon()
    {
        super("Jacksons Chameleon", "The trihorned defender of the understory.");
    }
    public String eat()
    {
        return "\n Stabs pitiful insects with his deadly trihorn attack!"+
        "\n Then his long tongue grasps the carcas and he quickly devours his meal.";
    }
    public String play()
    {
        return "\n Does not play, solely devoted to the defese of the understory.";
    }
}