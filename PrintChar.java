import java.util.Scanner;

class PrintChar{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        

        for (int i = 1; i <= n; i++)
        {
            for (char j = 'a'; j <= 'q'; j++)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}