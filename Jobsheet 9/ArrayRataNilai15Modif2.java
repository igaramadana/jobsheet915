import java.util.Scanner;
public class ArrayRataNilai15Modif2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double totalLulus = 0;
        double totalTl = 0;
        double rataLulus, rataTl;
        int jmlMhs = 0;
        int countLulus = 0;
        int countTl = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = sc.nextInt();

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTl += nilaiMhs[i];
                countTl++;
            }
        }
        if (countLulus > 0) {
            rataLulus = totalLulus/countLulus;
            System.out.println("Rata-rata nilai lulus = " +rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus");
        }
        if (countTl > 0) {
            rataTl = totalTl/countTl;
            System.out.println("Rata-rata nilai tidak lulus = " +rataTl);
        }
}
}
