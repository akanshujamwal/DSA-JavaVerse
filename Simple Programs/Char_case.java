import java.util.Scanner;

public class Char_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is in lowercase");

        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is in uppercase");

        } else {
            System.out.println(ch + " is not an alphabet");
        }
        input.close();

    }
}