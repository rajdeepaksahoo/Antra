package day8;

public class CountNo {
    public static int count(int[] arr,int no){
        int c=0;
        for (int i :arr) {
            if(i==no)c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,2};
        System.out.println(CountNo.count(arr,2));
    }
}
