package day8;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(50);
        System.out.println();
        List<Integer> ll = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        List<String> lll = new LinkedList<>();
        lll.add("20");
        lll.set(0,"10");
        // Method 1
        System.out.println(lll);
        Set<Integer> s = new HashSet<>(l);
        System.out.println(s);
        Collections.copy(l,ll);

//        System.out.println(ll);
//        ListIterator it= l.listIterator();
//        while (it.hasNext()) {
//            int no = (int) it.next();
//            if (no == 10) it.remove();
//        }
//        System.out.println(l);
    }
}