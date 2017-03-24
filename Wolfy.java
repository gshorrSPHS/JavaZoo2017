public class Wolf extends Animal implements Stalking,Swimming
{

    public Wolf()
    {
        super("Name: " + "Wolf","Description: " + "Sharp teeth");
    }
   
    public String makeNoise()
    {
        return "Noise: " + "Awoooooooooooooo";
    }

    public String play()
    {
        return "Play: " + "Bite";
    }

    public String eat()
    {
        return "Eat: " + "dead animal noise";
    }
    
    public String swim()
    {
        return "Swim: " + "Dog paddles it's way across the river";
    }
    
    public String stalk()
    {
        return "Stalk: " + "It crouches and slowly stalks it's prey";
    }
}