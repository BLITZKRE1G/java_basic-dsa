package collection;

import java.util.*;

public class Lists {

    public static void main(String[] args) {

        /* Array List */
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("Z");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add("E");
        System.out.println(arrayList);
        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList);
        arrayList.sort(String::compareTo);
        System.out.println(arrayList);
    }
}
