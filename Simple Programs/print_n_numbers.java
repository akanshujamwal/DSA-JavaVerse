import java.util.Scanner;

public class print_n_numbers {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = n.nextInt();
        for(int i = 1 ; i<= num ; i++){
            System.out.println(i);
        }
        n.close();
    }
}
