public class ThreeToedSloth extends Animal implements Walking,Swimming
{
    public ThreeToedSloth()
    {
        super("Sloth: Jay", "Slakoth in real life!");
    }
    public String makeNoise()
    {
        return "He makes a noise similar to a hiss and snort.";
    }
    public String eat()
    {
        return"It monches on some leaves!" ;
    }
    public String play()
    {
        return "SLOTHS DO NOT PLAY! THEY HAVE TO CONSTANTLY EAT TO SURVIVE!";
    }
    public String swim()
    {
        return "It floats around";
    }
    public String walk()
    {
        return"It moves around frustratingly slow.";
    }
}