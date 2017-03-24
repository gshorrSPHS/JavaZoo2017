public class AnimalTester
{
    public static void main(String[] args)
    {
        Animal a = new BlobFish(); //put yours here instead

        System.out.println(a.getName());
        System.out.println(a.getDescription());
        System.out.println(a.eat());
        System.out.println(a.play());
        System.out.println(a.makeNoise());
        
        //choose the appropriate method here to
        //match the interface you implement
        //fly, swim, or walk
        System.out.println(a.swim());
    }
}