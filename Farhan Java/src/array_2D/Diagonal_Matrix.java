package array_2D;

public class Diagonal_Matrix {
    public static void main(String[] args) {

        int arr[][] = new int[][]{{2, 3, 4, 5}, {6, 7, 8, 9}, {3,56,7}};
        int arr2[][] = new int[][]{{4, 5, 21, 5}, {5, 33, 42, 7}, {5,6,22}};

        System.out.println("Array of 1: ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int sum=0, sum2=0, sum3=0;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (i == j)
                {
                    sum+= arr[i][j];

                }

                if (i<j)
                {
                    sum2+= arr[i][j];
                }

                if (i>j)
                {
                    sum3+= arr[i][j];
                }

            }
        }
        System.out.println("Sum of diagonal: "+sum);
        System.out.println("Sum of upper: "+sum2);
        System.out.println("Sum of lower: "+sum3);






    }
}