import java.util.Scanner;

public class upperlower {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String eng = in.next();
        System.out.print(eng.toUpperCase().charAt(0));
        for (int i = 1 ; i < eng.length() ; i++){
           System.out.print(eng.toLowerCase().charAt(i));
        }
    }
}
