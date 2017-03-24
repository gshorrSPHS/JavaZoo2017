public class TreePangolin extends Pangolin 
{
    public TreePangolin(){
      super("Tree Pangolin", "A smaller species of pangolin with prehensile tails"
      +"\n that spend lots of time in trees");
      
    }
    
    public TreePangolin(String name, String description){
      super(name, description);
    }
    
    public String makeNoise(){
        return "Tree pangolins are quiet";
    }
    
    public String play(){
        return "The Tree Pangolin crawls into the branches of a nearby tree.";
    }
    
    public String eat(){
        return "Tree pangolins eat ants and termites, they use their big front"+
                "\nclaws to dig up termite hillsand burrow into tree bark." +
                "\npangolin meat is considered a delicacy in China." +
                "\nStop poaching these super cool animals you baddies.";
    }
    
    public String walk(){
        return "The pangolin walks on its back legs, crossing it's front claws"
        +"\n it is able to climb trees in the absence of branches";
    }
    
    public String swim(){
        return "The pangolin inflates like a balloon when it wants to swim,"+
        "\nhelping it float in water.";
    }
}