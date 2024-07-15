package collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> haskMap = new HashMap<>();
        haskMap.put("Ko", 1);
        haskMap.put("Ka", 2);
        System.out.println("HashMap");
        System.out.println(haskMap);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("TreeMap");
        Map<String, Integer> treetMap = new TreeMap<>();
        treetMap.put("Ko", 1);
        treetMap.put("Ka", 2);
        System.out.println(treetMap);

        System.out.println("After remove");
        treetMap.remove("Ko");
        System.out.println(treetMap);

        System.out.println("Using map with Object" );
        System.out.println();
        System.out.println();
        System.out.println();
        Map<String,Person>personMap= new HashMap<>();
        personMap.put("map",new Person(1,"Kok"));
        personMap.put("map1",new Person(3,"Lola"));
        personMap.put("map2",new Person(1,"KokLola"));
        System.out.println(personMap);

    }
}
