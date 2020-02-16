import java.util.Scanner;
public class MaxValueOfArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int a = 0,b = 0;
        int max = array[0][0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                if(max < array[i][j]){
                   a = i;
                   b = j;
                    //max = array[i][j];
                }
            }
        }
        System.out.println("position of Max value in array: "+ a +","+ b);
    }
}
