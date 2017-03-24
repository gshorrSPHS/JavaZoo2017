public class MyBengalTiger{
    public static void main(String[] args)
    {
        Animal a = new BengalTiger(); //put yours here instead

        System.out.println(a.getName());
        System.out.println(a.getDescription());
        System.out.println(a.eat());
        System.out.println(a.play());
        System.out.println(a.makeNoise());
        
        //choose the appropriate method here to
        //match the interface you implement
        //fly, swim, or walk
        Swimming s = (Swimming) a;
        Walking w = (Walking) a;
        System.out.println(w.walk());
        System.out.println(s.swim());
        
        Animal b = new BengalTiger("Ziggy", 29);
        
        System.out.println(a.getName());
        System.out.println(a.getDescription());
        System.out.println(a.eat());
        System.out.println(a.play());
        System.out.println(a.makeNoise());
        Swimming s2 = (Swimming) b;
        Walking w2 = (Walking) b;
        System.out.println(w2.walk());
        System.out.println(s2.swim());
    }
}