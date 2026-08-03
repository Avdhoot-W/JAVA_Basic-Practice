import java.util.*;

class MinEleOfArray{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int min = Integer.MIN_VALUE;

        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++)
        {
          if(min > arr[i])
        {
            min = arr[i];
        }
        }
        System.out.println("Smallest element in the Array is: "+min);
        sc.close();
    }
}