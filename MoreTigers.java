public class MoreTigers extends BengalTiger{
    private int age;
    private int animalsInTerritory;
    private String name;
    public MoreTigers(String name, int animalsInTerritory, int age){
        super();
    }
    
    public String talk(){
        int moons = age * 4;
        return "I have been alive now for " + moons + " moons long. Thank you for visiting.";
    }
}