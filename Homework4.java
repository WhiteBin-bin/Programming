import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int gcd = gcd(m, n);

        System.out.println("두 정수의 최대공약수는 " + gcd + " 입니다.");
    }

    public static int gcd(int m, int n) {
        if (m == 0) {
            return n;
        } else {
            return gcd(n % m, m);
        }
    }
}