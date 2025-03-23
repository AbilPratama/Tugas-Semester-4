package Tugas4;

class Manusia {
    protected String nama;
    protected int umur;

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun");
    }

    public void aktivitas() {
        System.out.println(nama + " sedang melakukan aktivitas");
    }
}