import java.util.*;

class D3{
		public static int[] twoSum(int[] arr, int target)
		{
			HashMap<Integer, Integer> hset = new HashMap<>();
			for(int i = 0; i < arr.length; i++){
			int complement = target - arr[i];
			if(hset.containsKey(complement)){
				return new int[]{i,hset.get(complement)};
			}
			else{
				hset.put(arr[i],i);
			}
			}
			return new int[]{};
		}
		
		public static void main(String[] take)
		{
			Scanner sc = new Scanner(System.in);//Scanner obj for taking input elements.

			System.out.println("Enter array size: ");
			int size = sc.nextInt();

			int[] nums = new int[size];
			
			System.out.println("Enter elements in array");
			for(int i = 0; i < nums.length; i++)
			{
				nums[i] = sc.nextInt();
			}

			System.out.println("Given array elements are:");
			for(int i = 0; i < nums.length; i++)
			{
				System.out.print(nums[i]+" ");
			}
			System.out.println("What sum do you wish to find: ");
			int target = sc.nextInt();

			int[] res = twoSum(nums,target);
			System.out.println(Arrays.toString(res));
		}

}