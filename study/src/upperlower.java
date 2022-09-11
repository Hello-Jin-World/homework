import java.util.Scanner;

public class upperlower {
    public static void main(String[] args){
        System.out.print("영어 문자를 입력하세요 : ");
        Scanner in = new Scanner(System.in);
        String eng = in.next();
        System.out.print("결과는 : " + eng.toUpperCase().charAt(0));
        for (int i = 1 ; i < eng.length() ; i++){
           System.out.print(eng.toLowerCase().charAt(i));
        }
    }
}
