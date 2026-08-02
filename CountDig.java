import java.util.*;

class CountDig{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0)
        {
            //int digit = num % 10;
            num = num / 10;
            count ++;
        }
        System.out.println("Total digits in this number are: "+count);

        sc.close();
    }

}