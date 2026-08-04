import java.util.Scanner;

class TwoSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Given Array is : ");
         for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " " );
            
        }
        System.out.print("Enter target element to find : ");
        int target = sc.nextInt();
        int found = -1;

        for(int i = 0; i < size; i++)
        {
            for(int j = i + 1; j < size; j++)
            {
                if(arr[i] + arr[j] == target){
                     System.out.println("Two elements on indices "+i +" & " +j+" sum upto the target value "+target);
                     found = 1;
                }
            }
        }
        sc.close();
        
    }
}