package array_2D;

public class array1 {
    public static void main(String[] args) {

        int arr [][] = new int [][] { {2,3,4,5}, {6,7,8,9} };

        for(int i=0; i<2; i++)
        {
            for (int j=0; j<4; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
