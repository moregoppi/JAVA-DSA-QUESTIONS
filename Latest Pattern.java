// 1***1
// *2*2*
// **3**
// *2*2*
// 1***1

public class Main
{
	public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j || i + j == n-1) {
                    System.out.print(i);
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
