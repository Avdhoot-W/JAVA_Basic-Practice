//Find target value in array

//import java.util.*;

class Search{
    public static void main(String[] args) {
        int[] arr = {12,34,54,2,4,567,54,13};
        int find = 13;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == find)
                System.out.println("Element found at index "+ i);
        }
        System.out.println("Element not found");

        
    }
}