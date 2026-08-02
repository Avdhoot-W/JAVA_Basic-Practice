import java.util.Scanner;

class AlphabetSquarePrint{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= row; j++)
            {
                System.out. print((char)(i + 64)+" ");
            }
            System.out.println();
        }
        sc.close();
    }

}