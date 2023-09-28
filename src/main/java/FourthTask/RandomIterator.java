package FourthTask;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class RandomIterator {
    public static Stream<Long> get(long a,long c , long m){
        return Stream.iterate(System.currentTimeMillis(), x -> (long) (a*x+c)%m);
    }
}
