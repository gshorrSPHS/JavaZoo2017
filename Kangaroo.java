public class Kangaroo extends Animal implements Walking
{
    public Kangaroo(){
        super("Kangaroo", "Australia's favorite animal.");
    }
    
    public Kangaroo(String name, String description){
        super(name, description);
    }
    
    public String makeNoise(){
        return "Tch tch tch";
    }
    
    public String play(){
        return "The kangaroo hopped away.";
    }
    
    public String eat(){
        return "Grilled kangaroo is supposed to taste pretty good.";
    }
    
    public String walk(){
        return "The kangaroo hopped away.";
    }
}