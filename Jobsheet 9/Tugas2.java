import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = "Dzaki";
        int saldo = 5000000;
        int tarik, tarikSaldo, saldoAkhir, tf;
        String pin = "1122";
        System.out.print("Masukkan PIN anda: ");
        String inputPin = input.nextLine();
        boolean berhasilLogin = false;

        if (inputPin.equals(pin)) {
            berhasilLogin = true;
        }

        if (berhasilLogin) {
            System.out.println("=================================================");
            System.out.println("             Selamat Datang Di ATM               ");
            System.out.println("=================================================");
            System.out.println("Data anda adalah");
            System.out.println("Nama : " + nama);
            System.out.println("Saldo anda : " + saldo);
            System.out.println("Tarik tunai : ");
            tarik = input.nextInt();
            System.out.println("Transfer Saldo");
            tf = input.nextInt();

            saldoAkhir= saldo-tarik;
            System.out.println("Sisa saldo anda: " + saldoAkhir);
            saldoAkhir= saldo - tf;
            System.out.println("Sisa saldo: Rp." + saldoAkhir);

            String exit = "y";
            System.out.println("Apakah ada transaksi lain y/t: ");
            String keluar = input.next();

            if (keluar.equals(exit)) {
                System.out.println("=================================================");
                System.out.println("             Selamat Datang Di ATM               ");
                System.out.println("=================================================");
                System.out.println("Data anda adalah");
                System.out.println("Nama : " + nama);
                System.out.println("Saldo anda : " + saldo);
                System.out.println("Tarik tunai : ");
                System.out.print("Masukkan nominal : ");
                tarik = input.nextInt();
            } else {
                System.out.println("Selamat Tinggal");
            }
            
        } else {
            System.out.println("Anda Memasukkan PIN yang salah.");
        }
        

    }

}

