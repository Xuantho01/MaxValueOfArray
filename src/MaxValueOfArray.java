import java.util.Scanner;
public class MaxValueOfArray {
    public static void main(String[] args) {
        int total = 0;
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                total += array[i][j];
            }
        }
        System.out.println("total of array: "+total);
    }
}
