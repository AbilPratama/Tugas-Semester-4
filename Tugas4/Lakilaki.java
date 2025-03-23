package Tugas4;

class Lakilaki extends Manusia {
    public Lakilaki(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void aktivitas() {
        System.out.println(nama + " sedang bermain futsal!");
    }

    public void bekerja(String lokasi) {
        System.out.println(nama + " sedang bekerja di " + lokasi + ".");
    }

}