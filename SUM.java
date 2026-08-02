import java.util.*;
class SUM{
    public static void main(String []sags)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit : ");
        int digit = sc.nextInt();
        int sum = 0;

        while(digit != 0)
        {
            int num = digit % 10;
            sum += num;
            digit = digit / 10;
        }
        System.out.println("Sum of all digits of a number is: "+sum);

        sc.close();
    }
}