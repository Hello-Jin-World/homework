import java.util.Scanner;

public class palindromicnum_int {
    public static void main(String[] args) {
        boolean result = true;
        System.out.print("숫자를 입력하세요:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int len = 0;
        int num_copy = num;
        for (int i = 0 ; i < num ; i++){
            if (num_copy == 0){
                len = i;
                break;
            }
            num_copy = num_copy / 10;
        } // 입력받은 숫자의 길이를 구함
        if (len < 2 || num < 0) {
            System.out.println("두 자리 이상 양수를 입력하시오.");
        }
        else {
            for (int i = 0; i < len / 2; i++) {
                if((int) (num / Math.pow(10, len - i - 1)) % 10 != (int) (num / Math.pow(10, i)) % 10){
                    result = false;
                    System.out.println("회문수가 아닙니다.");
                    break;
                }
                // 숫자의 대칭을 확인 (맨 앞자리 수와 맨 뒷자리 수와 비교, 앞에서 두 번째 수와 뒤에서 두 번째 수와 비교, 이걸 중간에 끊길 때까지 반복)
            }
            if (result == true) {
                System.out.println("회문수입니다.");
            }
        }
    }
}
/*
* 자릿수 +-*% 구하는거 기본 연산써서 구해보기
        */