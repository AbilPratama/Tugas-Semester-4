package Tugas4;

class Perempuan extends Manusia {
    public Perempuan(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void aktivitas() {
        System.out.println(nama + " sedang masak di dapur!");
    }

    public void belanja(String lokasi) {
        System.out.println(nama + " sedang belanja di " + lokasi + ".");
    }
}