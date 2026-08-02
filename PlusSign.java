import java.util.Scanner;

class PlusSign{
    public static void main(String []gooo)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int r_mid = (row / 2) + 1;
        int c_mid = (col / 2) + 1;

        for(int i = 1; i <= row ; i++)
        {
            for(int j =  -1; j <= col; j++)
            {
                if(i == r_mid || j == c_mid)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        sc.close();


    }
}