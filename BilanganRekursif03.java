import java.util.Scanner;

/**
 * BilanganRekursif03
 */
public class BilanganRekursif03 {

    static void tampilkanBilangan(int n) {
        if (n == 0) {
            System.out.print(n + " ");
            return;
        } else {
            System.out.print(n + " ");
            tampilkanBilangan(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        int n = sc.nextInt();
        tampilkanBilangan(n);
    }
}