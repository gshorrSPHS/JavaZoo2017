
/**
 * Makes a T-Rex. RAR. 
 * 
 * @author John Heath 
 */
public class TRex extends Animal implements Walking, Swimming, Flying
{
   private int teeth;
   public TRex(String name, String description, int teeth)
   {
       super(name,description); 
       this.teeth=teeth;
   }
   
   public TRex()
   {
       super("generic TRex", "He would eat you if he still existed");
       this.teeth = 0;
   }
   
   public String eat()
   {
       return "T Rex bashes head violently against food.";
   }
   public String play()
   {
       return "T Rex kills you. He then sits awkwardly; he did not mean to kill you, he wanted to play";
   }
   
   public String makeNoise()
   {
       return "RAR";
   }
   
   public String walk()
   {
       return "STOMP STOMP STOMP";
   }
   
   public String swim()
   {
       return "lol nope T Rex will not get in the water";
   }
   
   public String fly()
   {
       return "T Rex stares longly at the sky. His ancestors were birds, and he feels in his gut that he was meant to fly.\nA single tear streaks down T Rex's massive head";
   }
}
