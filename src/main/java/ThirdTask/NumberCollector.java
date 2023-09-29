package ThirdTask;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberCollector {


    public static String collect(String[] strings) {
        List<String> list = new ArrayList<>();
        for (String s : strings) {
            if (!s.isEmpty()) {
                for (char c : s.toCharArray()) {
                    if (Character.isDigit(c)) list.add(String.valueOf(c));
                }
            }

        }


        return list.stream().sorted().collect(Collectors.joining(", "));
    }

}
//
//     return Arrays.stream(strings).
//    flatMap(s->s.chars().mapToObj(c-> (char) c))
//            .filter(Character::isDigit)
//                .sorted()
//                .map(Object::toString)
//                .collect(Collectors.joining(", "));
//
//}
