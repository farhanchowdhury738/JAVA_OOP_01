package array_1D;

public class ForEachLoop {
    public static void main(String[] args) {

        String name  [] = {"Hello","Hi","Hlw","How"};
        System.out.println("String Array: ");

        for(String s : name)
        {
            System.out.println(s);
        }
        System.out.println();

        int num[] = {3,4,5,67,2,76,3,6,2,4};
        int sum = 0;

        System.out.println("Int Array: ");
        for(int n : num)
        {
            System.out.print(n+" ");
            sum+=n;
        }
        System.out.println("\nSum: "+sum);

    }

}
