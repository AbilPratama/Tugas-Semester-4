import java.util.Arrays;

public class CekAnagram {
    public static boolean Anagram (String s1, String s2){
        char[] a = s1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] b = s2.toLowerCase().replaceAll("\\s", "").toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        System.out.println(Anagram("Air", "Ria"));
    }
    
}
