package ThirdTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberCollector {


    public static String collect(String[] strings){
        List<String> list = new ArrayList<>();
        for(String s:strings){
            if(!s.isEmpty()) {
                    for (char c : s.toCharArray()) {
                        if(Character.isDigit(c))list.add(String.valueOf(c));
                    }
                }

        }
        return list.stream().sorted().collect(Collectors.joining(", "));
    }
}
