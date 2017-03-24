public class ToucanSam extends Toucan
{
    public ToucanSam()
    {
        super("Toucan: Sam", "Toucans are members of the Ramphastidae family. \nThis toucan is unusually bright, brighter than the other toucans...");
    }
    
    @Override
    public String eat()
    {
        return "The zookeeper pours what looks like colorful dried fruit into a bowl and the toucan munches happily.";
    }
    
    @Override
    public String play()
    {
        return "The toucan followed his nose to the fruity way that showed!";
    }
    
    @Override
    public String makeNoise()
    {
        return "//*SQUAK!/ \"JUST FOLLOW YOUR NOSE!\" //*SQUUUAAAAAAAAK!!!/";
    }
}