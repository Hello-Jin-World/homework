import java.util.Scanner;

public class palindromicnum_String {
    public static void main(String[] args) {
        boolean result = true;
        System.out.print("숫자를 입력하세요:");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        int len = num.length(); // 입력받은 숫자의 길이를 구함
        char[] num_char = num.toCharArray();
        if (len < 2) {
            System.out.println("두 자리 이상 양수를 입력하시오.");
        }
        else {
            for (int i = 0; i < len / 2; i++) {
                result = (num_char[i] == num_char[len-i-1]);
                // 숫자의 대칭을 확인 (맨 앞자리 수와 맨 뒷자리 수와 비교, 앞에서 두 번째 수와 뒤에서 두 번째 수와 비교, 이걸 중간에 끊길 때까지 반복)
                if (result == false) {
                    System.out.println("회문수가 아닙니다.");
                    break;
                }
            }
            if (result == true){
                System.out.println("회문수입니다.");
            }
        }
    }
}