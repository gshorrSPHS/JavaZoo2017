public class BabyStarNosedMole extends StarNosedMole
{
    public BabyStarNosedMole(String name, String description, String size)
    {
        super(name, description, size);
    }
    @Override
    public String makeNoise()
    {
        return "erp";
    }
}