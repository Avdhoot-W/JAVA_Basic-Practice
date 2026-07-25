import java.util.Scanner;
class Reverse{
    public static void main(String []args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int number = sc.nextInt();
        //int originalNum = number;
        int reverse = 0;

        while(number != 0){
            int digit  = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("The Reverse Number is: "+reverse);
        sc.close();

    }



}