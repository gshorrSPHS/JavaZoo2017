public class grizzleBear extends Animal implements Walking, Swimming
{
    public grizzleBear()
    {
        super("Grizzle-Bear" , "The fish-LOVER");
    }
    
    public String eat()
    {
        return "Devours Salmon"; 
    }
  
    public String makeNoise()
    {
        return "Roarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr";
    }
    public String swim()
    {
        return "Swims in shallow water" ;
    }
    public String play() 
    {
        return "Loves to play with it`s pray!!" ;
    }
   public String walk()
   {
       return "More like running, Grizzle-bears can walk 98787miles per second" ;
    }
}
