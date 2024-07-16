public class TargetSum {
    public static void main(String[] args) {
        int myArr[]={7,5,9,6,2,8,4,};
        SumTarget(98, myArr);
        

    }

    public static void SumTarget(int target, int arr[]){

        int ans[]=new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

                if(arr[i]+arr[j]==target){
                    ans[0]=arr[i];
                    ans[1]=arr[j];

                    System.out.println("The indices which sums the target are "+i+" "+j);
                    return;
                }
                
        }

    }

        System.out.println("No Two elements sum can match the target");
       
    }
}
