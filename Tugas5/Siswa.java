package Tugas5;

class Siswa extends Orang {
    private String className;
    private String title;
    
    public Siswa(String id, String name, String className) {
        super(id, name);
        this.className = className;
    }
    
    @Override
    public void displayRole() {
        System.out.println(getName() + " Adalah Siswa Kelas " + className);
    }

    public void workTest(Ujian ujian) {
        System.out.println(getName() + " mengerjakan ujian " + ujian.getTitle());
    }
}