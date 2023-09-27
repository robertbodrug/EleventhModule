package FirstTask;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {
    public static void main(String[] args) {
        //"Ivan", "Maria", "Misha", "Roberto", "Tania"
        ArrayList<String> s = new ArrayList<>();
        s.add("Ivan");
        s.add( "Maria");
        s.add( "Misha");
        s.add("Roberto");
        s.add( "alex");
        s.add("Tania");
        s.add( "Vlad");
        s.add("Jenaro");
        s.add( "Andrii");
        s.add("Oleg");
        s.add( "ANTON");
        System.out.println(UnpairedNamesFilter.filter(s));
    }
}
