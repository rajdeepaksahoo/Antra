package VcsCode;

import java.util.ArrayList;
import java.util.List;

class Itc extends Thread {
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

public class Solve {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hii");
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        // System.out.println(l);
        Itc i = new Itc();
        for (int ii = 10; ii < 20; ii++) {
            System.out.println(ii);
        }
    }
}