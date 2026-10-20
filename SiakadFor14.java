import java.util.Scanner;

public class SiakadFor14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Deklarasi Variabel
        double nilai, lulus = 0,tidakLulus = 0;
        double tertinggi = 0;
        double terendah = 100;

        //Perulangan
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai <= 60){
                tidakLulus++;
            } else {
                lulus++;
            }
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
            System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
            System.out.println("Jumlah Mahasiswa Tidak Lulus: " + tidakLulus);

        } sc.close();
        }
    }
