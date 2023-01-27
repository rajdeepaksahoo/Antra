package day8;

public class RevPorsonArr {
    public static int[] mod(int[] arr,int s, int e){
        while (e>s){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            e--;s++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 =RevPorsonArr.mod(arr,1,3);
        for (int i:arr1){
            System.out.print(i+" ");
        }
    }
}
