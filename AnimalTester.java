public class AnimalTester
{
    public static void main(String[] args)
    {
        Animal a = new BlueWhale(); //put yours here instead

        System.out.println("She is a "+a.getName()+ ".");
        System.out.println("She is the "+a.getDescription());
        System.out.println("When she eats, she goes "+a.eat());
        System.out.println("During leisure times, she likes to "+a.play()+".");
        System.out.println("Inside the water, you can hear her go "+a.makeNoise()+"!");
        
        //choose the appropriate method here to
        //match the interface you implement
        //Flying, Swimming, or Walking using fly, swim, walk methods
        Swimming s = (Swimming) a;
        System.out.println("When swimming, she "+s.swim());
        
    }
}

//System.out.println((BlueWhale)(a)).getMilesMigrated())
//How to cast a new method to a class extending an abstract class
//casting the animal as a BlueWhale