package collections;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(3);
        numList.add(1);

        System.out.println(numList);
        System.out.println("After sorted");
        Collections.sort(numList);
        System.out.println(numList);


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Link example");
        List<Integer> liskList = new LinkedList<>();
        liskList.add(2);
        liskList.add(3);
        liskList.add(1);
        System.out.println(liskList);
        System.out.println("After sorted");
//        Collections.sort(liskList);
        liskList= liskList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(liskList);

    }
}
