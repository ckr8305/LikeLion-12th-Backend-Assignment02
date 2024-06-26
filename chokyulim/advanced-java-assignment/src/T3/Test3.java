package T3;
import java.util.InputMismatchException;
import java.util.Scanner;


// 문제4: 사용자가 입력하는 문자열을 받아서 이것을 정수로 변환하여 정수들의 합 계산하는 프로그램
// 사용자가 정수로 변환할 수 없는 문자열 입력 -> 예외 발생, 처리
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        try {
            int n = Integer.parseInt(s);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(sc.next());
                sum += num;
            }
            System.out.println("정수들의 합은 " + sum);

        } catch (NumberFormatException e) {
            System.out.println("예외가 발생했습니다!");
            System.out.println("예외정보: " + e);
        }
        sc.close();
    }
}
