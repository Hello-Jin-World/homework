import java.util.Scanner;

public class find_len_logic {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0){
            num++;
            n = n / 10;
        }
        System.out.print(num);
    }
}
