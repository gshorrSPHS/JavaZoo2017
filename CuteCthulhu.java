public class CuteCthulhu extends Cthulhu implements Walking,Flying,Swimming
{
    public CuteCthulhu()
    {
        super("A cute cartoon Cthulhu", "The Great God of the Deep... exept cute");
    }
    public CuteCthulhu(String name,String description)
    {
        super(name,description);
    }
    public String eat()
    {
        return "Cthulhu nibbles on a carrot";
    }
    public String play()
    {
        return "Cthulhu indoctrinates you... with cuteness";
    }
    public String makeNoise()
    {
        return "grglgrglgrgl";
    }
    public String walk()
    {
        return "Cthulhu waddles around aimlessly";
    }
    public String swim()
    {
        return "Cthulhu does an adorable doggy paddle";
    }
    public String fly()
    {
        return "Cthulhu's wings are so small they can barely keep him afloat";
    }
}