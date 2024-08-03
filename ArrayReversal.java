public class ArrayReversal {
    public static void main(String[] args) {

        

        
        

        int arr[]={7,5,9,6,8,3};
        System.out.println("Array Before reversal: ");
        for (int i : arr) {
            System.out.print(i+" ");
            
        }

        int start=0; int end=arr.length-1; int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("\n Array after reversal: ");
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
}
