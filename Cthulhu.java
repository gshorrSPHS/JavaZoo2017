public class Cthulhu extends Animal implements Walking,Flying,Swimming
{ 
    public Cthulhu()
    {
        super("Cthulhu", "The Great God of the Deep");
    }
    public Cthulhu(String name,String description)
    {
        super(name,description);
    }
    public String eat()
    {
        return "Cthulhu is an immortal God-Devil being and thus has no requrement for sustanance...\n "+
        "but he does like meat";
    }
    public String play()
    {
        return "Cthulhu indoctrinates you";
    }
    public String makeNoise()
    {
        return "The noises Cthulhu makes are beyond your petty mortal comprehension";
    }
    public String walk()
    {
        return "Cthulhu sleeps, he does not wish to walk";
    }
    public String swim()
    {
        return "Cthulhu sleeps, he does not wish to swim";
    }
    public String fly()
    {
        return "Cthulhu sleeps, he does not wish to fly";
    }
}