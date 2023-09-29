package FifthTask;

import java.util.stream.Stream;

public class ConnectorTest {
    public static void main(String[] args) {
        StreamConnector.zip(Stream.of(34343,34,4,6,4,1),Stream.of(1,5,9,0)).forEach(System.out::println);
    }
}
