package day8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionPractice {
    public static void main(String[] args) {
        // String[] arr = { "10", "20", "30", "40" };
        // List<String> l = Arrays.asList(arr);
        // System.out.println(l);

        int[] arr = { 10, 20, 30, 40 };
        List<Integer> l = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(l);

    }
}
