public class PallindromeString {
    public static void main(String[] args) {
        String myString = "madam";
        checkPallindrome(myString);
    }

    public static void checkPallindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println("The given String is not a palindrome");
                return;
            }
            start++;
            end--;
        }

        System.out.println("The given String is a palindrome");
    }
}
