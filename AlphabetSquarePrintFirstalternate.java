import java.util.Scanner;

class AlphabetSquarePrintFirstalternate{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Character rows: ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= row; j++)
            {
                if(i / 1 == 1)
                {
                    System.out. print((char)(i + 96)+" ");
                }
                else{
                    System.out. print((char)(i + 64)+" ");

                }
            }
            System.out.println();
        }
        sc.close();
    }

}