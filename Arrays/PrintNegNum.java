import java.util.*;

class PrintNegNum{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        
        
        int arr[] = new int[n];

        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
                System.out.print(arr[i] + " ");
            
        }
        sc.close();
    }
}