import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Masukkan waktu awal percakapan (dalam detik)
        int waktuAwal = 8 * 3600; // Jam 8 pagi dalam detik
        int waktuAkhir = 1 * 3600; // Jam 1 malam dalam detik
        int lamaPercakapan = waktuAkhir - waktuAwal;

        // Hitung biaya pulsa
        int pulsaPer5Detik = 150;
        int jumlahPulsa = (lamaPercakapan / 5) * pulsaPer5Detik;

        // Menampilkan hasil
        System.out.println("Lama percakapan: " + lamaPercakapan + " detik");
        System.out.println("Biaya pulsa: " + jumlahPulsa + " pulsa");
    }
}
