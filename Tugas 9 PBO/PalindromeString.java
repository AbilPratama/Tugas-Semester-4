public class PalindromeString {
    public static boolean Palindrome (String str) {
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
        
    }

    public static void main(String[] args) {
        System.out.println(Palindrome("malam"));
    }
    
}
