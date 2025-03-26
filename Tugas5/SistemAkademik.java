package Tugas5;

public class SistemAkademik {
    public static void main(String[] args) {
        Divisi science = new Divisi("Sains");
        Kelas fisika12 = new Kelas("12 IPA", science);
        MataPelajaran math = new MataPelajaran("Matematika");
        
        Admin admin = new Admin("A1", "Pak Budi");
        Guru guru = new Guru("T1", "Bu Ani", math.getName());
        Siswa siswa = new Siswa("S1", "Andi", fisika12.getClassName());
        Ujian uts = guru.createTest("UTS");
        
        System.out.println("====================");
        Orang[] orang = {admin, guru, siswa};
        for (Orang p : orang) {
            p.displayRole();
        }
        System.out.println("\n====================");
        
        admin.manage(guru);
        uts.displayInfo();
        siswa.workTest(uts);
    }
}