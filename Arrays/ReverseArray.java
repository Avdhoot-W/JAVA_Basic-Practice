import java.util.Scanner;

class ReverseArray{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give size of Array in Integer: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];

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
        int j = 0; 
        for(int i = (arr.length - 1); i >= 0; i--)
        {
            temp[j] = arr[i];
            j++;
        }
       
        System.out.println("Reversed Array is: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(temp[i]+"  ");
        }

        
        sc.close();
    }
}