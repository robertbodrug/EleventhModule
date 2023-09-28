package ThirdTask;

public class CollectorTest {
    public static void main(String[] args) {
        String[] strings= {"1 3 4 66 "," 3,5","2,5","4"};
        String[] strings1 ={"1, 2, 0", "4, 5"};
        System.out.println(NumberCollector.collect(strings));
        System.out.println(NumberCollector.collect(strings1));
    }
}
