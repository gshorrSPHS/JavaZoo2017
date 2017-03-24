public class Platypus extends Animal implements Walking, Swimming
{ 
    public Platypus()
    {
        super("Name: AGGGGEEEENNNTTTT PPPPPPPPP!",
        "Description: He's a semi-aquatic egg-layin' mammal of action!\n"+
        "(Dooby dooby doo-bah) (Dooby dooby doo-bah)\n" +
        "He's a furry little flatfoot, \n"+"Who'll never flinch from a fray-ee-ay-ee-ay!"+
        "\nHe's got more than just mad skill,\n"+
        "He's got a beaver tail and a bill,\n"+
        "And the women swoon whenever they hear him sa-a-a-ay\n"+
        "grrrrrr\n"+
        "He's Perry, Perry the Platypus!\n"+
        "But you can call him Agent P.\n"+
        "Perry!\n"+
        "I said you can call him Agent P!\n"+
        "All Singers: A-gent-P!");
    }
    public Platypus(String name, String description)
    {
        super(name, description);
        
    }
    public String play()
    {
        return "How does it play? CURSE YOU PERRY THE PLATYPUS!";
    }
    public String makeNoise()
    { 
        return "grrrrrrrrr";
    }
    public String eat()
    {
        return "Eats like a super secret agent on the way";
    }
    public String walk()
    {
        return "waddles/parachutes into the scene";
        
    }
    public String swim()
    {
        return "swims with feet/scuba doo ba doo baaa!";
    }
    
    
    
    
    
}