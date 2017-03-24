public class Chupacabra extends Animal implements Walking, Swimming
{
    public Chupacabra()
    {
        super("El Chupacabra", "You cannot see the chupacabra." +
                        "\nYou cannot hear the chupacabra." +
                        "\nEl Chupacabra sees you." +
                        "\nEl Chupacabra hears you." +
                        "\nYou cannot run. You cannot hide." +
                        "\nEl Chupacabra is behind you.");
    }
    
    public Chupacabra(String name, String description)
    {
        super(name, description);
    }
    
    public String play()
    {
        return "El Chupacabra does not play. El Chupacabra jumps out of the cage and eats you.";
    }
    
    public String eat()
    {
        return "El Chupacabra does not simply eat." +
        "\nEl Chupacabra hunts." +
        "\nEl Chupacabra jumps out of the cage and eats you.";
    }
    
    public String makeNoise()
    {
        return "El Chupacabra does not make noise." +
                "\nEl Chupacabra jumps out of the cage and eats you.";
    }
    
    public String walk()
    {
        return "El Chupacabra prowls around silently." +
                "\nEl Chupacabra slinks behind you." +
                "\nEl Chupacabra eats you.";
    }
    
    public String swim()
    {
        return "El Chupacabra swims without a noise." +
                "\nEl Chupacabra cannot be seen." +
                "\nEl Chupacabra has eaten you.";
    }
}