package array_2D;

public class Find_output2 {
    public static void main(String[] args) {


        int arr [][] = new int[4][5];
        int a=9;

        /*
        for(int i=0; i<4; i++)
        {
            for (int j=0; j<(i+1); j++)
            {
                arr[i][j] = a;
                a++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        */
        for(int i=0; i<(5-1); i++)
        {
            for (int j=0; j<(i+1); j++)
            {
                arr[i][j] = a;
                a--;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
