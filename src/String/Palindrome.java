package String;

public class Palindrome {
    public static boolean isPalindrome (String str) {
        int length = str.length();
        if (length == 0) return true;
        for (int i = 0; i < length /2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(length - 1 - i);
            if (start != end) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }
}
