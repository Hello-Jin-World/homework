public class findmissnum {
    public static void main(String[] args){
        boolean miss = true;
        int x = 0;
        int[] num = {-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = num[0] ; i < num[num.length-1] + 1 ; i++){
            if (i != num[x]){
                miss = false;
                System.out.println(i);
                break;
            }
            x++;
        }
        if (miss == true) {
            System.out.println("Nothing is missing.");
        }
    }
}
