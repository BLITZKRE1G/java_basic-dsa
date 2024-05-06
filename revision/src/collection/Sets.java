package collection;

import java.util.*;
import java.util.stream.Collectors;

public class Sets {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        String[] strArr = new String[]{"A", "B", "A", "A", "C", "D", "E", "D"};
        Object[] sortedArr = Arrays.stream(strArr)
                .sorted()
                .toArray();
        Object[] reversedArr = Arrays.stream(strArr)
                .sorted(Collections.reverseOrder())
                .toArray();
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(sortedArr));
        System.out.println(Arrays.toString(reversedArr));

        Arrays.stream(Arrays.stream(strArr)
                .map(hashSet::add)
                .toArray()
                ).forEach((s)->{
                    System.out.println(s);
                });

        System.out.println(hashSet);

        HashSet<String> reversedHashSet = Arrays.stream(strArr)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(reversedHashSet);
    }
}
