public class findminmax {
    public static void main(String[] args){
        int[] num = {0, -132, 32, 122, -55, 87, 91, -48, 177};
        int max = num[0];
        int min = num[0];
        for (int i = 0 ; i < num.length ; i++){
            if (max < num[i]){
                max = num[i];
            }
            if (min > num[i]){
                min = num[i];
            }
        }
        System.out.println("Max:" + max + " Min:" + min);
    }
}
