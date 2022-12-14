import java.util.Scanner;

public class homework_list {
    public static void main(String[] args) {
        System.out.println("Welcome-jin-world!");
        while (true) {
            System.out.println("\n0) exit program.");
            System.out.println("1) find the length of a number.");
            System.out.println("2) create pyramid.");
            System.out.println("3) create symmetry tree.");
            System.out.println("4) convert upper lower.");
            System.out.println("5) check palindromic number.");
            System.out.println("6) reverse output.");
            System.out.println("7) find max and min.");
            System.out.print("\nSelect homework : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num == 0) {
                System.out.print("Exit program");
                break;
            }
            if (num == 1) {
                System.out.println("\nThis program finds the length of the number you enter.");
                find_len();
                back_main();

            }
            if (num == 2) {
                System.out.println("\nThis program creates a pyramid of height entered by the user.");
                pyramid();
                back_main();
            }
            if (num == 3) {
                System.out.println("\nThis program creates a symmetry tree of height entered by the user.");
                symmetry();
                back_main();
            }
            if (num == 4) {
                System.out.println("\nThis program converts the first alphabet to uppercase and the rest to lowercase when the user enters an English word.");
                upperlower();
                back_main();
            }
            if (num == 5) {
                System.out.println("\nThis program verifies that the number user enter is a symmetric number.");
                palindromicnumber();
                back_main();
            }
            if (num == 6) {
                System.out.println("\nThis program prints the characters you enter backwards.");
                backward();
                back_main();
            }
            if (num == 7 ) {
                System.out.println("\nThis program finds the minimum and maximum values among the numbers you enter.");
                findminmaxval();
                back_main();
            }
        }
    }

    public static void back_main() {
        System.out.println("\n\nEnter any key to return to the main.");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
    return;
    }

    public static void find_len() {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        while (n > 0) {
            num++;
            n = n / 10;
        }
        System.out.println("The length of the number entered is " + num + ".");
    }

    public static void pyramid() {
        System.out.print("Enter the height of the pyramid : ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 0 ; i < height ; i++){
            for (int j = height - 1 ; j > i ; j--){
                System.out.print(" ");
            }
            for (int k = 0 ; k < 2 * i + 1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void symmetry(){
        System.out.print("Please enter height : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i < 2 * n + 1 ; i++){
            System.out.print("#");
        }
        System.out.println();
        for (int i = 0 ; i < n ; i++){
            System.out.print("#");
            for (int j = n - 1 ; j > i ; j--){
                System.out.print(" ");
            }
            for (int k = 0 ; k < 2 * i + 1 ; k++){
                System.out.print("*");
            }
            for (int j = n - 1 ; j > i ; j--){
                System.out.print(" ");
            }
            System.out.print("# \n");
        }
        for (int i = 0 ; i < n - 1 ; i++){
            System.out.print("#");
            for (int j = 0 ; j < i + 1 ; j++){
                System.out.print(" ");
            }
            for (int k = 2 * ( n - 1 ) ; k > 2 * i + 1 ; k--){
                System.out.print("*");
            }
            for (int j = 0 ; j < i + 1 ; j++){
                System.out.print(" ");
            }
            System.out.print("# \n");
        }
        for (int i = 0 ; i < 2 * n + 1 ; i++){
            System.out.print("#");
        }
    }

    public static void upperlower(){
        System.out.print("Enter English word : ");
        Scanner in = new Scanner(System.in);
        String eng = in.nextLine();
        System.out.print("Result is ");
        for (int i = 0 ; i < eng.length() ; i++){
            if (i == 0){
                System.out.print(eng.toUpperCase().charAt(i));
            }
            else {
                System.out.print(eng.toLowerCase().charAt(i));
            }
        }
        System.out.print(".");
    }

    public static void palindromicnumber() {
        boolean result = true;
        System.out.print("Enter number :");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int len = 0;
        int num_copy = num;
        while (num_copy > 0) {
            len++;
            num_copy = num_copy / 10;
        }
        if (len < 2 || num < 0) {
            System.out.println("Please enter a positive number with at least two digits.");
        }
        else {
            for (int i = 0; i < len / 2; i++) {
                if((int) (num / Math.pow(10, len - i - 1)) % 10 != (int) (num / Math.pow(10, i)) % 10){
                    result = false;
                    System.out.println("It is not a symmetric number.");
                    break;
                }
            }
            if (result == true) {
                System.out.println("It's a symmetrical number.");
            }
        }
    }

    public static void backward(){
        String temp = "";
        System.out.print("Enter array size : ");
        Scanner sc_size = new Scanner(System.in);
        int size = sc_size.nextInt();
        String[] arr = new String[size];// ???????????? ?????? ????????? ??????
        for (int i = 0 ; i < size ; i++){
            System.out.print("Enter text : ");
            Scanner sc_num = new Scanner(System.in);
            arr[i] = sc_num.nextLine();
        } // ????????? size ???????????? ????????? ??????
        System.out.print("Result : ");
        for (int i = 0 ; i < size / 2 ; i++){
            temp = arr[size - i - 1];
            arr[size - i - 1] = arr[i];
            arr[i] = temp; // ????????? ???????????? ??????
        }
        for (String i : arr){
            System.out.print(i + " ");
        }
    }

    public static void findminmaxval(){
        System.out.print("\nEnter array size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i < size ; i++){
            System.out.print("Enter number : ");
            Scanner sc_num = new Scanner(System.in);
            arr[i] = sc_num.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max:" + max + " Min:" + min);
    }
}


