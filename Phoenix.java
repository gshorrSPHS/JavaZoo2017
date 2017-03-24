public class Phoenix extends Animal implements Flying
{
   
   public Phoenix()
   {
      super("Phoenix", "A mystical legendary creature"); 
   }
   
   public Phoenix (String name, String description)
   {
       super(name, description);  
   }
    
   public String makeNoise()
   {
       return "SCREEEEEEEEEEEEEEECH";
   }
   
   public String eat()
   {
      return "The phoenix feasts on the soul of the dead, \n" +
             "bringing those who are worthy into the afterlife.";
   }
    
   public String play()
   {
      return "Associated with the Sun, the phoenix obtains new life \n" +
             "by arising from the ashes of its predecessor. \n" +
             "According to some sources, the phoenix dies in a \n" +
             "show of flames and combustion, although there are \n" +
             "other sources that claim that the legendary bird dies \n" +
             "and simply decomposes before being born again. \n";
   }
   
   public String fly()
   {
      return "The phoenix flies overhead, sprinkling a shower of \n" +
             "mystical dust, removing all magic in its wake.";
   }
   
    
}