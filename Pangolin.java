public class Pangolin extends Animal implements Walking,Swimming
{
    public Pangolin(){
      super("Pangolin", "A member of the anteater family covered in tough scales");
      
    }
    
    public Pangolin(String name, String description){
      super(name, description);
    }
    
    public String makeNoise(){
        return "Pangolins are quiet";
    }
    
    public String play(){
        return "The pangolin curls up in a ball when frightened.";
    }
    
    public String eat(){
        return "Pangolins eat ants and termites, they use their big front"+
                "\nclaws to dig up termite hills." +
                "\npangolin meat is considered a delicacy in China." +
                "\nStop poaching these super cool animals you baddies.";
    }
    
    public String walk(){
        return "The pangolin walks on its back legs, crossing it's front claws";
    }
    
    public String swim(){
        return "The pangolin inflates like a balloon when it wants to swim,"+
        "\nhelping it float in water.";
    }
}