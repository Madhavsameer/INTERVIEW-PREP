import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int myArr[]={1,2,3,4,5,6,7,8,9};
        Arrays.sort(myArr);
        bs(myArr, 7);

        
    }

    public static void bs(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid]==target){
                System.out.println("Element found at index "+mid);
                return;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        System.out.println("ELement not found in the given array");
        
    }
}
