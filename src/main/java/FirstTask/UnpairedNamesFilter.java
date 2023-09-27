package FirstTask;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UnpairedNamesFilter {
    public static String filter(List<String> list){
        return list.stream().sorted(Comparator)
                .filter(s -> list.indexOf(s)%2!=0)
                .map(s->list.indexOf(s) + ". "+s)
                .collect(Collectors.joining("\n"));
    }
}
