import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Hi Timmy! Choose a number to count to:");
        int j = scan.nextInt();
        
        System.out.println("Great! Here's how it's done");
        for ( int i = 0; i<=j; i++) {
            System.out.print(i + " ");
        }
        // See Learn the Part for the instructions.

        scan.close();
    }
}
