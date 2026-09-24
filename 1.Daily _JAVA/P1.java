// int[] arr = {1, 3, 5, 7, 9, 12};
// int target = 10;

import java.util.*;

class P1{
    public static boolean hasSumTrue(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            int sum = arr[left] + arr[right];

            if(sum == target){
                return true;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Single Scanner for all input

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter sorted elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Target element: ");
        int target = sc.nextInt();

        // Call the method and directly print or check the boolean result
        boolean result = hasSumTrue(arr, target);

        if (result) {
            System.out.println("Result: Pair with sum " + target + " exists!");
        } else {
            System.out.println("Result: No pair found with sum " + target + ".");
        }

        sc.close();
    }
}