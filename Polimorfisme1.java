public class PersegiPanjang {

    public int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Luas persegi panjang dengan integer: " + pp.hitungLuas(5, 3));
        System.out.println("Luas persegi panjang dengan double: " + pp.hitungLuas(5.5, 3.5));
    }
}
