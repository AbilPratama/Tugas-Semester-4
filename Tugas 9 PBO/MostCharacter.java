import java.util.HashMap;

public class MostCharacter {
    public static char mostfrequent (String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()){
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        char MostFrequent = ' ';
        int max = 0;

        for (char c : map.keySet()){
            if(map.get(c) > max){
                max = map.get(c);
                MostFrequent = c;
            }
        }
        return MostFrequent;
    }

    public static void main(String[] args) {
        System.out.println(mostfrequent("ubur ubur dan ikan lele"));
    }
    
}
