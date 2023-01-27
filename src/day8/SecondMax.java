package day8;

public class SecondMax {
    public static void main(String[] args) {
        int [] arr ={1,2,2,4};
//        int max=0;
//        int sm=max+1;
//        for(int i:arr){
//
//            if(max<i) max=i;
//           // sm=max-1;
//            if(sm<max && sm>=i) sm=i;
//        }
//        System.out.println(sm);
        int n=arr[0];
        int c=0;
        for(int i: arr){
            if(i>n) c=c+(i-n);
            else if (i<n) c=c+(n-i);
        }
        System.out.println(c);
    }
}
