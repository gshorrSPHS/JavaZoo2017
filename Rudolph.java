public class Rudolph extends Reindeer
{
    private String christmasGreeting;
    
    public Rudolph(String name, String description, String christmasGreeting)
    {
        super(name, description);
        this.christmasGreeting = christmasGreeting;
    }
    
    public Rudolph()
    {
        super("Rudolph the Red-Nosed Reindeer", "You know Dasher and Dancer \n" +
              "and Prancer and Vixen, you know Comet and Cupid and Donner \n" +
              "and Blitzen, But do you recall The most famous reindeer of \n" +
              "all Rudolph the Red-Nosed Reindeer Had a very shiny nose \n" +
              "And if you ever saw it You would even say it glows All of \n" +
              "the other reindeer Used to laugh and call him names They \n" +
              "never let poor Rudolph Join in any reindeer games Then one \n" +
              "foggy Christmas Eve, Santa came to say, Rudolph with your \n" +
              "nose so bright, Won't you guide my sleigh tonight Then how \n" +
              "all the reindeer loved him, As they shouted out with glee, \n" +
              "Rudolph the red-nose Reindeer You'll go down in history");
        christmasGreeting = "Merry Christmas!";
    }
    
    public String getChristmasGreeting()
    {
        return christmasGreeting;
    }
    
    public String eat()
    {
        return "I love carrots. Carrots are like candy to me.";
    }
    
    public String play()
    {
        return "I love to fly around Santa's workshop with my friends \n" +
                "while singing Christmas carols!";
    }
    
    public String makeNoise()
    {
        return "meow";
    }
    
    public String walk()
    {
        return "Doo-doo-doo-doo-doo. Yay, I am walking.";
    }
    
    public String swim()
    {
        return "swimmy swim swim";
    }
    
    public String fly()
    {
        return "Eee! I'm flying!";
    }
}




