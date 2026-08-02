import java.util.Scanner;

class PrintCharASCIIsmallCase{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print((char)(j+96)+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}