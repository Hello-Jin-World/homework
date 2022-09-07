import java.util.Scanner;

public class palindromicnum {
    public static void main(String[] args) {
        int check = 0;
        System.out.print("숫자를 입력하세요:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int len = (int) (Math.log10(num) + 1); // 입력받은 숫자의 길이를 구함
        String a = null;
        if (len < 2) {
            System.out.println("두 자리 이상 양수를 입력하시오.");
        }
        else {
            for (int i = 0; i < len / 2; i++) {
                boolean result = ((int) (num / Math.pow(10, len - i - 1)) % 10 == (int) (num / Math.pow(10, i)) % 10);
                // 숫자의 대칭을 확인 (맨 앞자리 수와 맨 뒷자리 수와 비교, 앞에서 두 번째 수와 뒤에서 두 번째 수와 비교, 이걸 중간에 끊길 때까지 반복)
                if (result == false) {
                    check = 1; // 만약 하나라도 대칭이 아니면 check에 1 입력
                }
            }
            if (check == 0) {
                System.out.println("회문수입니다.");
            }
            if (check == 1) {
                System.out.println("회문수가 아닙니다.");
            }
        }
    }
}