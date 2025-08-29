import java.util.Scanner;
public class Find_max_in_3_numbers {
   public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    System.out.println("enter 3 numbers: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();
    // let assusm num 1 is max
    int max = num1;
    if(num2 > max)
{
    max = num2;
}  if(num3 > max){
    max = num3;
}   
System.out.println("max number is: " + max);
input.close();
} 
}
