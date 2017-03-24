public class Meeseeks extends Animal implements Walking
{
    public Meeseeks()
    {
        super("Meeseeks", "Mr. Meeseeks is a tall, powder-blue humanoid figure \n with elongated, narrow limbs created to serve \n a singular purpose for which they will go to any length to fulfill.");
    }
    protected Meeseeks(String name, String description)
    {
        super(name, description);
    }
    public String eat()
    {
        return "Although Meeseeks doesn't need to eat, Meeseeks eats upon request.";
    }
    public String play()
    {
        return "Meeseeks doesn't play! Meeseeks are created to serve a singular purpose.";
    }
    public String makeNoise()
    {
        return "HI! I'M MR. MEESEEKS! LOOK AT ME!";
    }
    public String walk()
    {
        return "Meeseeks walks with his long and narrow legs.";
    }
}
