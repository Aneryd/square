import java.util.Scanner;

public class square {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number: ");
        double number = scan.nextDouble();

        double answer = squarePayment.sqrtPayment(number);
        System.out.println("Answer: " + answer);
    }
}
