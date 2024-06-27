/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {

        int myArr[]={7,8,5,2,6,9,4,};

        arrayReverse(myArr);
        
    }

    public static void arrayReverse(int arr[]){

        System.out.println("Array before Reversal");
        for(int i:arr){
            System.out.print(i+" ");
        }
        int start=0;
        int end=arr.length;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end-1];
            arr[end-1]=temp;
            start++;
            end--;
        }
        System.out.println();

        System.out.println("Array after Reversal");
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}