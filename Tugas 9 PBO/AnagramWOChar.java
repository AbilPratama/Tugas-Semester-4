import java.util.HashMap;

public class AnagramWOChar {
    public static boolean anagram(String s1, String s2){
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<s1.length(); i ++){
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int i = 0; i<s2.length(); i++){
            char c = s2.charAt(i);
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c) -1 );
            if (map.get(c) == 0) map.remove(c);
        }

        return map.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(anagram("kasur", "rusak"));
    }
    
}
