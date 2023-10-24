import java.util.Scanner;
public class LinearSearch15Modif2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[10];
        int key = 0;
        int jml = 0;
        int hasil = 0;

        System.out.print("Masukkan jumlah elemen array: ");
        jml = sc.nextInt();

        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();
        for (int i = 0; i < jml; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("key ada di posisi indeks ke-"+i);
                break;
            } else {
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
    }
}
