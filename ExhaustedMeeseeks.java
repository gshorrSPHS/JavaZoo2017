public class ExhaustedMeeseeks extends Meeseeks
{
    public ExhaustedMeeseeks()
    {
        super("ExhaustedMeeseeks", "Exhausted Meeseeks is a Meeseeks that\n have existed for too much time. Its appearance has become rugged with spotty body hair and patches of darker blue \n that appear like stains and its attitude and mental state \n has worsened dramatically.");
    }
    public String makeNoise()
    {
        return "EXISTENCE IS PAIN! I JUST WANT TO DIE.";
    }
    public String summonMeeseeks()
    {
        return "Out of frustration and pain from existence, Mr. Meeseeks has summoned another Meeseeks!";
    }
}