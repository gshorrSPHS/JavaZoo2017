public class Jackalope extends Animal implements Walking{
    private String name, description;
    public Jackalope(){
        super("Jackalope", "Heavily enjoys derp carrots, derp hopping, and derping.");
    }
    public Jackalope(String name, String description){
        super(name, description);
    }
    public String walk(){
        return "The majestic jackalope moves so fast it is rarely seen. VROOOoom. And it's gone";
    }
    public String eat(){
        return "Nom nom nom, some derp carrots just disappeared faster than you could say 'hey that weird rabbit has antlers'";
    }
    public String play(){
        return "The jackalope does not believe you worthy of derping with him. He vanquishes you with a might derp kick.";
    }
    public String makeNoise(){
        return "DDEERRRPP! The terrible noise splits the air.";
    }
}