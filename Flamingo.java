public class Flamingo extends Animal implements Flying 
{
    public Flamingo() 
    {
        super("Flamingo","This animal is much more fabulous then all the \n other animals in the zoo. The flamingo turns pink because of the blueish bacteria contained in thier food supply. \n Nobody knows why they like to stand on one leg. \n Probably just to look fabulous.");
    
    } 
    public String eat() 
    {
        return "Flamingo eats a pile of algae and turns rainbow"; 
    }  
    public String makeNoise()
    {
        return "SCREEEEEEEAAAEEEEEEE"; 
    }
    public String play() 
    {    
        return "The flamingo stands on 1 leg and stairs at you inensely. You are very creeped out"; 
    }        
    public String fly() 
    {
        return"The flamingo tries to fly but fails epicly";
    } 
}