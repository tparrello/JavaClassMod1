import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        String sentence = scan.nextLine();
        for (i=0; i<99; i++) {
            System.out.println(i+1 + ". " + sentence);
        }
            
        // See Learn the Part for the instructions.
        scan.close();
    }
}
