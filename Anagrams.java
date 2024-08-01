import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

        

        

        
        String string1 = "Ram";
        String string2 = "san";

        
        //done update for the 28th july
        checkAnagrams(string1, string2);

    }

    
    
    

    
    public static void checkAnagrams(String str1, String str2) {
        // Remove white spaces and convert to lower case
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagram");
            return;
        }

        // Convert strings to char array
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays and print result
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }
    }

}
