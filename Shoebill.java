public class Shoebill extends Animal implements Flying, Walking{
    public Shoebill(){
        super("Shoebill", "The Whalehead Stork");
    }
    
    public Shoebill(String name, String description){
        super(name, description);
    }
    
    public String eat(){
        return "Sits still for hours before STRIKING at a fish";
    }
    
    public String play(){
        return "You bow to the Shoebill, and it bows back.";
    }
    
    public String makeNoise(){
        return "DOH DOH DOH DOH DOH DOH DOH DOH DOH DOH DOH DOH"; //Seriously look it up
    }
    
    public String coolDown(){
        return "The Shoebill poops on its legs to cool itself down"; //Seriously look it up
    }
    
    public String fly(){
        return "The Shoebill slowly flaps its huge wings to soar like a pelican";
    }
    
    public String walk(){
        return "It waddles slowly through the water";
    }
}