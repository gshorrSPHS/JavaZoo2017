public class BengalTiger extends Animal implements Walking, Swimming{
    private int animalsConsumed;
    private int animalsInTerritory;
    private int age;
    private String name;
    
    public BengalTiger(){
        super("Bengal Tiger", "The silent king of the jungle, amber eyes, peering through the dense undergrowth.");
    }
    
    public BengalTiger(String name, int animalsInTerritory){
        this.name = name;
        this.animalsInTerritory = animalsInTerritory;
    }
    
    public BengalTiger(String name, int animalsInTerritory, int age){
        this.name = name;
        this.animalsInTerritory = animalsInTerritory;
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public String play(){
        return "I particularly love to lay on my back, fluffy white tummy exposed, so you can rub me down!";
    }
    
    public String eat(){
        animalsConsumed++;
        animalsInTerritory = (int)(animalsInTerritory * 0.9);
        return "I have eaten " + animalsConsumed + " of my subjects, and now I have " + animalsInTerritory + " left. I think I shall eat my throne and palace instead.";
    }
    
    public String makeNoise(){
        int random = (int)(Math.random() * 10 + 1);
        if(random % 2 == 0){
            return "Mew mew mew...";
        }
        else{
            return "ROOOOOOOOOAAAAAAARRRRR!!!";
        }
    }
    
    public String walk(){
        return "I do not merely walk, but pad majestically through my wondrous realm.";
    }
    
    public String swim(){
        return "Splashing through the glistening azure depths, I shook my coat such that each flung droplet caught the sun, shooting rainbows through the air.";
    }
}