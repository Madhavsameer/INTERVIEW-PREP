package PATTERNS;

/**
 * rightpyramid
 */
public class rightpyramid {

    public static void main(String[] args) {
        rightPyramid(7);
        
    }

    public static void rightPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}