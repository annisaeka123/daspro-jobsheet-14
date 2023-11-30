import java.util.Scanner;

/**
 * PrimaRekursif03
 */
public class PrimaRekursif03 {

    static boolean cekPrima(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return cekPrima(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

        if (cekPrima(bilangan, 2)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukanlah bilangan prima.");
        }
    }
}