package CodeChefContests;

import java.util.*;
import java.util.stream.Collectors;

public class SmallGcdSort {

    static void main() {
        int n = 3;
        Map<Integer , Integer> gcds = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int score = gcd(i , n);
            gcds.put(i , score);
        }

        Map<Integer, Integer> sortedMap = gcds.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, // Merge function for duplicate keys (not applicable here)
                        LinkedHashMap::new // Use LinkedHashMap to maintain insertion order
                ));
                for(int i : sortedMap.keySet()){
                    System.out.print(i + " ");
                }

        System.out.println();
    }

    public static int gcd(int a , int b ) {
        if(b == 0) return a;
        return gcd(b , a%b);
    }
}
