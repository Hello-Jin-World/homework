public class test {
    public static void main(String[] args){
        for (int i = 0 ; i < 7 ; i++){
            System.out.print("#");
            if (i == 0 || i == 6) {
                for (int j = 0 ; j < 5 ; j++){
                    System.out.print("#");
                }
            }
            else if (i == 1 || i == 5) {
                for (int k = 0 ; k < 2 ; k++){
                    System.out.print(" ");
                }
                for (int k = 0 ; k < 1 ; k++){
                    System.out.print("*");
                }
                for (int k = 0 ; k < 2 ; k++){
                    System.out.print(" ");
                }
            }
            else if (i == 2 || i == 4) {
                for (int k = 0 ; k < 1 ; k++){
                    System.out.print(" ");
                }
                for (int k = 0 ; k < 3 ; k++){
                    System.out.print("*");
                }
                for (int k = 0 ; k < 1 ; k++){
                    System.out.print(" ");
                }
            }
            else if (i == 3) {
                for (int k = 0 ; k < 5 ; k++){
                    System.out.print("*");
                }
            }
            System.out.print("#");
            System.out.println();
        }
    }
}
