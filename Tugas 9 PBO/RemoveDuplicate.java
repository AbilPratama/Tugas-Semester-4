public class RemoveDuplicate {
    public static String Remover(String str){
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()){
            if(result.indexOf(String.valueOf(c)) == -1){
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(Remover("Kopiko"));
    }
    
}
