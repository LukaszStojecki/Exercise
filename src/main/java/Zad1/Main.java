package Zad1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        printRekord(map);
    }

    private static void printRekord(Map<Integer,String> map){
        map.entrySet().stream()
                .filter(s->s.getKey() > 1)
                .forEach(System.out::println);
    }
}
