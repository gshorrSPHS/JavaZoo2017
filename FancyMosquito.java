public class FancyMosquito extends Mosquito implements Flying, Walking
{
 public FancyMosquito()
 {
     super("Fancy Mosquito", "Doesent like to suck blood");
    }
    public String eat()
    {
       return "eats caviar\n" ;
    }
    public String play()
    {
      return "plays tennis and occassionally croquete\n";  
    }
    public String makeNoise()
    {
      return "makes a violin-like symphany of sounds\n"  ;
    }
    public String fly()
    {
        return "has a shofer who flys it around\n";
    }
    public String walk()
    {
        return "walks only of red carpets";
    }
}