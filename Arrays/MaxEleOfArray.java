import java.util.*;

class MaxEleOfArray{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = arr[0];

        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++)
        {
          if(max < arr[i])
        {
            max = arr[i];
        }
        }
        System.out.println("Largest element in the Array is: "+max);
        sc.close();
    }
}