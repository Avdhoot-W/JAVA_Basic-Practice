import java.util.Scanner;
import java.lang.Math;

class CheckArmstrong{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int count = 0;
        
        while(num != 0)
        {
            num = num / 10;
            count++;
        }
        
        int sum = 0;
        while(num != 0)
        {
            int lastDigit = num % 10;
            sum = sum + (int)Math.pow(lastDigit,count);
            num = num / 10;
        }
        if(originalNum == sum)
            System.out.println("The given number "+num+ " is an Armstrong number. ");
        else{
             System.out.println("Not an Armstrong NUmber");
        }
        sc.close();
    }
}