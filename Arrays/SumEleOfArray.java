import java.util.*;

class SumEleOfArray{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++)
        {
           sum =  sum + arr[i];
            
        }
        System.out.println("Sum of total elements of Array are: "+sum);
        sc.close();
    }
}