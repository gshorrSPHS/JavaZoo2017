public class Duckbear extends Animal implements Walking, Swimming{
    public Duckbear(String name, String description){
        super(name, description);
    }
    public String eat(){
        return "wow. the duckbear knows how to eat.";
    }
    public String play(){
        return "wow. the duckbear knows how to play as well.";
    }
    public String makeNoise(){
        return "quack";
    }
    public String walk(){
        return "even more wow. the duckbear can walk.";
    }
    public String swim(){
        return "wow. the duckbear can swim cuz he has webbed feet.";
    }
}