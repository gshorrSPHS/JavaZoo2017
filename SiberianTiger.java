public class SiberianTiger extends Animal implements Swimming, Walking
{
    int random = 0;
    public SiberianTiger()
    {
        super("SiberianTiger", "quack");
    }
    public String eat()
    {
        return "yum";
    }
    public String play()
    {
        random = (int) Math.random()*2 +1;
        if(random == 1)
        {
            return "Roar";
        }
        else
        {
            return "Let's play claws";
        }
        
    }
    public String makeNoise()
    {
        return "Roar";
    }
    public String swim()
    {
        return "Splah, Splash, Splashes";
    }
    public String walk()
    {
        return "clopetty clop cloppety clops";
    }
}