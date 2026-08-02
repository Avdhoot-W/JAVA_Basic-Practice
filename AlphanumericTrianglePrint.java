import java.util.Scanner;

class AlphanumericTrianglePrint{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        /*System.out.print("Enter number of columns: ");
        int col = sc.nextInt();*/
        

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i ; j++ )
            {
                if(i % 2 == 0)
                    System.out.print((char)(i+64) + " ");
                else
                    System.out.print(j + " " );

            }
            System.out.println();
        }
        sc.close();
    }
}