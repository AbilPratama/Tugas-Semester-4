public class FormatStudent {
    public static void main(String [] args){
        String[] students = {
            "Mohamed Ahmed",
            "Mohamed Ali",
            "Mohamed Salah",
            "Mohamed Hassan",
            "Mohamed Ibrahim",
            "Mohamed Noor",
            "Mohamed Farah",
            "Mohamed Yusuf",
            "Mohamed Ismail",
            "Mohamed Kamal",
        };

        for(String name : students){
            name = name.replaceFirst ("Mohamed", "Muhammad");
            String[] parts = name.split(" ");
            System.out.println(parts[1] + ", " + parts[0]);
        }
    }
    
}
