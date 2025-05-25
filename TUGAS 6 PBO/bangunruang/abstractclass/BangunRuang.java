package bangunruang.abstractclass;

import bangunruang.interfaces.Menghitung;

public abstract class BangunRuang implements Menghitung {

    protected String nama;

    public BangunRuang(String nama) {
        this.nama = nama;
    }

    public void display() {
        System.out.println("Bangun Ruang: " + nama);
    }
}
