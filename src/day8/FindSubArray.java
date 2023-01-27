package day8;

class FindSubArray{
    public static int[] subArr(int[] arr,int k){
        int c=0; 
        int cc=arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<k){
                c++;
            }
        }
        int [] arr1 = new int[c];
        int kk=0;
        for (int i = 0; i < arr.length-c+1; i++) {
            int j=0;
            if(kk==arr.length) return arr1;
            for (int l = 0; l < kk; l++) {
                if(arr[l]<k){
                    arr1[j]=arr[l];
                    j++;
                }
            }
            kk++;
            int count=0;
            for (int l = 0; l < arr1.length; l++) {
                if(arr[i]==arr1[l]) count++;
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
         int[]arr={1,2,3,4,5,6,7,8};
        int[] arr1=FindSubArray.subArr(arr,5);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}