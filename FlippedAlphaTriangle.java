import java.util.Scanner;

class FlippedAlphaTriangle
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = sc.nextInt();

       for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j + 96) + " ");
            }
        System.out.println();
        }
        sc.close();
    }
}