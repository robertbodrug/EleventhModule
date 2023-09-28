package SecondTask;

import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static List<String> sort(List<String> list){
        return list.stream().map(String::toUpperCase).sorted().toList();
    }

}
