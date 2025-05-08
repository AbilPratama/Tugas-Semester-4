import java.util.HashMap;

public class HashMapCount {
    public static void HitungCharacter (String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()){
            if (c != ' '){
                map.put (c, map.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(map);

    }

    public static void main(String[] args) {
        HitungCharacter("Hitung berapa");
    }
}
