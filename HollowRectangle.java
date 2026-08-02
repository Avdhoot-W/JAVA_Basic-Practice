import java.util.Scanner;

class HollowRectangle{
    public static void main(String []gooo)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i = 1; i<= row; i++)
        {
            for(int j = 1; j <= col; j++)
            {
                if(i == row || i == row - (row - 1)){
                    System.out.print("* ");
                }
                else if (j == col || j == col - (col - 1)) {
                    System.out.print("* ");
                }
                
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();


    }
}