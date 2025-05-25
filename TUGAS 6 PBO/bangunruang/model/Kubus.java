package bangunruang.model;

import bangunruang.abstractclass.BangunRuang;

public class Kubus extends BangunRuang {

    private double sisi;

    public Kubus(double sisi) {
        super("Kubus");
        this.sisi = sisi;
    }

    @Override
    public double volume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public double luasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}
