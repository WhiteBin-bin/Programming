import java.util.Scanner;


public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("몇 개의 수를 입력할 예정인가요? ");

        int n = input.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input.next());
        }

        int min = arr[0];    // 최소값
        int max = arr[0];    // 최대값

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
    }
}
