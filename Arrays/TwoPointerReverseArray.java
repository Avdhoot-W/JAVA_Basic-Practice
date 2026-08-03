import java.util.Scanner;

class TwoPointerReverseArray{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give size of Array in Integer: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        

        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Array is: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        int start = 0; 
        int end = arr.length - 1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        
       
        System.out.println("Reversed Array is: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }

        
        sc.close();
    }
}