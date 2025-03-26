package Tugas5;

class Kelas {
    private String name;
    private Divisi divisi;
    
    public Kelas(String name, Divisi divisi) {
        this.name = name;
        this.divisi = divisi;
    }
    
    public String getClassName() { return name; }
}