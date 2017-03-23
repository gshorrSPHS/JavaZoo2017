public class AnimalTester
{
    public static void main(String[] args)
    {
        Animal a = new DropTableArmadillo(); //put yours here instead

        System.out.println(a.getName());
        System.out.println(a.getDesc());
        System.out.println(a.eat());
        System.out.println(a.play());
        System.out.println(a.makeNoise());
        
        //choose the appropriate method here to
        //match the interface you implement
        //Flying, Swimming, or Walking using fly, swim, walk methods
        Walking s = (Walking) a;
        System.out.println(s.walk());
    }
}