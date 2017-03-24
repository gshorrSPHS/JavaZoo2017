public class JackalopeLord extends Jackalope{
    private String name, description;
    public JackalopeLord(){
        super("JackalopeLord", "A Jackalope who has derped many times. Has no equal in derping.");
    }
    public JackalopeLord(String name, String description){
        super(name, description);
    }
    public String walk(){
        return "Each mighty footstep of the jackalope lord shakes the earth.";
    }
    public String eat(){
        return "The hungry jackalope lord devours an entire mountain of derp carrots.";
    }
    public String play(){
        return "The jackalope lord does not play. He has derps to attend to.";
    }
    public String makeNoise(){
        return "DDEERRRPP! The noise is so loud your ears explode.";
    }
}