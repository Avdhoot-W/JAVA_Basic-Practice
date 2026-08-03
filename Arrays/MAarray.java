import java.util.*;

class MAarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter ELements in Array: ");
        for(int i = 0; i < arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given array is: ");
        for(int i = 0; i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");      
        }

        System.out.println("Newly Obtained Array isv : ");


        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i] % 2 == 0)
            {
                arr[i] += 10;
                System.out.print(arr[i] + " ");
            }
            else{
                arr[i] *= 2;
                System.out.print(arr[i] + " ");
                
            }
        }
        sc.close();
        
        
    }
}