package Tugas4;

public class Jeniskelamin {
    public static void main(String[] args) {
        Lakilaki Laki = new Lakilaki("Fauzi", 30);
        Perempuan perempuan = new Perempuan("Lucinta", 28);

        // Inheritance
        System.out.println("=== INHERITANCE ===");
        Laki.tampilkanInfo();
        perempuan.tampilkanInfo();   

        // Overriding
        System.out.println("\n=== OVERRIDING ===");
        Laki.aktivitas();       
        perempuan.aktivitas();    

        // Overloading
        System.out.println("\n=== OVERLOADING ===");     
        Laki.bekerja("pabrik"); 
     
        perempuan.belanja("mall");
    }
}