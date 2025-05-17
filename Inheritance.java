import java.util.*;

class Mahasiswa {
    String nim, nama;
    int nilai;
    String grade;

    Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.grade = tentukanGrade(nilai);
    }

    String tentukanGrade(int nilai) {
        if (nilai >= 80 && nilai <= 100) return "A";
        else if (nilai >= 70 && nilai <= 79) return "B";
        else if (nilai >= 60 && nilai <= 69) return "C";
        else if (nilai >= 50 && nilai <= 59) return "D";
        else if (nilai >= 0 && nilai < 50) return "E";
        else return "Invalid";
    }

    boolean lulus() {
        return grade.equals("A") || grade.equals("B") || grade.equals("C");
    }

    void tampilkan() {
        if (!grade.equals("Invalid")) {
            System.out.println("NIM   : " + nim);
            System.out.println("Nama  : " + nama);
            System.out.println("Nilai : " + nilai);
            System.out.println("Grade : " + grade);
            System.out.println("====================================");
        } else {
            System.out.println("Input nilai anda salah");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftar = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        int totalNilai = 0;
        ArrayList<String> lulus = new ArrayList<>();
        ArrayList<String> tidakLulus = new ArrayList<>();
        int[] countGrade = new int[5]; // A=0, B=1, C=2, D=3, E=4

        for (int i = 0; i < jumlah; i++) {
            System.out.print("NIM   : ");
            String nim = input.next();
            System.out.print("Nama  : ");
            String nama = input();
            System.out.print("Nilai : ");
            int nilai = input.nextInt();

            Mahasiswa m = new Mahasiswa(nim, nama, nilai);
            daftar.add(m);
            m.tampilkan();

            if (!m.grade.equals("Invalid")) {
                totalNilai += m.nilai;

                switch (m.grade) {
                    case "A": countGrade[0]++; break;
                    case "B": countGrade[1]++; break;
                    case "C": countGrade[2]++; break;
                    case "D": countGrade[3]++; break;
                    case "E": countGrade[4]++; break;
                }

                if (m.lulus()) lulus.add(m.nama);
                else tidakLulus.add(m.nama);
            }
        }

        System.out.println("Jumlah Mahasiswa : " + daftar.size());
        System.out.println("Jumlah Mahasiswa yg Lulus : " + lulus.size() + " yaitu " + String.join(", ", lulus));
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + tidakLulus.size() + " yaitu " + String.join(", ", tidakLulus));
        System.out.println("Jumlah Mahasiswa dengan Nilai A = " + countGrade[0]);
        System.out.println("Jumlah Mahasiswa dengan Nilai B = " + countGrade[1]);
        System.out.println("Jumlah Mahasiswa dengan Nilai C = " + countGrade[2]);
        System.out.println("Jumlah Mahasiswa dengan Nilai D = " + countGrade[3]);
        System.out.println("Jumlah Mahasiswa dengan Nilai E = " + countGrade[4]);

        if (daftar.size() > 0)
            System.out.printf("Rata-rata nilai mahasiswa adalah : %.2f\n", (float) totalNilai / daftar.size());
    }

    static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
