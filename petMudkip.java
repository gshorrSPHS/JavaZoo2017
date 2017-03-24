public class petMudkip extends Mudkip implements Walking,Swimming
{
    public petMudkip()
    {
        super("Kip","The best Mudkip in all of history");
    } 
    public String eat()
    {
       return "you feed kip" ;
    }
    public String play()
    {
        return super.play();  
    }
    public String makeNoise()
    {
        return "'Kip'";
    }
    public String walk()
    {
       return "kip strides beside his master" ;
    }
    public String swim()
    {
        return "kip swims like a puper...\na water dogo if you will";
    }
}