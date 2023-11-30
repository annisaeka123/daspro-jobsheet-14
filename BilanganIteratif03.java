import java.util.Scanner;

/**
 * BilanganIteratif03
 */
public class BilanganIteratif03 {

    static void tampilkanBilangan(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        tampilkanBilangan(n);
    }
}