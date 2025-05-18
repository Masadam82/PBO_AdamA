public class Balok {

    public int hitungVolume(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    public double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        Balok bl = new Balok();
        System.out.println("Volume balok dengan integer: " + bl.hitungVolume(5, 3, 2));
        System.out.println("Volume balok dengan double: " + bl.hitungVolume(5.5, 3.5, 2.5));
    }
}
