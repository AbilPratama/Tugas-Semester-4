package bangunruang.model;

import bangunruang.abstractclass.BangunRuang;

public class Bola extends BangunRuang {

    private double radius;

    public Bola(double radius) {
        super("Bola");
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double luasPermukaan() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
