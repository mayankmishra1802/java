import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {

        int [][] arr= new int[3][4]; //declaration of 2d array

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        int [][] brr={{1,2,3},{2,3,4},{5,6,7}}; //initialization 

        System.out.println(Arrays.toString(brr[0]));
        System.out.println(Arrays.toString(brr[1]));
        System.out.println(Arrays.toString(brr[2]));

        int [][] crr={{1,2,3},{2,3,4},{4,5,6}};
        int n=crr.length;
        int m=crr[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
