import java.util.*;

class ProdEleOfArray{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int product = 1;

        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++)
        {
           product = product * arr[i];
            
        }
        System.out.println("Product of all elements of Array is: "+product);
        sc.close();
    }
}