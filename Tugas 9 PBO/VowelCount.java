public class VowelCount {
    public static int countVowels(String str){
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()){
            if ("aiueo".indexOf(c) != -1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("mencoba"));
    }
    
}
