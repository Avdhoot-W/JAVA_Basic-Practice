import java.util.*;

class D2{
    
    public static boolean duplicate(int[] arr)
    {
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int num: arr){
            if(hset.contains(num))
            {
                return true;
            }
            hset.add(num);
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("how many elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter elements in the array:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array you entered is: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i]);
            System.out.print(" , ");
        }

        if(duplicate(arr))
        {
            System.out.println("the given array contains duplicate elements.");
        }
        else{
            System.out.println("No duplicate elements found!");
            
        }
        
        
    }
}

        
    
