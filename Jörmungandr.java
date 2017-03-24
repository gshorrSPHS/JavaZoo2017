public class Jörmungandr extends Loki implements Swimming
{
    public Jörmungandr()
    {
        super("\nJörmungandr", "Child of Loki, Serpent encircling Midgard");
    }
    public Jörmungandr(String name, String description)
    {
        super(name, description);
    }
    public String play()
    {
        return "Begin Ragnarok";
    }
        public String swim()
    {   
        return "Slither and swim around the world (This should be with Jörmungandr but I dont have time to fix so whatever)";
    }
    public String makeNoise()
    {
        return "hssssssssss";
    }
    public String eat()
    {
        return "Poison Thor";
    }
}