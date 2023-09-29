package FifthTask;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamConnector {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Set<T> output = new HashSet<>();
        Iterator<T> firstI = first.iterator();
        Iterator<T> secondI = second.iterator();

        while (firstI.hasNext() && secondI.hasNext()){
            output.add(firstI.next());
            output.add(secondI.next());
    }
        return output.stream();
    }
}
