
public class Main {

    public static void main(String[] args) {
        // write here test code 
        Reformatory test = new Reformatory();
        Person eg = new Person("test",1,110,7);
        System.out.println(eg.getName()+" weight: "+test.weight(eg));
        test.feed(eg);
        test.feed(eg);
        test.feed(eg);
        System.out.println(eg.getName()+" weight: "+test.weight(eg)+" measured total: "+test.totalWeightsMeasured());
    }
}
