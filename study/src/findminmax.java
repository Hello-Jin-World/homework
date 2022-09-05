public class findminmax {
    public static void main(String[] args){
        int max = 0;
        int[] num = {0, -132, 32, 122, -55, 87, 91, -48, 77};
        int min = num[0];
        for (int i = 0 ; i < num.length - 1 ; i++){
            if (max < num[i]){
                max = num[i];
            }
            if (num[i+1] < min){
                min = num[i+1];
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }
}
