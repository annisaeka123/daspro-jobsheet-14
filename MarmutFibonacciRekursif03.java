/**
 * MarmutFibonacciRekursif03
 */
public class MarmutFibonacciRekursif03 {

    // fungsi rekursif untuk menghitung deret Fibonacci
    public static int fibonacci(int n) {
        // basis: jika n = 0 atau n = 1, maka fibonacci(n) = n
        if (n == 0 || n == 1) {
        return n;
        }
        // rekursi: jika n > 1, maka fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        else {
        return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    // fungsi utama yang menjalankan program
    public static void main(String[] args) {
        // memanggil fungsi rekursif dengan parameter 12
        int jumlah = fibonacci(12);
        // menampilkan hasil di layar dengan format string
        System.out.printf("Jumlah pasangan marmut pada akhir bulan ke-12 adalah %d%n", jumlah);
    }
    
}