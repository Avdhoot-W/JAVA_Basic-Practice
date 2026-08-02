import java.util.Scanner;

class FlippedNumTrianglePrint{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        /*System.out.print("Enter number of columns: ");
        int col = sc.nextInt();*/
        

        for(int i = 1; i <= rows; i++)
        {
            for(int j = rows; j >= i; j--){
                int row = rows;
                System.out.print(((row + 1) - j) + " ");
                row--;
            }
            System.out.println();
        }
        sc.close();
    }
}