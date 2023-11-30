/**
 * PenjumlahanRekursif03
 */
import java.util.Scanner;
 public class PenjumlahanRekursif03 {

    static int penjumlahanRekursif(int f) {
        if (f == 1) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(f);
            if (f != 1) {
                System.out.print("+");
            }
            return (f + penjumlahanRekursif(f - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        int hasil = penjumlahanRekursif(f);
        System.out.print("= " + hasil);
    }
}