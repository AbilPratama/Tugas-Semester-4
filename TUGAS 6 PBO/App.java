package bangunruang;

import bangunruang.model.Balok;
import bangunruang.model.Bola;
import bangunruang.model.Kubus;

public class App {

    public static void main(String[] args) {
        Kubus k = new Kubus(4);
        k.display();
        System.out.println("Volume: " + k.volume());
        System.out.println("Luas Permukaan: " + k.luasPermukaan());
        System.out.println();

        Balok b = new Balok(4, 5, 6);
        b.display();
        System.out.println("Volume: " + b.volume());
        System.out.println("Luas Permukaan: " + b.luasPermukaan());
        System.out.println();

        Bola bola = new Bola(3);
        bola.display();
        System.out.println("Volume: " + bola.volume());
        System.out.println("Luas Permukaan: " + bola.luasPermukaan());
    }
}
