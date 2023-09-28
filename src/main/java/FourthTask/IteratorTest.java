package FourthTask;

public class IteratorTest {
    public static void main(String[] args) {
        long a= 25214903917L;
        long c=11L;
        long m=2^48;
        RandomIterator.get(a,c,m)
                .limit(45)
                .forEach(System.out::println);
    }
}
