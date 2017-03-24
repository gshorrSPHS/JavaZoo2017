public class RedFox extends Animal implements Walking
{
    private int kawaiiScore;
    public RedFox()
    {
        super("Red Fox", "\"Kawaii-desu\" - Paul Jeong");
    }
    public RedFox(String name, String description)
    {
        super(name, description);
    }
    public void addKS(int kawaiiScore)
    {
        this.kawaiiScore = kawaiiScore;
    }
    public String walk()
    {
        return "\"Waddles kawaii-ly on their kawaii legs\" - Paul Jeong";
    }
    public String eat()
    {
        return "It eats fruits, berries, and small mammals. And possibly your finger.";
    }
    public String play()
    {
        return "It plays with live prey to develop skills for hunting while it is young." +
                "\nIt might think of your fingers as live prey too.";
    }
    public String makeNoise()
    {
        return "Ring-ding-ding-ding-dingeringeding!" +
               "\nGering-ding-ding-ding-dingeringeding!" +
               "\nGering-ding-ding-ding-dingeringeding!" +
               "\nWa-pa-pa-pa-pa-pa-pow!" +
               "\nWa-pa-pa-pa-pa-pa-pow!" +
               "\nWa-pa-pa-pa-pa-pa-pow!" +
               "\nHatee-hatee-hatee-ho!" +
               "\nHatee-hatee-hatee-ho!" +
               "\nHatee-hatee-hatee-ho!" +
               "\nJoff-tchoff-tchoffo-tchoffo-tchoff!" +
               "\nTchoff-tchoff-tchoffo-tchoffo-tchoff!" +
               "\nJoff-tchoff-tchoffo-tchoffo-tchoff!";
               
    } 
}
