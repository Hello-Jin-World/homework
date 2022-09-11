import java.util.Scanner;

public class backwards_noarray {
    public static void main(String[] args){
        System.out.print("숫자 또는 문자를 입력하세요 : ");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        System.out.print("거꾸로 하면 ");
        for (int i = num.length() ; i > 0 ; i--){
            System.out.print(num.charAt(i-1)); // i를 숫자(문자)의 길이로 지정해서 맨 뒤에 부터 print
        }
    }
}
